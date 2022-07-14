package com.example.yumarketforowners.screen.recyclerview.listener.reviewmanage

import com.example.yumarketforowners.screen.recyclerview.listener.AdapterListener
import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel

interface ChatRoomViewHolderListener : AdapterListener {
    fun onClicked(chatRoom: ChatRoomModel)
    fun onRemoveClicked(chatRoom: ChatRoomModel)
}