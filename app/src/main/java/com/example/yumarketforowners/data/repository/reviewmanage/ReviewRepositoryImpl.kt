package com.example.yumarketforowners.data.repository.reviewmanage

import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel
import com.example.yumarketforowners.screen.reviewmanage.ReviewManageContract.State
import javax.inject.Inject

class ReviewRepositoryImpl @Inject constructor() : ReviewOrChatRoomRepository<ReviewModel> {
    private val testList get() = (0..9).map {
        ReviewModel(
            id = it.toLong(),
            writer = "writer $it"
        )
    }

    override fun getAllByMarketId(marketId: Long): State = State.Success(data = testList)
}