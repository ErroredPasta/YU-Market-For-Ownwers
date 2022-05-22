package com.example.yumarketforowners.screen.orderlist

import com.example.yumarketforowners.screen.ViewType
import com.example.yumarketforowners.screen.base.presenters.BaseFragmentPresenter

class OrderListFragmentPresenter : BaseFragmentPresenter<OrderListFragmentView>() {
    override val viewType: ViewType = ViewType.ORDER_LIST_FRAGMENT_VIEW
}