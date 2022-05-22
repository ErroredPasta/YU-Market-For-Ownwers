package com.example.yumarketforowners.screen.itemmanage

import com.example.yumarketforowners.data.model.ItemModel
import com.example.yumarketforowners.databinding.ItemListFragmentBinding
import com.example.yumarketforowners.screen.base.mvp.BaseObservableView
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

class ItemListFragmentView(
    binding: ItemListFragmentBinding
) : BaseObservableView<ItemListFragmentBinding, ItemListFragmentView.Listener>(binding) {
    interface Listener {
        fun onDataRequest()
    }

    private val itemAdapter = ItemAdapter<ItemModel>()
    private val fastAdapter = FastAdapter.with(itemAdapter)

    var items = listOf<ItemModel>()
        set(value) {
            itemAdapter.set(value)
            field = value
        }

    init {
        with(binding) {
            itemListRecyclerView.adapter = fastAdapter
        }

        requestData()
    }

    private fun requestData() {
        for (listener in listeners) {
            listener.onDataRequest()
        }
    }
}