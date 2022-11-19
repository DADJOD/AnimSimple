package com.template.animsimple

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ship = findViewById<ImageView>(R.id.shipView)
        val shipAnim = AnimationUtils.loadAnimation(this, R.anim.ship_anim)
        ship.startAnimation(shipAnim)
    }
}