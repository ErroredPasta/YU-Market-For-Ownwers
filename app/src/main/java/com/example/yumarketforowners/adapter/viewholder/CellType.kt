package com.example.yumarketforowners.adapter.viewholder

import androidx.annotation.LayoutRes
import com.example.yumarketforowners.R
import com.example.yumarketforowners.adapter.viewholder.itemmanage.ItemViewHolder
import com.example.yumarketforowners.adapter.viewholder.orderlist.OrderViewHolder
import com.example.yumarketforowners.adapter.viewholder.reviewmanage.ChatRoomViewHolder
import com.example.yumarketforowners.adapter.viewholder.reviewmanage.ReviewViewHolder
import kotlin.reflect.KClass

enum class CellType(
    val clazz: KClass<*>,
    @LayoutRes val layoutId: Int
) {
    ITEM_CELL(ItemViewHolder::class, R.layout.view_holder_item),
    REVIEW_CELL(ReviewViewHolder::class, R.layout.view_holder_review),
    CHAT_ROOM_CELL(ChatRoomViewHolder::class, R.layout.view_holder_chat_room),
    ORDER_CELL(OrderViewHolder::class, R.layout.view_holder_order),
}
