package com.example.yumarketforowners.adapter.viewholder.reviewmanage

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.adapter.listener.reviewmanage.ChatRoomViewHolderListener
import com.example.yumarketforowners.adapter.viewholder.BaseViewHolder
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