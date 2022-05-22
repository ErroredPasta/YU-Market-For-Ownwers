package com.example.yumarketforowners.screen.itemmanage

import androidx.core.os.bundleOf
import com.example.yumarketforowners.data.repository.itemmanage.ItemManageRepository
import com.example.yumarketforowners.data.repository.itemmanage.ItemManageRepositoryImpl
import com.example.yumarketforowners.screen.ViewType
import com.example.yumarketforowners.screen.base.presenters.BaseFragmentPresenter

class ItemListFragmentPresenter : BaseFragmentPresenter<ItemListFragmentView>(), ItemListFragmentView.Listener {
    companion object {
        private const val ITEM_AVAILABILITY_KEY = "ITEM_AVAILABILITY_KEY"

        fun newInstance(available: Boolean) =
            ItemListFragmentPresenter().apply {
                arguments = bundleOf(ITEM_AVAILABILITY_KEY to available)
            }
    }

    override val viewType: ViewType = ViewType.ITEM_LIST_FRAGMENT_VIEW

    // TODO: 2022.05.22 di required
    private val itemManageRepository: ItemManageRepository by lazy {
        ItemManageRepositoryImpl()
    }

    private val available by lazy {
        requireArguments()[ITEM_AVAILABILITY_KEY] as Boolean
    }

    override fun onDataRequest() {
        val result = itemManageRepository.getItemsByAvailability(available)

        // TODO: 2022.05.22 handle states

        // update recyclerview
        view.items = result
    }
}