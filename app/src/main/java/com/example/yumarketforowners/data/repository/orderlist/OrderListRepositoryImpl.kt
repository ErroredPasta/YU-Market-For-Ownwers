package com.example.yumarketforowners.data.repository.orderlist

import com.example.yumarketforowners.data.model.orderlist.OrderModel
import com.example.yumarketforowners.screen.orderlist.OrderListContract.State
import com.example.yumarketforowners.screen.orderlist.OrderType
import javax.inject.Inject


class OrderListRepositoryImpl @Inject constructor() : OrderListRepository {
    private val testList
        get() = (0..9).map {
            OrderModel(
                id = it.toLong(),
                orderId = "order $it",
                orderType = OrderType.values()[it % 3]
            )
        }

    override fun getOrderListByMarketId(marketId: Long): State =
        State.Success(data = testList)
}