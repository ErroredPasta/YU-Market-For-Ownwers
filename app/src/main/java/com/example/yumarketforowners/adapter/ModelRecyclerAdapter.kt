package com.example.yumarketforowners.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.adapter.viewholder.BaseViewHolder
import com.example.yumarketforowners.adapter.viewholder.CellType
import com.example.yumarketforowners.data.model.BaseModel
import com.example.yumarketforowners.util.ViewHolderMapper

class ModelRecyclerAdapter<M : BaseModel>(
    private var modelList: List<BaseModel>,
    private val adapterListener: AdapterListener
) : ListAdapter<BaseModel, BaseViewHolder<*, M>>(BaseModel.ModelDiffCallback) {

    override fun getItemViewType(position: Int): Int = modelList[position].cellType.ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*, M> = ViewHolderMapper.map(
        LayoutInflater.from(parent.context),
        parent,
        CellType.values()[viewType]
    )

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: BaseViewHolder<*, M>, position: Int) {
        holder.bindData(modelList[position] as M)
        holder.bindListener(adapterListener)
    }

    override fun submitList(list: List<BaseModel>?) {
        list?.let { modelList = it }
        super.submitList(list)
    }
}