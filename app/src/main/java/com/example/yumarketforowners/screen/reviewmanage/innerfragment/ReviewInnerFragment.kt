package com.example.yumarketforowners.screen.reviewmanage.innerfragment

import android.widget.Toast
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.screen.recyclerview.listener.reviewmanage.ReviewViewHolderListener
import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel
import com.example.yumarketforowners.screen.reviewmanage.ReviewManageContract
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReviewInnerFragment : BaseReviewInnerFragment<ReviewModel>() {
    @Inject
    lateinit var presenter: ReviewManageContract.Presenter<ReviewModel>

    override val adapter: ModelRecyclerAdapter<ReviewModel> by lazy {
        ModelRecyclerAdapter(
            emptyList(),
            object : ReviewViewHolderListener {
                override fun onReplyClicked(review: ReviewModel) {
                    Toast.makeText(context, "$review reply clicked", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    override fun requestData() {
        // TODO: 2022.07.10 request by market id
        presenter.requestData(0)
    }
}
