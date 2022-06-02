package com.example.yumarketforowners.adapter.viewholder.itemmanage

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.adapter.viewholder.BaseViewHolder
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.databinding.ItemViewHolderBinding

class ItemViewHolder(
    binding: ItemViewHolderBinding
) : BaseViewHolder<ItemViewHolderBinding, ItemModel>(binding) {
    override fun clear() {
        // TODO: 2022.05.30 clear image view
    }

    override fun bindData(model: ItemModel) {
        super.bindData(model)
        binding.itemModel = model
    }

    override fun bindListener(listener: AdapterListener) {
        // TODO: 2022.05.30 bind listener
    }
}