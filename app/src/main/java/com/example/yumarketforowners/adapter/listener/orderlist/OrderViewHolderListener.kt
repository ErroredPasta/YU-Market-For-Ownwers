package com.example.yumarketforowners.adapter.listener.orderlist

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.data.model.orderlist.OrderModel

interface OrderViewHolderListener : AdapterListener {
    fun onTelePhoneNumberClicked(telePhoneNumber: String)
    fun onAcceptOrderButtonClicked(order: OrderModel)
    fun onRejectOrderButtonClicked(order: OrderModel)
    fun onDeliveryDoneButtonClicked(order: OrderModel)
}