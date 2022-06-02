package com.example.yumarketforowners.screen.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    protected abstract val binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initState()
    }

    override fun onDestroy() {
        beforeDestroy()
        super.onDestroy()
    }

    protected open fun initState() = Unit
    protected open fun beforeDestroy() = Unit
}