package com.example.yumarketforowners.screen.reviewmanage

import androidx.annotation.StringRes
import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.data.model.itemmanage.ItemModel

interface ReviewManageContract {
    interface View<M : BaseModel> {
        fun loading(show: Boolean)
        fun onRequestDataSuccess(data: List<M>)
        fun onRequestDataError(@StringRes errorMessage: Int)
    }

    interface Presenter<M : BaseModel> {
        fun requestData(marketId: Long)
    }

    sealed class State {
        data class Success<M : BaseModel>(
            val data: List<M>
        ) : State()

        data class Error(
            @StringRes val errorString: Int
        ) : State()
    }
}