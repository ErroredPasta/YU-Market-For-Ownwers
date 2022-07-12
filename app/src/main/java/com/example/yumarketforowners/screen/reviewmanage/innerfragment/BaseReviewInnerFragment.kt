package com.example.yumarketforowners.screen.reviewmanage.innerfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.StringRes
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.databinding.ViewPagerFragmentReviewOrChatRoomListBinding
import com.example.yumarketforowners.extension.addItemDivider
import com.example.yumarketforowners.screen.base.BaseFragment
import com.example.yumarketforowners.screen.reviewmanage.ReviewManageContract
import com.example.yumarketforowners.screen.reviewmanage.ReviewOrChatRoomType

abstract class BaseReviewInnerFragment<M : BaseModel> :
    BaseFragment<ViewPagerFragmentReviewOrChatRoomListBinding>(),
    ReviewManageContract.View<M> {

    companion object {
        fun newInstance(type: ReviewOrChatRoomType) = if (type == ReviewOrChatRoomType.REVIEW) {
            ReviewInnerFragment()
        } else {
            ChatRoomInnerFragment()
        }
    }

    protected abstract val adapter: ModelRecyclerAdapter<M>

    override fun initState() {
        binding.reviewOrChatRoomListRecyclerView.run {
            this.adapter = this@BaseReviewInnerFragment.adapter
            addItemDivider(LinearLayout.VERTICAL)
        }

        requestData()
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ViewPagerFragmentReviewOrChatRoomListBinding.inflate(inflater, container, false)

    abstract fun requestData()

    override fun loading(show: Boolean) {
        // TODO: 2022.06.04 handle loading
    }

    override fun onRequestDataSuccess(data: List<M>) {
        adapter.submitList(data)
    }

    override fun onRequestDataError(@StringRes errorMessage: Int) {
        Toast.makeText(context, getText(errorMessage), Toast.LENGTH_SHORT).show()
    }
}