package com.example.yumarketforowners.screen.orderlist

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.os.bundleOf
import com.example.yumarketforowners.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.adapter.listener.orderlist.OrderViewHolderListener
import com.example.yumarketforowners.data.model.orderlist.OrderModel
import com.example.yumarketforowners.databinding.ViewPagerFragmentOrderListBinding
import com.example.yumarketforowners.extension.addItemDivider
import com.example.yumarketforowners.screen.base.BaseFragment

class OrderListViewPagerFragment : BaseFragment<ViewPagerFragmentOrderListBinding>() {
    companion object {
        private const val ORDER_STATE_KEY = "ORDER_STATE_KEY"

        fun newInstance(orderState: OrderState) = OrderListViewPagerFragment().apply {
            arguments = bundleOf(ORDER_STATE_KEY to orderState)
        }
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ViewPagerFragmentOrderListBinding.inflate(inflater, container, false)

    private val orderState by lazy {
        requireArguments()[ORDER_STATE_KEY] as OrderState
    }

    private val adapter by lazy {
        ModelRecyclerAdapter<OrderModel>(
            listOf(), object : OrderViewHolderListener {
                override fun onTelePhoneNumberClicked(telePhoneNumber: String) {
                    // TODO: 2022.06.09 start telephone screen with number
                    Toast.makeText(context, "$telePhoneNumber clicked", Toast.LENGTH_SHORT).show()
                }

                override fun onAcceptOrderButtonClicked(order: OrderModel) {
                    // TODO: 2022.06.09 handle accept order
                    Toast.makeText(context, "$order accept button clicked", Toast.LENGTH_SHORT)
                        .show()
                }

                override fun onRejectOrderButtonClicked(order: OrderModel) {
                    // TODO: 2022.06.09 handle reject order
                    Toast.makeText(context, "$order reject button clicked", Toast.LENGTH_SHORT)
                        .show()
                }

                override fun onDeliveryDoneButtonClicked(order: OrderModel) {
                    // TODO: 2022.06.09 handle delivery done
                    Toast.makeText(context, "$order done button clicked", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    var orders: List<OrderModel> = listOf()
        set(value) {
            field = value.filter { it.orderState == orderState }
            adapter.submitList(field)
        }

    override fun initState() {
        binding.orderListRecyclerView.run {
            this.adapter = this@OrderListViewPagerFragment.adapter
            addItemDivider(LinearLayout.VERTICAL)
        }

        adapter.submitList(orders)
    }
}