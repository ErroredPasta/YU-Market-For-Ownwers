package com.example.yumarketforowners.screen.recyclerview.listener.itemmanage

import com.example.yumarketforowners.screen.recyclerview.listener.AdapterListener
import com.example.yumarketforowners.data.model.itemmanage.ItemModel

interface ItemManageViewHolderListener : AdapterListener {
    // TODO: 2022.05.30 declare proper on click callbacks
    fun onEditItemButtonClick(item: ItemModel)
}