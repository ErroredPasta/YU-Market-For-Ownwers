package com.example.yumarketforowners.data.repository.reviewmanage

import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.screen.reviewmanage.ReviewManageContract

interface ReviewOrChatRoomRepository<M : BaseModel> {
    fun getAllByMarketId(marketId: Long): ReviewManageContract.State
}