package com.example.yumarketforowners.screen.recyclerview.listener.orderlist

import com.example.yumarketforowners.screen.recyclerview.listener.AdapterListener
import com.example.yumarketforowners.data.model.orderlist.OrderModel

interface OrderViewHolderListener : AdapterListener {
    fun onTelePhoneNumberClicked(telePhoneNumber: String)
    fun onAcceptOrderButtonClicked(order: OrderModel)
    fun onRejectOrderButtonClicked(order: OrderModel)
    fun onDeliveryDoneButtonClicked(order: OrderModel)
}