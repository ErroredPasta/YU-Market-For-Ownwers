package com.example.yumarketforowners.data.repository.orderlist

import com.example.yumarketforowners.screen.orderlist.OrderListContract

interface OrderListRepository {
    fun getOrderListByMarketId(marketId: Long): OrderListContract.State
}