package com.example.yumarketforowners.data.model


import com.example.yumarketforowners.R
import com.example.yumarketforowners.databinding.ItemViewHolderBinding

data class ItemModel(
    override val id: Long,
    val name: String,
    val price: Int,
    val imageUrl: String,
    val available: Boolean
) : BaseRecyclerViewModel<ItemViewHolderBinding>(id) {
    override val layoutId: Int
        get() = R.layout.item_view_holder

    override fun bindView(binding: ItemViewHolderBinding, payloads: List<Any>) {
        binding.itemModel = this
    }
}
