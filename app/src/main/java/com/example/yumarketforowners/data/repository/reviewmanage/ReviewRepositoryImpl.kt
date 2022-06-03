package com.example.yumarketforowners.data.repository.reviewmanage

import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel
import javax.inject.Inject

class ReviewRepositoryImpl @Inject constructor() : ReviewOrChatRoomRepository<ReviewModel> {
    private val testList = (0..9).map {
        ReviewModel(
            id = it.toLong(),
            writer = "writer $it"
        )
    }

    override fun getAll(marketId: Long): List<ReviewModel> = testList
}