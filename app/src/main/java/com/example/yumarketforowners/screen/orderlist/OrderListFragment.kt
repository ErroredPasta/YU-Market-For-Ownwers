package com.example.yumarketforowners.screen.orderlist

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yumarketforowners.data.model.orderlist.OrderModel
import com.example.yumarketforowners.databinding.FragmentOrderListBinding
import com.example.yumarketforowners.screen.base.BaseViewPagerFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OrderListFragment : BaseViewPagerFragment<FragmentOrderListBinding>(),
    OrderListContract.View {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOrderListBinding = FragmentOrderListBinding.inflate(
        inflater, container, false
    )

    private var dataLoaded = false

    override val innerFragments = OrderState.values().map(OrderListViewPagerFragment::newInstance)
    override val tabStrings = OrderState.values().map { it.tabString }

    @Inject
    lateinit var presenter: OrderListContract.Presenter

    override fun initState() {
        initViewPagerAndTabLayout(
            binding.orderListViewPager,
            binding.orderListTabLayout
        )

        if (!dataLoaded) {
            presenter.requestData(0)
        }
    }

    override fun loading(show: Boolean) {
        // TODO: 2022.06.05 handle loading
    }

    override fun onRequestDataSuccess(data: List<OrderModel>) {
        for (innerFragment in innerFragments) {
            innerFragment.orders = data
        }

        dataLoaded = true
    }

    override fun onRequestDataError(errorMessage: Int) {
        // TODO: 2022.06.05 handle error
        dataLoaded = false
    }
}