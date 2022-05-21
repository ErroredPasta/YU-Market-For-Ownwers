package com.example.yumarketforowners.screen.base.mvp

import androidx.databinding.ViewDataBinding
import com.example.yumarketforowners.util.Observable

abstract class BaseObservableView<VB : ViewDataBinding, L>(
    binding: VB
) : Observable<L>, BaseView<VB>(binding) {
    protected val listeners = HashSet<L>()

    override fun subscribe(listener: L) = listeners.add(listener)
    override fun unsubscribe(listener: L) = listeners.remove(listener)
}