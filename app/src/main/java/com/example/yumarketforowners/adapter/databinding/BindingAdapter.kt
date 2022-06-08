package com.example.yumarketforowners.adapter.databinding

import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.yumarketforowners.extension.load
import com.example.yumarketforowners.screen.orderlist.OrderState

@BindingAdapter("app:imageUrl")
fun setImageByUrl(imageView: ImageView, imageUrl: String) = imageView.load(imageUrl)


@BindingAdapter("app:showIfPending")
fun showIfPending(button: Button, orderState: OrderState) {
    button.visibility =
        if (orderState == OrderState.PENDING) {
            View.VISIBLE
        } else {
            View.GONE
        }
}

@BindingAdapter("app:showIfAccepted")
fun showIfAccepted(button: Button, orderState: OrderState) {
    button.visibility =
        if (orderState == OrderState.ACCEPTED) {
            View.VISIBLE
        } else {
            View.GONE
        }
}