package com.example.yumarketforowners.adapter.viewholder.reviewmanage

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.adapter.viewholder.BaseViewHolder
import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel
import com.example.yumarketforowners.databinding.ViewHolderChatRoomBinding

class ChatRoomViewHolder(
    binding: ViewHolderChatRoomBinding
) : BaseViewHolder<ViewHolderChatRoomBinding, ChatRoomModel>(binding) {
    override fun clear() {
        // TODO: 2022.05.30 clear image view
    }

    override fun bindData(model: ChatRoomModel) {
        super.bindData(model)
        binding.chatRoomModel = model
    }

    override fun bindListener(listener: AdapterListener) {
        // TODO: 2022.05.30 bind listener
    }
}