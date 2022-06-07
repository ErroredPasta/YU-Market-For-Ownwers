package com.example.yumarketforowners.di.fragment.reviewmanage

import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel
import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel
import com.example.yumarketforowners.screen.reviewmanage.ReviewManageContract
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@InstallIn(ReviewManageComponent::class)
interface ReviewManageEntryPoint {
    fun getReviewPresenter(): ReviewManageContract.Presenter<ReviewModel>
    fun getChatRoomPresenter(): ReviewManageContract.Presenter<ChatRoomModel>
}