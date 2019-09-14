package com.prototipe.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.BackgroundColorSpan
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var datastring = "isian coba yang panjang tambah lagi ";
        val spannable = SpannableString(datastring)
        spannable.setSpan(
            BackgroundColorSpan(Color.parseColor("#f0f0f0")),
            0, 4,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(
            BackgroundColorSpan(Color.parseColor("#ff33ff")),
            5, 8,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        text2.text=spannable
    }
}
