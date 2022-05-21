package com.example.yumarketforowners.screen

import androidx.annotation.LayoutRes
import com.example.yumarketforowners.R
import com.example.yumarketforowners.screen.itemmanage.ItemManageFragmentView
import com.example.yumarketforowners.screen.marketmanage.MarketManageFragmentView
import com.example.yumarketforowners.screen.orderlist.OrderListFragmentView
import com.example.yumarketforowners.screen.reviewmanage.ReviewManageFragmentView
import kotlin.reflect.KClass

enum class ViewType(
    val clazz: KClass<*>,
    @LayoutRes val layoutId: Int
) {
    MAIN_ACTIVITY_VIEW(MainActivityView::class, R.layout.activity_main),

    ITEM_MANAGE_FRAGMENT_VIEW(ItemManageFragmentView::class, R.layout.item_manage_fragment),
    MARKET_MANAGE_FRAGMENT_VIEW(MarketManageFragmentView::class, R.layout.market_manage_fragment),
    ORDER_LIST_FRAGMENT_VIEW(OrderListFragmentView::class, R.layout.order_list_fragment),
    REVIEW_MANAGE_FRAGMENT_VIEW(ReviewManageFragmentView::class, R.layout.review_manage_fragment),

    ;

    operator fun component1() = this.clazz
    operator fun component2() = this.layoutId
}