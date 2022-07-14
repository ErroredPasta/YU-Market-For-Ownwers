package com.example.yumarketforowners.screen.recyclerview.viewholder.itemmanage

import com.example.yumarketforowners.screen.recyclerview.listener.AdapterListener
import com.example.yumarketforowners.screen.recyclerview.listener.itemmanage.ItemManageViewHolderListener
import com.example.yumarketforowners.screen.recyclerview.viewholder.BaseViewHolder
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.databinding.ViewHolderItemBinding

class ItemViewHolder(
    binding: ViewHolderItemBinding
) : BaseViewHolder<ViewHolderItemBinding, ItemModel>(binding) {
    override fun clear() {
        // TODO: 2022.05.30 clear image view
    }

    override fun bindData(model: ItemModel) {
        super.bindData(model)
        binding.itemModel = model
    }

    override fun bindListener(listener: AdapterListener) {
        if (listener is ItemManageViewHolderListener) {
            binding.listener = listener
        }
    }
}