package com.example.yumarketforowners.screen.reviewmanage

import androidx.annotation.StringRes
import com.example.yumarketforowners.data.model.BaseModel

interface ReviewManageContract {
    interface View {

    }

    interface Presenter<M : BaseModel> {
        fun requestData()
    }

    sealed class State {
        data class Success<M : BaseModel>(
            val models: List<M>
        ) : State()

        data class Error(
            @StringRes val errorString: Int
        ) : State()
    }
}