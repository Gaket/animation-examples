package ru.otus.animations2

import android.os.Bundle
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.ChangeBounds
import androidx.transition.Fade
import androidx.transition.Scene
import androidx.transition.Slide
import androidx.transition.TransitionManager
import androidx.transition.TransitionSet

class TransitionManagerActivity : AppCompatActivity() {

    private lateinit var scene1: Scene
    private lateinit var scene2: Scene

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_manager)

        val transitionContainer = findViewById<ViewGroup>(R.id.transition_container)
        scene1 = Scene(transitionContainer, findViewById(R.id.scene_root))
        scene2 = Scene.getSceneForLayout(transitionContainer, R.layout.transition_scene2, this)

        findViewById<Button>(R.id.btn_scene1).setOnClickListener { goToScene1() }
        findViewById<Button>(R.id.btn_scene2).setOnClickListener { goToScene2() }
    }

    private fun goToScene1() {
        TransitionManager.go(scene1)
    }

    private fun goToScene2() {
        TransitionManager.go(scene2)
    }
}