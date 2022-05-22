package com.example.yumarketforowners.screen.base.presenters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yumarketforowners.screen.ViewType
import com.example.yumarketforowners.screen.base.mvp.BasePresenter
import com.example.yumarketforowners.screen.base.mvp.BaseView
import com.example.yumarketforowners.util.view.ViewFactory

abstract class BaseFragmentPresenter<V : BaseView<*>> : Fragment(), BasePresenter {
    private var _view: V? = null
    protected val view get() = _view!!

    protected abstract val viewType: ViewType

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _view = ViewFactory.create(viewType, inflater, container)
        return view.binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initState()
    }

    override fun onDestroyView() {
        _view = null
        beforeDestroy()
        super.onDestroyView()
    }

    protected open fun initState() = Unit
    protected open fun beforeDestroy() = Unit
}