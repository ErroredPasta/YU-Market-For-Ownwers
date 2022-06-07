package com.example.yumarketforowners.data.model.orderlist

import com.example.yumarketforowners.adapter.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.screen.orderlist.OrderType

data class OrderModel(
    override val id: Long,
    val orderId: String,
    var orderType: OrderType
) : BaseModel(id, CellType.ORDER_CELL)