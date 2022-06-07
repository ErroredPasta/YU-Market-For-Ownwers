package com.example.yumarketforowners.util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.yumarketforowners.adapter.viewholder.BaseViewHolder
import com.example.yumarketforowners.adapter.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel
import kotlin.reflect.full.primaryConstructor

object ViewHolderMapper {
    @Suppress("UNCHECKED_CAST")
    fun <M : BaseModel> map(
        layoutInflater: LayoutInflater,
        parent: ViewGroup?,
        cellType: CellType
    ) = cellType.clazz.primaryConstructor!!.call(
        DataBindingUtil.inflate(layoutInflater, cellType.layoutId, parent, false)
    ) as BaseViewHolder<*, M>
}
