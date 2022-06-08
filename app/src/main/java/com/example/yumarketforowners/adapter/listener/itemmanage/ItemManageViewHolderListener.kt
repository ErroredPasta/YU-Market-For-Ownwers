package com.example.yumarketforowners.adapter.listener.itemmanage

import com.example.yumarketforowners.adapter.listener.AdapterListener
import com.example.yumarketforowners.data.model.itemmanage.ItemModel

interface ItemManageViewHolderListener : AdapterListener {
    // TODO: 2022.05.30 declare proper on click callbacks
    fun onPlusButtonClick(item: ItemModel)
    fun onMinusButtonClick(item: ItemModel)
    fun onEditItemButtonClick(item: ItemModel)
}