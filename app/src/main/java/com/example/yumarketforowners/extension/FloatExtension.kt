package com.example.yumarketforowners.extension

import android.content.res.Resources

fun Float.fromDpToPx() =
    (this * Resources.getSystem().displayMetrics.density).toInt()
