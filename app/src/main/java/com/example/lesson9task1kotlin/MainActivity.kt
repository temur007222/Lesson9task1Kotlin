package com.example.lesson9task1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

     private lateinit var iv_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    fun initViews(){

        iv_image = findViewById(R.id.iv_image)
        val button: Button = findViewById(R.id.b_button)
            button.setOnClickListener(View.OnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
            iv_image.startAnimation(animation)
        })
    }
}