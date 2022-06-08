package com.example.yumarketforowners.screen.marketmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yumarketforowners.databinding.FragmentMarketManageBinding
import com.example.yumarketforowners.screen.base.BaseFragment

class MarketManageFragment : BaseFragment<FragmentMarketManageBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMarketManageBinding = FragmentMarketManageBinding.inflate(
        inflater, container, false
    )
}