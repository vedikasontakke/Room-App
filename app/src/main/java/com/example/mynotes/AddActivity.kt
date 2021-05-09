package com.example.mynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN   // HERE TOOL BAR AND STATUS BAR IS GONE

        save.setOnClickListener {

            startActivity(Intent(this , MainActivity :: class.java))
        }

        share.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT , "hey This is my note \n Title :" + (et_title.text) +"\n Note :" + (et_note.text))

            val chooser =Intent.createChooser(intent , "Share this note using ..")
            startActivity(chooser)
        }
    }
}