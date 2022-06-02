package com.example.yumarketforowners.data.model

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.example.yumarketforowners.adapter.viewholder.CellType

abstract class BaseModel(
    open val id: Long,
    open val cellType: CellType
) {
    open fun isTheSame(other: BaseModel) =
        this.id == other.id && this.cellType == other.cellType

    companion object ModelDiffCallback : DiffUtil.ItemCallback<BaseModel>() {
        override fun areItemsTheSame(oldItem: BaseModel, newItem: BaseModel): Boolean =
            oldItem.isTheSame(newItem)

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: BaseModel, newItem: BaseModel): Boolean =
            oldItem == newItem
    }
}