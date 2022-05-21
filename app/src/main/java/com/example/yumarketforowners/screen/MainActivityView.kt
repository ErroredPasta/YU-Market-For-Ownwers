package com.example.yumarketforowners.screen

import androidx.fragment.app.Fragment
import androidx.navigation.NavHost
import androidx.navigation.ui.setupWithNavController
import com.example.yumarketforowners.databinding.ActivityMainBinding
import com.example.yumarketforowners.screen.base.mvp.BaseView

class MainActivityView(
    binding: ActivityMainBinding
) : BaseView<ActivityMainBinding>(binding) {

    private val navController by lazy {
        val host =
            binding.fragmentContainerView.getFragment<Fragment>() as NavHost

        host.navController
    }

    init {
        with(binding) {
            bottomNavigationView.setupWithNavController(navController)
        }
    }
}