package com.example.yumarketforowners.screen.reviewmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yumarketforowners.adapter.ViewPagerAdapter
import com.example.yumarketforowners.databinding.ReviewManageFragmentBinding
import com.example.yumarketforowners.di.fragment.reviewmanage.ReviewManageComponent
import com.example.yumarketforowners.screen.base.BaseViewPagerFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReviewManageFragment : BaseViewPagerFragment<ReviewManageFragmentBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ReviewManageFragmentBinding =
        ReviewManageFragmentBinding.inflate(inflater, container, false)

    @Inject
    lateinit var builder: ReviewManageComponent.Builder

    override val innerFragments by lazy {
        ReviewOrChatRoomType.values().map {
            ReviewOrChatRoomListFragment.newInstance(it).apply {
                component = builder.fragment(this).build()
            }
        }
    }

    override val tabStrings by lazy {
        ReviewOrChatRoomType.values().map {
            it.tabString
        }
    }

    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun initState() {
        initViewPagerAndTabLayout(
            binding.reviewManageViewPager,
            binding.reviewManageTabLayout
        )

        requestData()
    }

    private fun requestData() {
        for (innerFragment in innerFragments) {
            innerFragment.requestData()
        }
    }
}