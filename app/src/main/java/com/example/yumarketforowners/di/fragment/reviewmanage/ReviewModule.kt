package com.example.yumarketforowners.di.fragment.reviewmanage

import androidx.fragment.app.Fragment
import com.example.yumarketforowners.data.model.reviewmanage.ChatRoomModel
import com.example.yumarketforowners.data.model.reviewmanage.ReviewModel
import com.example.yumarketforowners.data.repository.reviewmanage.ChatRoomRepositoryImpl
import com.example.yumarketforowners.data.repository.reviewmanage.ReviewOrChatRoomRepository
import com.example.yumarketforowners.data.repository.reviewmanage.ReviewRepositoryImpl
import com.example.yumarketforowners.screen.reviewmanage.ReviewManageContract
import com.example.yumarketforowners.screen.reviewmanage.ReviewManagePresenter
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(FragmentComponent::class)
abstract class ReviewModule {
    @Binds
    abstract fun bindReviewRepository(repository: ReviewRepositoryImpl):
            ReviewOrChatRoomRepository<ReviewModel>

    @Binds
    @FragmentScoped
    abstract fun bindReviewPresenter(presenter: ReviewManagePresenter<ReviewModel>):
            ReviewManageContract.Presenter<ReviewModel>

    companion object {
        @Suppress("UNCHECKED_CAST")
        @Provides
        fun provideReviewView(fragment: Fragment) =
            fragment as ReviewManageContract.View<ReviewModel>
    }
}