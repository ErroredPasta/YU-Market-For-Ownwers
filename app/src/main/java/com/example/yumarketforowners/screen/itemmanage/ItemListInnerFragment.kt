package com.example.yumarketforowners.screen.itemmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.os.bundleOf
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.screen.recyclerview.listener.itemmanage.ItemManageViewHolderListener
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.databinding.InnerFragmentItemListBinding
import com.example.yumarketforowners.extension.addItemDivider
import com.example.yumarketforowners.screen.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ItemListInnerFragment :
    BaseFragment<InnerFragmentItemListBinding>(),
    ItemManageContract.View {
    companion object {
        private const val AVAILABILITY_KEY = "AVAILABILITY_KEY"

        fun newInstance(available: Boolean) = ItemListInnerFragment().apply {
            arguments = bundleOf(AVAILABILITY_KEY to available)
        }
    }

    @Inject
    lateinit var presenter: ItemManageContract.Presenter

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

    override fun initState() = with(binding) {
        itemListRecyclerView.run {
            this.adapter = this@ItemListInnerFragment.adapter
            addItemDivider(LinearLayout.VERTICAL)
        }

        requestData()
    }

    fun requestData() {
        presenter.requestData(0)
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = InnerFragmentItemListBinding.inflate(inflater, container, false)

    override fun loading(show: Boolean) {
        // TODO: 2022.07.10 implement loading
    }

    override fun onRequestDataSuccess(items: List<ItemModel>) {
        adapter.submitList(items.filter { it.available == available })
    }

    override fun onRequestDataError(errorMessage: Int) {
        Toast.makeText(context, getText(errorMessage), Toast.LENGTH_SHORT).show()
    }
}