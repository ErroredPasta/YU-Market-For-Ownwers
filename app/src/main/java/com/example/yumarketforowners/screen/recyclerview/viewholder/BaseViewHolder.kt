package com.example.yumarketforowners.screen.recyclerview.viewholder

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.yumarketforowners.screen.recyclerview.listener.AdapterListener
import com.example.yumarketforowners.data.model.BaseModel

abstract class BaseViewHolder<VDB : ViewDataBinding, M : BaseModel>(
    protected val binding: VDB
) : RecyclerView.ViewHolder(binding.root) {

    open fun clear() = Unit
    open fun bindData(model: M) {
        clear()
    }

    open fun bindListener(listener: AdapterListener) = Unit
}