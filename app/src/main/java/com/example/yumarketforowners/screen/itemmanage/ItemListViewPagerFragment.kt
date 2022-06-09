package com.example.yumarketforowners.screen.itemmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.os.bundleOf
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.adapter.listener.itemmanage.ItemManageViewHolderListener
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.databinding.ViewPagerFragmentItemListBinding
import com.example.yumarketforowners.extension.addItemDivider
import com.example.yumarketforowners.screen.base.BaseFragment

class ItemListViewPagerFragment : BaseFragment<ViewPagerFragmentItemListBinding>() {
    companion object {
        private const val AVAILABILITY_KEY = "AVAILABILITY_KEY"

        fun newInstance(available: Boolean) = ItemListViewPagerFragment().apply {
            arguments = bundleOf(AVAILABILITY_KEY to available)
        }
    }

    private val adapter by lazy {
        ModelRecyclerAdapter<ItemModel>(
            listOf(),
            object : ItemManageViewHolderListener {
                override fun onEditItemButtonClick(item: ItemModel) {
                    // TODO: 2022.06.08 implement start edit item activity
                    Toast.makeText(context, "$item edit button clicked", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    private val available by lazy {
        requireArguments()[AVAILABILITY_KEY] as Boolean
    }

    var items = listOf<ItemModel>()
        set(value) {
            field = value.filter { it.available == available }
            adapter.submitList(field)
        }

    override fun initState() = with(binding) {
        itemListRecyclerView.run {
            this.adapter = this@ItemListViewPagerFragment.adapter
            addItemDivider(LinearLayout.VERTICAL)
        }

        adapter.submitList(items)
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ViewPagerFragmentItemListBinding.inflate(inflater, container, false)
}