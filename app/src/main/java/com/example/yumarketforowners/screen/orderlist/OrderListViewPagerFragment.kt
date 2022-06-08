package com.example.yumarketforowners.screen.orderlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.adapter.listener.orderlist.OrderViewHolderListener
import com.example.yumarketforowners.data.model.orderlist.OrderModel
import com.example.yumarketforowners.databinding.ViewPagerFragmentOrderListBinding
import com.example.yumarketforowners.screen.base.BaseFragment

class OrderListViewPagerFragment : BaseFragment<ViewPagerFragmentOrderListBinding>() {
    companion object {
        private const val ORDER_TYPE_KEY = "ORDER_TYPE_KEY"

        fun newInstance(orderType: OrderType) = OrderListViewPagerFragment().apply {
            arguments = bundleOf(ORDER_TYPE_KEY to orderType)
        }
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ViewPagerFragmentOrderListBinding.inflate(inflater, container, false)

    private val orderType by lazy {
        requireArguments()[ORDER_TYPE_KEY] as OrderType
    }

    private val adapter by lazy {
        ModelRecyclerAdapter<OrderModel>(
            listOf(), object : OrderViewHolderListener {}
        )
    }

    var orders: List<OrderModel> = listOf()
        set(value) {
            field = value.filter { it.orderType == orderType }
            adapter.submitList(field)
        }

    override fun initState() {
        binding.orderListRecyclerView.adapter = adapter

        adapter.submitList(orders)
    }
}