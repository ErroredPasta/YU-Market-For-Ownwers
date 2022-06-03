package com.example.yumarketforowners.data.repository.reviewmanage

import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel
import javax.inject.Inject

class ChatRoomRepositoryImpl @Inject constructor() : ReviewOrChatRoomRepository<ChatRoomModel> {
    private val testList = (0..9).map {
        ChatRoomModel(
            id = it.toLong(),
            title = "chat room $it"
        )
    }

    override fun getAll(marketId: Long): List<ChatRoomModel> = testList
}