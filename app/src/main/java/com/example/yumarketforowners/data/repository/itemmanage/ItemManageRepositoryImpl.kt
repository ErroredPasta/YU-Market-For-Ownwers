package com.example.yumarketforowners.data.repository.itemmanage

import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.screen.itemmanage.ItemManageContract
import javax.inject.Inject

class ItemManageRepositoryImpl @Inject constructor() : ItemManageRepository {
    private val testList = (1..10).map {
        ItemModel(
            id = it.toLong(),
            name = "name $it",
            price = it,
            imageUrl = "https://picsum.photos/200",
            available = it % 2 == 0
        )
    }

    override fun getItemsByMarketId(marketId: Long): ItemManageContract.State =
        ItemManageContract.State.Success(items = testList)
}