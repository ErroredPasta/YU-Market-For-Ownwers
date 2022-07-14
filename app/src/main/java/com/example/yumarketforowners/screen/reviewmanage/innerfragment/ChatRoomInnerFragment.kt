package com.example.yumarketforowners.screen.reviewmanage.innerfragment

import android.widget.Toast
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.screen.recyclerview.listener.reviewmanage.ChatRoomViewHolderListener
import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel
import com.example.yumarketforowners.screen.reviewmanage.ReviewManageContract
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ChatRoomInnerFragment : BaseReviewInnerFragment<ChatRoomModel>() {
    @Inject
    lateinit var presenter: ReviewManageContract.Presenter<ChatRoomModel>

    override val adapter: ModelRecyclerAdapter<ChatRoomModel> by lazy {
        ModelRecyclerAdapter(
            emptyList(),
            object : ChatRoomViewHolderListener {
                override fun onClicked(chatRoom: ChatRoomModel) {
                    // TODO: 2022.07.10 start chat room activity
                    Toast.makeText(context, "$chatRoom clicked", Toast.LENGTH_SHORT).show()
                }

                override fun onRemoveClicked(chatRoom: ChatRoomModel) {
                    // TODO: 2022.07.10 handle remove
                    Toast.makeText(context, "$chatRoom remove clicked", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    override fun requestData() {
        // TODO: 2022.07.10 request by market id
        presenter.requestData(0)
    }
}