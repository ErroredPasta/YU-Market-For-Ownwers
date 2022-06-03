package com.example.yumarketforowners.screen.marketmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yumarketforowners.databinding.MarketManageFragmentBinding
import com.example.yumarketforowners.screen.base.BaseFragment

class MarketManageFragment : BaseFragment<MarketManageFragmentBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): MarketManageFragmentBinding = MarketManageFragmentBinding.inflate(
        inflater, container, false
    )
}