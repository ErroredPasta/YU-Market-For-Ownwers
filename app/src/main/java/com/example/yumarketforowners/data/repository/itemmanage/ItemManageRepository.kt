package com.example.yumarketforowners.data.repository.itemmanage

import com.example.yumarketforowners.screen.itemmanage.ItemManageContract

interface ItemManageRepository {
    fun getItemsByMarketId(marketId: Long): ItemManageContract.State
}