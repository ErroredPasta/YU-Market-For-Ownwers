package com.example.yumarketforowners.data.repository.reviewmanage

import com.example.yumarketforowners.data.model.BaseModel

interface ReviewOrChatRoomRepository<M : BaseModel> {
    fun getAll(marketId: Long): List<M>
}