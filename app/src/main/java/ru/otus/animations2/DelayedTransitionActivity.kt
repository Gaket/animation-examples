package ru.otus.animations2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.core.view.updateLayoutParams
import androidx.transition.TransitionManager

class DelayedTransitionActivity : AppCompatActivity() {

    private lateinit var root: ViewGroup
    private lateinit var btnSearchStart: Button
    private lateinit var btnSearchEnd: Button
    private lateinit var searchInput: EditText
    private lateinit var cornerView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delayed_transition)

        root = findViewById(R.id.delayed_transition_root)
        cornerView = findViewById(R.id.corner_view)
        btnSearchStart = findViewById(R.id.btn_search_start)
        btnSearchEnd = findViewById(R.id.btn_search_end)
        searchInput = findViewById(R.id.search_input)

        btnSearchStart.setOnClickListener { startSearch() }
        btnSearchEnd.setOnClickListener { stopSearch() }
    }

    private fun startSearch() {
        TransitionManager.beginDelayedTransition(root)
        btnSearchStart.visibility = View.GONE
        btnSearchEnd.visibility = View.VISIBLE
        searchInput.visibility = View.VISIBLE
        cornerView.updateLayoutParams<LinearLayout.LayoutParams> {
            gravity = Gravity.END
        }
    }

    private fun stopSearch() {
        TransitionManager.beginDelayedTransition(root)
        btnSearchStart.visibility = View.VISIBLE
        btnSearchEnd.visibility = View.GONE
        searchInput.visibility = View.GONE
        cornerView.updateLayoutParams<LinearLayout.LayoutParams> {
            gravity = Gravity.START
        }
    }

}