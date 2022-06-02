package com.example.yumarketforowners.adapter.viewholder

import androidx.annotation.LayoutRes
import com.example.yumarketforowners.R
import com.example.yumarketforowners.adapter.viewholder.itemmanage.ItemViewHolder
import com.example.yumarketforowners.adapter.viewholder.reviewmanage.ChatRoomViewHolder
import com.example.yumarketforowners.adapter.viewholder.reviewmanage.ReviewViewHolder
import kotlin.reflect.KClass

enum class CellType(
    val clazz: KClass<*>,
    @LayoutRes val layoutId: Int
) {
    ITEM_CELL(ItemViewHolder::class, R.layout.item_view_holder),
    REVIEW_CELL(ReviewViewHolder::class, R.layout.review_view_holder),
    CHAT_ROOM_CELL(ChatRoomViewHolder::class, R.layout.chat_room_view_holder),
}
