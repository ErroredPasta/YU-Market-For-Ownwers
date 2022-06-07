package com.example.yumarketforowners.screen.reviewmanage

import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.data.repository.reviewmanage.ReviewOrChatRoomRepository
import javax.inject.Inject

class ReviewManagePresenter<M : BaseModel> @Inject constructor(
    private val view: ReviewManageContract.View<M>,
    private val repository: ReviewOrChatRoomRepository<M>
) : ReviewManageContract.Presenter<M> {

    @Suppress("UNCHECKED_CAST")
    override fun requestData(marketId: Long) {
        view.loading(show = true)
        // TODO: 2022.06.04 get all data by market id
        val result = repository.getAllByMarketId(marketId)
        view.loading(show = false)

        if (result is ReviewManageContract.State.Success<*>) {
            view.onRequestDataSuccess((result as ReviewManageContract.State.Success<M>).data)
        } else {
            view.onRequestDataError((result as ReviewManageContract.State.Error).errorString)
        }
    }
}