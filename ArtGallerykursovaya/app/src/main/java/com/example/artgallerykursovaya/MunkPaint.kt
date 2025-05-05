package com.example.artgallerykursovaya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MunkPaint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_munk_paint)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = Intent(this, MaridalenBlizOslo::class.java)
        var a =findViewById<ImageButton>(R.id.imageButton130)
        a.setOnClickListener {
            startActivity(intent)
        }

        val intent2 = Intent(this, SickGirl::class.java)
        var b =findViewById<ImageButton>(R.id.imageButton131)
        b.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, PozdnimVecherom::class.java)
        var c =findViewById<ImageButton>(R.id.imageButton132)
        c.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, SummerNight::class.java)
        var d =findViewById<ImageButton>(R.id.imageButton133)
        d.setOnClickListener {
            startActivity(intent4)
        }
    }
}