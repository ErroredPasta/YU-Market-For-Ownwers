package com.example.yumarketforowners.screen.recyclerview.listener.reviewmanage

import com.example.yumarketforowners.screen.recyclerview.listener.AdapterListener
import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel

interface ReviewViewHolderListener : AdapterListener{
    fun onReplyClicked(review: ReviewModel)
}