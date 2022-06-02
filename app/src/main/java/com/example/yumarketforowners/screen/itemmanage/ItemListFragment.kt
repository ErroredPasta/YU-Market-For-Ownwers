package com.example.yumarketforowners.screen.itemmanage

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.adapter.listener.itemmanage.ItemManageViewHolderListener
import com.example.yumarketforowners.adapter.viewholder.itemmanage.ItemViewHolder
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.databinding.ItemListFragmentBinding
import com.example.yumarketforowners.screen.base.BaseFragment

class ItemListFragment : BaseFragment<ItemListFragmentBinding>() {
    companion object {
        private const val AVAILABILITY_KEY = "AVAILABILITY_KEY"

        fun newInstance(available: Boolean) = ItemListFragment().apply {
            arguments = bundleOf(AVAILABILITY_KEY to available)
        }
    }

    private val adapter by lazy {
        ModelRecyclerAdapter<ItemModel, ItemViewHolder>(
            listOf(),
            object : ItemManageViewHolderListener {}
        )
    }

    private val available by lazy {
        requireArguments()[AVAILABILITY_KEY] as Boolean
    }

    var items = listOf<ItemModel>()
        set(value) {
            val filtered = value.filter {
                it.available == available
            }

            adapter.submitList(filtered)
            field = filtered
        }

    override fun initState() = with(binding) {
        itemListRecyclerView.adapter = adapter
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ItemListFragmentBinding.inflate(inflater, container, false)
}