package ru.otus.animations2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_transition_manager).setOnClickListener {
            startActivity(Intent(this, TransitionManagerActivity::class.java))
        }

        findViewById<Button>(R.id.btn_delayed_transition).setOnClickListener {
            startActivity(Intent(this, DelayedTransitionActivity::class.java))
        }

        findViewById<Button>(R.id.btn_motion_layout).setOnClickListener {
            startActivity(Intent(this, MotionLayoutActivity::class.java))
        }

        findViewById<Button>(R.id.btn_lottie).setOnClickListener {
            startActivity(Intent(this, LottieActivity::class.java))
        }
    }

}