package com.example.yumarketforowners.data.model.reviewmanage

import com.example.yumarketforowners.adapter.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel

data class ReviewModel(
    override val id: Long,
    val writer: String
) : BaseModel(id, CellType.REVIEW_CELL)
