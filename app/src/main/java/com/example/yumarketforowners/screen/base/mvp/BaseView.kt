package com.example.yumarketforowners.screen.base.mvp

import androidx.databinding.ViewDataBinding

abstract class BaseView<VB : ViewDataBinding>(
    val binding: VB
)