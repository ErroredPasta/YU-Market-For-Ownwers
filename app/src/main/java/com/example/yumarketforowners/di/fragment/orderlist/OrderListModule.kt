package com.example.yumarketforowners.di.fragment.orderlist

import androidx.fragment.app.Fragment
import com.example.yumarketforowners.data.repository.orderlist.OrderListRepository
import com.example.yumarketforowners.data.repository.orderlist.OrderListRepositoryImpl
import com.example.yumarketforowners.screen.orderlist.OrderListContract
import com.example.yumarketforowners.screen.orderlist.OrderListPresenter
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(FragmentComponent::class)
abstract class OrderListModule {
    @Binds
    abstract fun bindOrderListRepository(repository: OrderListRepositoryImpl): OrderListRepository

    @Binds
    @FragmentScoped
    abstract fun bindOrderListPresenter(presenter: OrderListPresenter): OrderListContract.Presenter

    companion object {
        @Provides
        fun provideOrderListView(fragment: Fragment) = fragment as OrderListContract.View
    }
}