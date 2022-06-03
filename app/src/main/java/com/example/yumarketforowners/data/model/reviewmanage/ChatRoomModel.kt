package com.example.yumarketforowners.data.model.reviewmanage

import com.example.yumarketforowners.adapter.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel

data class ChatRoomModel(
    override val id: Long,
    val title: String
) : BaseModel(id, CellType.CHAT_ROOM_CELL)
