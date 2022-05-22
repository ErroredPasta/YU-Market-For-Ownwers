package com.example.yumarketforowners.data.repository.itemmanage

import com.example.yumarketforowners.data.model.ItemModel

class ItemManageRepositoryImpl : ItemManageRepository {
    private val testList = (1..10).map {
        ItemModel(
            id = it.toLong(),
            name = "name $it",
            price = it,
            imageUrl = "https://picsum.photos/200",
            available = it % 2 == 0
        )
    }

    override fun getItemsByAvailability(available: Boolean): List<ItemModel> =
        testList.filter { it.available }
}