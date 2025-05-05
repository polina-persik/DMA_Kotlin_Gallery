package com.example.artgallerykursovaya

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class AlbumWindow : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_album_window)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = Intent(this, magritt::class.java)
        var a =findViewById<ImageButton>(R.id.imageButton2)
        a.setOnClickListener {
            startActivity(intent)
        }

        val intent2 = Intent(this, van_gogh::class.java)
        var g =findViewById<ImageButton>(R.id.imageButton11)
        g.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, ClaudeMonet::class.java)
        var m =findViewById<ImageButton>(R.id.imageButton14)
        m.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, BertheMorisot::class.java)
        var p =findViewById<ImageButton>(R.id.imageButton37)
        p.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, Kuindgi::class.java)
        var pa =findViewById<ImageButton>(R.id.imageButton4)
        pa.setOnClickListener {
            startActivity(intent5)
        }

        val intent6 = Intent(this, Avazovski::class.java)
        var pk =findViewById<ImageButton>(R.id.imageButton3)
        pk.setOnClickListener {
            startActivity(intent6)
        }

        val intent7 = Intent(this, Matiss::class.java)
        var pka =findViewById<ImageButton>(R.id.imageButton7)
        pka.setOnClickListener {
            startActivity(intent7)
        }

        val intent8 = Intent(this, munk::class.java)
        var pkg =findViewById<ImageButton>(R.id.imageButton8)
        pkg.setOnClickListener {
            startActivity(intent8)
        }
    }
}