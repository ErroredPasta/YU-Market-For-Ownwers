package com.example.yumarketforowners.data.repository.itemmanage

import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.screen.itemmanage.ItemManageContract.State
import javax.inject.Inject

class ItemManageRepositoryImpl @Inject constructor() : ItemManageRepository {
    private val testList
        get() = (0..9).map {
            ItemModel(
                id = it.toLong(),
                name = "name $it",
                price = it,
                imageUrl = "https://picsum.photos/200",
                saleRatio = it,
                available = it % 2 == 0,
                checkedForStateChange = false
            )
        }

    override fun getItemsByMarketId(marketId: Long): State = State.Success(items = testList)
}