package com.example.yumarketforowners.screen

import androidx.navigation.NavHost
import androidx.navigation.ui.setupWithNavController
import com.example.yumarketforowners.databinding.ActivityMainBinding
import com.example.yumarketforowners.screen.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val navController by lazy {
        (binding.fragmentContainerView.getFragment() as NavHost)
            .navController
    }

    override fun initState() = with(binding) {
        bottomNavigationView.setupWithNavController(navController)
    }
}