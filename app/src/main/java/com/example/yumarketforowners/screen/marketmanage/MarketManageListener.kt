package com.example.yumarketforowners.screen.marketmanage

import com.example.yumarketforowners.data.model.marketmanage.UserModel

interface MarketManageListener {
    fun onEditProfileClicked(user: UserModel)

    // TODO: 2022.06.10 define parameters
    fun onEditMarketClicked()
    fun onManageScheduleClicked()
    fun onManageReviewClicked()
    fun onNoticeClicked()
    fun onServiceCenterClicked()
    fun onSettingClicked()
}