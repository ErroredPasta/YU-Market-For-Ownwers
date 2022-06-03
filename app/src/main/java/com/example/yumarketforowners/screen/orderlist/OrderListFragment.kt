package com.example.yumarketforowners.screen.orderlist

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yumarketforowners.databinding.OrderListFragmentBinding
import com.example.yumarketforowners.screen.base.BaseFragment

class OrderListFragment : BaseFragment<OrderListFragmentBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): OrderListFragmentBinding = OrderListFragmentBinding.inflate(
        inflater, container, false
    )
}