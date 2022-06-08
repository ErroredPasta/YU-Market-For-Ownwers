package com.example.yumarketforowners.adapter.viewholder.reviewmanage

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.adapter.viewholder.BaseViewHolder
import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel
import com.example.yumarketforowners.databinding.ViewHolderReviewBinding

class ReviewViewHolder(
    binding: ViewHolderReviewBinding
) : BaseViewHolder<ViewHolderReviewBinding, ReviewModel>(binding) {
    override fun clear() {
        // TODO: 2022.05.30 clear image view
    }

    override fun bindData(model: ReviewModel) {
        super.bindData(model)
        binding.reviewModel = model
    }

    override fun bindListener(listener: AdapterListener) {
        // TODO: 2022.05.30 bind listener
    }
}