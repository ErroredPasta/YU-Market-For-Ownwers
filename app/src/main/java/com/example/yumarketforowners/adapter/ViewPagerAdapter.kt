package com.example.yumarketforowners.adapter

import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.yumarketforowners.screen.base.BaseFragment

class ViewPagerAdapter(
    fragment: BaseFragment<*>,
    private val fragmentList: List<BaseFragment<*>>,
) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = fragmentList.size
    override fun createFragment(position: Int) = fragmentList[position]
}