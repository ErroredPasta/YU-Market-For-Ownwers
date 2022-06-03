package com.example.yumarketforowners.di.fragment

import androidx.fragment.app.Fragment
import com.example.yumarketforowners.data.repository.itemmanage.ItemManageRepository
import com.example.yumarketforowners.data.repository.itemmanage.ItemManageRepositoryImpl
import com.example.yumarketforowners.screen.itemmanage.ItemManageContract
import com.example.yumarketforowners.screen.itemmanage.ItemManagePresenter
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(FragmentComponent::class)
abstract class ItemManageModule {
    @Binds
    @FragmentScoped
    abstract fun bindItemManagePresenter(presenter: ItemManagePresenter): ItemManageContract.Presenter

    @Binds
    abstract fun bindItemManageRepository(repository: ItemManageRepositoryImpl): ItemManageRepository

    companion object {
        @Provides
        fun provideItemManageView(fragment: Fragment) = fragment as ItemManageContract.View
    }
}