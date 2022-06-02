package com.example.yumarketforowners.data.model.itemmanage

import com.example.yumarketforowners.adapter.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel

data class ItemModel(
    override val id: Long,
    val name: String,
    val price: Int,
    val imageUrl: String,
    val available: Boolean
) : BaseModel(id, CellType.ITEM_CELL)
