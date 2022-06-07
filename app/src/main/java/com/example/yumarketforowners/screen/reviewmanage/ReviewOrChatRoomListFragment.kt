package com.example.yumarketforowners.screen.reviewmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.adapter.listener.reviewmanage.ReviewManageViewHolderListener
import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel
import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel
import com.example.yumarketforowners.databinding.ReviewOrChatRoomListFragmentBinding
import com.example.yumarketforowners.di.fragment.reviewmanage.ReviewManageComponent
import com.example.yumarketforowners.di.fragment.reviewmanage.ReviewManageEntryPoint
import com.example.yumarketforowners.screen.base.BaseFragment
import dagger.hilt.EntryPoints

class ReviewOrChatRoomListFragment<M : BaseModel> :
    BaseFragment<ReviewOrChatRoomListFragmentBinding>(),
    ReviewManageContract.View<M> {

    companion object {
        private const val TYPE_KEY = "TYPE_KEY"

        fun newInstance(type: ReviewOrChatRoomType) = if (type == ReviewOrChatRoomType.REVIEW) {
            ReviewOrChatRoomListFragment<ReviewModel>()
        } else {
            ReviewOrChatRoomListFragment<ChatRoomModel>()
        }.apply {
            arguments = bundleOf(TYPE_KEY to type)
        }
    }

    lateinit var data: List<M>

    lateinit var component: ReviewManageComponent
    private val presenter by lazy {
        EntryPoints.get(component, ReviewManageEntryPoint::class.java).run {
            if (fragmentType == ReviewOrChatRoomType.REVIEW) {
                getReviewPresenter()
            } else {
                getChatRoomPresenter()
            }
        }
    }

    private val fragmentType by lazy {
        requireArguments()[TYPE_KEY] as ReviewOrChatRoomType
    }

    private val adapter by lazy {
        ModelRecyclerAdapter<M>(
            listOf(), object : ReviewManageViewHolderListener {}
        )
    }

    override fun initState() {
        binding.reviewOrChatRoomListRecyclerView.adapter = adapter
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ReviewOrChatRoomListFragmentBinding.inflate(inflater, container, false)

    fun requestData() {
//        if (!::data.isInitialized) {
//            presenter.requestData()
//        } else {
//            onRequestDataSuccess(data)
//        }

        // TODO: 2022.06.05 request data using market id
        presenter.requestData(0)
    }

    override fun loading(show: Boolean) {
        // TODO: 2022.06.04 handle loading
    }

    override fun onRequestDataSuccess(data: List<M>) {
        this.data = data
        adapter.submitList(data)
    }

    override fun onRequestDataError(errorMessage: Int) {
        TODO("Not yet implemented")
    }
}