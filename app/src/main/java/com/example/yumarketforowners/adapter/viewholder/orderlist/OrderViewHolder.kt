package com.example.yumarketforowners.adapter.viewholder.orderlist

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.adapter.viewholder.BaseViewHolder
import com.example.yumarketforowners.data.model.orderlist.OrderModel
import com.example.yumarketforowners.databinding.ViewHolderOrderBinding

class OrderViewHolder(
    binding: ViewHolderOrderBinding
) : BaseViewHolder<ViewHolderOrderBinding, OrderModel>(binding) {
    override fun clear() {
        // TODO: 2022.06.05 clear view holder
    }

    override fun bindData(model: OrderModel) {
        super.bindData(model)
        binding.orderModel = model
    }

    override fun bindListener(listener: AdapterListener) {
        // TODO: 2022.06.05 bind click listener
    }
}