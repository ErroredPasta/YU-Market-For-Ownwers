package com.example.yumarketforowners.di.fragment.reviewmanage

import androidx.fragment.app.Fragment
import dagger.BindsInstance
import dagger.hilt.DefineComponent
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.FragmentScoped

@DefineComponent(parent = ActivityComponent::class)
@FragmentScoped
interface ReviewManageComponent {

    @DefineComponent.Builder
    interface Builder {
        fun fragment(@BindsInstance fragment: Fragment): Builder
        fun build(): ReviewManageComponent
    }
}
