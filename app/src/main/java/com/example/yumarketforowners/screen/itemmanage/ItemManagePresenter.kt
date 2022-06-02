package com.example.yumarketforowners.screen.itemmanage

import com.example.yumarketforowners.data.repository.itemmanage.ItemManageRepository
import javax.inject.Inject

class  ItemManagePresenter @Inject constructor(
    private val view: ItemManageContract.View,
    private val itemManageRepository: ItemManageRepository
) : ItemManageContract.Presenter {

    override fun requestData() {
        view.loading(show = true)
        // TODO: 2022.05.27 get item by market id
        val result = itemManageRepository.getItemsByMarketId(0)
        view.loading(show = false)

        if (result is ItemManageContract.State.Success) {
            view.onRequestDataSuccess(result.items)
        } else {
            view.onRequestDataError((result as ItemManageContract.State.Error).errorMessage)
        }
    }
}