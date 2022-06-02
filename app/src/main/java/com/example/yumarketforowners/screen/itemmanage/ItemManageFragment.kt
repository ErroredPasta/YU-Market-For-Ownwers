package com.example.yumarketforowners.screen.itemmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.StringRes
import com.example.yumarketforowners.data.model.itemmanage.ItemModel
import com.example.yumarketforowners.data.repository.itemmanage.ItemManageRepositoryImpl
import com.example.yumarketforowners.databinding.ItemManageFragmentBinding
import com.example.yumarketforowners.screen.base.BaseViewPagerFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ItemManageFragment :
    BaseViewPagerFragment<ItemManageFragmentBinding>(), ItemManageContract.View {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ItemManageFragmentBinding = ItemManageFragmentBinding.inflate(
        inflater, container, false
    )

    private var dataLoaded = false
    private val presenter: ItemManageContract.Presenter = ItemManagePresenter(
        this, ItemManageRepositoryImpl()
    )

    override val innerFragments = ItemAvailabilityType.values().map {
        ItemListFragment.newInstance(it.available)
    }

    override val tabStrings = ItemAvailabilityType.values().map {
        it.tabString
    }

    override fun initState() {
        initViewPagerAndTabLayout(
            binding.itemManageViewPager,
            binding.itemManageTabLayout
        )

        if (!dataLoaded) {
            presenter.requestData()
            dataLoaded = true
        }
    }

    override fun loading(show: Boolean) {
        // TODO: 2022.05.30 handle loading
    }

    override fun onRequestDataSuccess(items: List<ItemModel>) {
        // TODO: 2022.05.30 handle request data success
        for (innerFragment in innerFragments) {
            innerFragment.items = items
        }
    }

    override fun onRequestDataError(@StringRes errorMessage: Int) {
        // TODO: 2022.05.30 handle request data error
        Toast.makeText(context, getText(errorMessage), Toast.LENGTH_SHORT).show()
    }

//    private fun initViewPager() = with(binding) {
//        // TODO: 2022.05.27 initialize viewpager
//        if (::adapter.isInitialized.not()) {
//            adapter = ViewPagerAdapter(this@ItemManageFragment, innerFragments)
//
//            itemManageViewPager.run {
//                this.adapter = this@ItemManageFragment.adapter
//                offscreenPageLimit = innerFragments.size
//            }
//
//            TabLayoutMediator(itemManageTabLayout, itemManageViewPager) { tab, position ->
//                tab.text = tabStrings[position]
//            }.attach()
//        }
//    }
}