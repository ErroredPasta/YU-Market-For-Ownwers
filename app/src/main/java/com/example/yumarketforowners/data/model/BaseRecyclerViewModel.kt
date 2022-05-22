package com.example.yumarketforowners.data.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.mikepenz.fastadapter.binding.AbstractBindingItem

abstract class BaseRecyclerViewModel<VB : ViewDataBinding>(
    open val id: Long
) : AbstractBindingItem<VB>() {
    protected abstract val layoutId: Int

    override fun createBinding(
        inflater: LayoutInflater,
        parent: ViewGroup?
    ): VB = DataBindingUtil.inflate(inflater, layoutId, parent, false)

    override val type: Int get() = layoutId
}