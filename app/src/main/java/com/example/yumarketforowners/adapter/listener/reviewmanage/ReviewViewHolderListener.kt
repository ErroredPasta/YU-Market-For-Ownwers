package com.example.yumarketforowners.adapter.listener.reviewmanage

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel

interface ReviewViewHolderListener : AdapterListener{
    fun onReplyClicked(review: ReviewModel)
}