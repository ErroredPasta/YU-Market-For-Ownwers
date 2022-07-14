package com.example.yumarketforowners.data.model.reviewmanage

import com.example.yumarketforowners.screen.recyclerview.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.data.model.orderlist.OrderModel

data class ReviewModel(
    override val id: Long,
    val writer: String,
    val profileImageUrl: String,
    val content: String,
    val order: OrderModel,
    val writeTime: Long,
    val reply: ReplyModel? = null
) : BaseModel(id, CellType.REVIEW_CELL)
