package com.example.yumarketforowners.util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.yumarketforowners.adapter.viewholder.BaseViewHolder
import com.example.yumarketforowners.adapter.viewholder.CellType
import kotlin.reflect.full.primaryConstructor

object ViewHolderMapper {
    @Suppress("UNCHECKED_CAST")
    fun <VH : BaseViewHolder<*, *>> map(
        layoutInflater: LayoutInflater,
        parent: ViewGroup?,
        cellType: CellType
    ) = cellType.clazz.primaryConstructor!!.call(
        DataBindingUtil.inflate(layoutInflater, cellType.layoutId, parent, false)
    ) as VH
}
