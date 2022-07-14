package com.example.yumarketforowners.screen.recyclerview.viewholder.orderlist

import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.screen.recyclerview.listener.AdapterListener
import com.example.yumarketforowners.screen.recyclerview.listener.orderlist.OrderViewHolderListener
import com.example.yumarketforowners.screen.recyclerview.viewholder.BaseViewHolder
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.data.model.orderlist.OrderModel
import com.example.yumarketforowners.databinding.ViewHolderOrderBinding

class OrderViewHolder(
    binding: ViewHolderOrderBinding
) : BaseViewHolder<ViewHolderOrderBinding, OrderModel>(binding) {

    override fun bindData(model: OrderModel) {
        super.bindData(model)
        binding.orderModel = model
        binding.orderItemRecyclerView.adapter = ModelRecyclerAdapter<ItemModel>(
            model.orderItems
        )
    }

    override fun bindListener(listener: AdapterListener) {
        if (listener is OrderViewHolderListener) {
            binding.listener = listener
        }
    }
}