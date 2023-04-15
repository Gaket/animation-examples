package ru.otus.animations2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import androidx.transition.Scene
import androidx.transition.TransitionManager

class TransitionManagerActivity : AppCompatActivity() {

    private lateinit var scene1: Scene
    private lateinit var scene2: Scene

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_manager)

        val transitionContainer = findViewById<ViewGroup>(R.id.transition_container)
        scene1 = Scene(transitionContainer, findViewById(R.id.scene_root))
        scene2 = Scene.getSceneForLayout(transitionContainer, R.layout.transition_scene_3, this)

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