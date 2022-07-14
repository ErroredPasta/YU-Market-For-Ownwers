package com.example.yumarketforowners.screen.recyclerview.viewholder.reviewmanage

import com.example.yumarketforowners.screen.recyclerview.listener.AdapterListener
import com.example.yumarketforowners.screen.recyclerview.listener.reviewmanage.ChatRoomViewHolderListener
import com.example.yumarketforowners.screen.recyclerview.viewholder.BaseViewHolder
import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel
import com.example.yumarketforowners.databinding.ViewHolderChatRoomBinding
import com.example.yumarketforowners.extension.clear

class ChatRoomViewHolder(
    binding: ViewHolderChatRoomBinding
) : BaseViewHolder<ViewHolderChatRoomBinding, ChatRoomModel>(binding) {
    override fun clear() {
        binding.chatRoomOpponentImage.clear()
    }

    override fun bindData(model: ChatRoomModel) {
        super.bindData(model)
        binding.chatRoomModel = model
    }

    override fun bindListener(listener: AdapterListener) {
        if (listener is ChatRoomViewHolderListener) {
            binding.listener = listener
        }
    }
}