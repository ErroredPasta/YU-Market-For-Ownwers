package com.example.yumarketforowners.screen.itemmanage

import androidx.annotation.StringRes
import com.example.yumarketforowners.data.model.itemmanage.ItemModel

interface ItemManageContract {
    interface View {
        fun loading(show: Boolean)
        fun onRequestDataSuccess(items: List<ItemModel>)
        fun onRequestDataError(@StringRes errorMessage: Int)
    }

    interface Presenter {
        fun requestData(marketId: Long)
    }

    sealed class State {
        data class Success(
            val items: List<ItemModel>
        ) : State()

        data class Error(
            @StringRes val errorMessage: Int
        ) : State()
    }
}