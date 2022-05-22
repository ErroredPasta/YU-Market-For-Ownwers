package com.example.yumarketforowners.screen.itemmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yumarketforowners.databinding.ItemManageFragmentBinding
import com.example.yumarketforowners.screen.base.views.BaseFragmentView

class ItemManageFragmentView : BaseFragmentView<ItemManageFragmentBinding>() {
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ItemManageFragmentBinding.inflate(inflater, container, false)

//    private val adapter

    override fun initState() {
        super.initState()
        initViewPager()
    }

    private fun initViewPager() {
        val availability = arrayOf(true, false)

        val fragments = availability.map {
            ItemListFragmentPresenter.newInstance(it)
        }
    }
}