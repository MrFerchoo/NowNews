package com.example.appsqllite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class ActivitySplashScreenInit : AppCompatActivity() {

    private var SPLASH_SCREEN_TIME : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen_init)

        Handler(Looper.myLooper()!!).postDelayed({
           startActivity(Intent(this, MainActivity::class.java))
           finish()
        }, SPLASH_SCREEN_TIME)
    }
}