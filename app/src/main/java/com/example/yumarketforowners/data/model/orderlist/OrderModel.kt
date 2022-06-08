package com.example.yumarketforowners.data.model.orderlist

import com.example.yumarketforowners.adapter.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.screen.orderlist.OrderState

data class OrderModel(
    override val id: Long,
    val orderId: String,
    val orderItems: List<ItemModel>,
    val deliveryType: DeliveryType,
    val orderTime: Long,
    val telePhoneNumber: String,
    val request: String,
    var orderState: OrderState
) : BaseModel(id, CellType.ORDER_CELL)