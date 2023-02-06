package com.example.tp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button)

        button.setOnClickListener(){
            Toast.makeText(applicationContext, "Hello Codepathians!!!", Toast.LENGTH_LONG).show()
        }

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.goldendog)

    }
}