package com.example.yumarketforowners.screen.base

import androidx.viewbinding.ViewBinding
import androidx.viewpager2.widget.ViewPager2
import com.example.yumarketforowners.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

abstract class BaseViewPagerFragment<VB : ViewBinding> : BaseFragment<VB>() {

    protected abstract val innerFragments: List<BaseFragment<*>>
    protected abstract val tabStrings: List<String>
    protected lateinit var viewPagerAdapter: ViewPagerAdapter

    protected fun initViewPagerAndTabLayout(viewPager: ViewPager2, tabLayout: TabLayout) {
        if (!::viewPagerAdapter.isInitialized) {
            viewPagerAdapter = ViewPagerAdapter(this, innerFragments)

            viewPager.run {
                this.adapter = this@BaseViewPagerFragment.viewPagerAdapter
                offscreenPageLimit = innerFragments.size
            }

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = tabStrings[position]
            }.attach()
        }
    }
}