package com.example.yumarketforowners.data.model.itemmanage

import com.example.yumarketforowners.adapter.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel

data class ItemModel(
    override val id: Long,
    val name: String,
    val price: Int,
    val saleRatio: Int,
    val imageUrl: String,
    var available: Boolean,
    var checkedForStateChange: Boolean
) : BaseModel(id, CellType.ITEM_CELL)
