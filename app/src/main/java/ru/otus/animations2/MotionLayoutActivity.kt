package ru.otus.animations2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import androidx.constraintlayout.motion.widget.MotionLayout

class MotionLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_layout)

        val motion = MotionLayout(this)
        motion.transitionToState(R.id.end2)
    }
}