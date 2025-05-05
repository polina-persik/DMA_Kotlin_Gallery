package com.example.artgallerykursovaya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AivazovskiPaint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_aivazovski_paint)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = Intent(this, BeregSeaNight::class.java)
        var a =findViewById<ImageButton>(R.id.imageButton103)
        a.setOnClickListener {
            startActivity(intent)
        }

        val intent2 = Intent(this, Kerch::class.java)
        var g =findViewById<ImageButton>(R.id.imageButton115)
        g.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, ChesmenskoeSragenie::class.java)
        var ga =findViewById<ImageButton>(R.id.imageButton116)
        ga.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, DvyatVal::class.java)
        var f =findViewById<ImageButton>(R.id.imageButton118)
        f.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, SinopskoeSragenie::class.java)
        var h =findViewById<ImageButton>(R.id.imageButton119)
        h.setOnClickListener {
            startActivity(intent5)
        }

        val intent6 = Intent(this, WinterObozVPuti::class.java)
        var l =findViewById<ImageButton>(R.id.imageButton120)
        l.setOnClickListener {
            startActivity(intent6)
        }

        val intent7 = Intent(this, RainBow::class.java)
        var gal =findViewById<ImageButton>(R.id.imageButton121)
        gal.setOnClickListener {
            startActivity(intent7)
        }

        val intent8 = Intent(this, NightInBlackSea::class.java)
        var fa =findViewById<ImageButton>(R.id.imageButton122)
        fa.setOnClickListener {
            startActivity(intent8)
        }

        val intent9 = Intent(this, BlackSea::class.java)
        var ha =findViewById<ImageButton>(R.id.imageButton123)
        ha.setOnClickListener {
            startActivity(intent9)
        }

        val intent10 = Intent(this, GnevSeas::class.java)
        var la =findViewById<ImageButton>(R.id.imageButton124)
        la.setOnClickListener {
            startActivity(intent10)
        }

        val intent11 = Intent(this, FlotInFeodosiya::class.java)
        var gg =findViewById<ImageButton>(R.id.imageButton125)
        gg.setOnClickListener {
            startActivity(intent11)
        }

        val intent12 = Intent(this, NightOnBosfore::class.java)
        var fk =findViewById<ImageButton>(R.id.imageButton126)
        fk.setOnClickListener {
            startActivity(intent12)
        }

        val intent13 = Intent(this, OtboynayaVolna::class.java)
        var hl =findViewById<ImageButton>(R.id.imageButton127)
        hl.setOnClickListener {
            startActivity(intent13)
        }

        val intent14 = Intent(this, SrediVoln::class.java)
        var ll =findViewById<ImageButton>(R.id.imageButton128)
        ll.setOnClickListener {
            startActivity(intent14)
        }
    }
}