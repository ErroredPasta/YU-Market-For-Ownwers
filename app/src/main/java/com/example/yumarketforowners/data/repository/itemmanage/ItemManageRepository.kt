package com.example.yumarketforowners.data.repository.itemmanage

import com.example.yumarketforowners.data.model.ItemModel

interface ItemManageRepository {
    fun getItemsByAvailability(available: Boolean): List<ItemModel>
}