package com.example.yumarketforowners.util

interface Observable<L> {
    fun subscribe(listener: L): Boolean
    fun unsubscribe(listener: L): Boolean
}