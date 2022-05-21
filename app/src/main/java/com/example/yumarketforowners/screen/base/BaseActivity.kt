package com.example.yumarketforowners.screen.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yumarketforowners.screen.ViewType
import com.example.yumarketforowners.screen.base.mvp.BasePresenter
import com.example.yumarketforowners.screen.base.mvp.BaseView
import com.example.yumarketforowners.util.view.ViewFactory

abstract class BaseActivity<V : BaseView<*>> : AppCompatActivity(), BasePresenter {
    protected val view: V by lazy {
        ViewFactory.create(viewType, layoutInflater, null)
    }

    protected abstract val viewType: ViewType

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.binding.root)
        initState()
    }

    override fun onDestroy() {
        beforeDestroy()
        super.onDestroy()
    }

    protected open fun initState() = Unit
    protected open fun beforeDestroy() = Unit
}