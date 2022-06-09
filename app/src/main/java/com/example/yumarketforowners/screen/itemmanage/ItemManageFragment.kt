package com.example.yumarketforowners.screen.itemmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.StringRes
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.databinding.FragmentItemManageBinding
import com.example.yumarketforowners.screen.base.BaseViewPagerFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ItemManageFragment :
    BaseViewPagerFragment<FragmentItemManageBinding>(), ItemManageContract.View {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentItemManageBinding = FragmentItemManageBinding.inflate(
        inflater, container, false
    )

    @Inject
    lateinit var presenter: ItemManageContract.Presenter
    private var dataLoaded = false

    override val innerFragments = ItemAvailabilityType.values().map {
        ItemListViewPagerFragment.newInstance(it.available)
    }

    override val tabStrings = ItemAvailabilityType.values().map {
        it.tabString
    }

    override fun initState() {
        initViewPagerAndTabLayout(
            binding.itemManageViewPager,
            binding.itemManageTabLayout
        )

        // TODO: 2022.06.05 request data using market id
        presenter.requestData(0)

//        if (!dataLoaded) {
//            presenter.requestData()
//        } else {
//            onRequestDataSuccess(data)
//        }
    }

    override fun loading(show: Boolean) {
        // TODO: 2022.05.30 handle loading
    }

    override fun onRequestDataSuccess(items: List<ItemModel>) {
        // TODO: 2022.05.30 handle request data success
        for (innerFragment in innerFragments) {
            innerFragment.items = items
        }

        dataLoaded = true
    }

    override fun onRequestDataError(@StringRes errorMessage: Int) {
        // TODO: 2022.05.30 handle request data error
        Toast.makeText(context, getText(errorMessage), Toast.LENGTH_SHORT).show()
        dataLoaded = false
    }
}