package com.example.yumarketforowners.data.model.itemmanage

import com.example.yumarketforowners.screen.recyclerview.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel

data class ItemModel(
    override val id: Long,
    val name: String,
    var count: Int,
    val price: Int,
    val saleRatio: Int,
    val imageUrl: String,
    var available: Boolean,
    var checkedForStateChange: Boolean = false,
    override val cellType: CellType = CellType.ITEM_CELL
) : BaseModel(id, cellType)
