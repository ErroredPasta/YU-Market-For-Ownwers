package com.example.yumarketforowners.screen.reviewmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yumarketforowners.databinding.FragmentReviewManageBinding
import com.example.yumarketforowners.screen.base.BaseViewPagerFragment
import com.example.yumarketforowners.screen.reviewmanage.innerfragment.BaseReviewInnerFragment

class ReviewManageFragment :
    BaseViewPagerFragment<FragmentReviewManageBinding, BaseReviewInnerFragment<*>>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentReviewManageBinding =
        FragmentReviewManageBinding.inflate(inflater, container, false)


    override val tabStrings by lazy {
        ReviewOrChatRoomType.values().map {
            it.tabString
        }
    }

    override fun initState() {
        initViewPagerAndTabLayout(
            binding.reviewManageViewPager,
            binding.reviewManageTabLayout,
            ReviewOrChatRoomType.values().map {
                BaseReviewInnerFragment.newInstance(it)
            }
        )
    }
}