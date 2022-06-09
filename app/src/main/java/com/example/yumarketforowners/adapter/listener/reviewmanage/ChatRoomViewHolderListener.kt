package com.example.yumarketforowners.adapter.listener.reviewmanage

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel

interface ChatRoomViewHolderListener : AdapterListener {
    fun onClicked(chatRoom: ChatRoomModel)
    fun onRemoveClicked(chatRoom: ChatRoomModel)
}