package com.example.yumarketforowners.adapter.databinding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.yumarketforowners.extension.load

@BindingAdapter(value = ["imageUrl", "cornerRadius"], requireAll = false)
fun setImageByUrl(imageView: ImageView, imageUrl: String, corner: Float) =
    imageView.load(imageUrl, corner)


@BindingAdapter("showIf")
fun showIf(view: View, condition: Boolean) {
    view.visibility = if (condition) {
        View.VISIBLE
    } else {
        View.GONE
    }
}