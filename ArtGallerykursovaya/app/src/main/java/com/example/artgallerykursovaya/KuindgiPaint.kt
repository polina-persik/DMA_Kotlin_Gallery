package com.example.artgallerykursovaya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KuindgiPaint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kuindgi_paint)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = Intent(this, LadogskoeOzero::class.java)
        var a =findViewById<ImageButton>(R.id.imageButton104)
        a.setOnClickListener {
            startActivity(intent)
        }

        val intent2 = Intent(this, OnOstroveValaame::class.java)
        var g =findViewById<ImageButton>(R.id.imageButton105)
        g.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, AfterRain::class.java)
        var ga =findViewById<ImageButton>(R.id.imageButton106)
        ga.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, BerezovayaRoscha::class.java)
        var f =findViewById<ImageButton>(R.id.imageButton107)
        f.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, MoonsNightOnDnepr::class.java)
        var aa =findViewById<ImageButton>(R.id.imageButton108)
        aa.setOnClickListener {
            startActivity(intent5)
        }

        val intent6 = Intent(this, PetriKrm::class.java)
        var gf =findViewById<ImageButton>(R.id.imageButton109)
        gf.setOnClickListener {
            startActivity(intent6)
        }

        val intent7 = Intent(this, ElbrusMoonsNight::class.java)
        var gaf =findViewById<ImageButton>(R.id.imageButton110)
        gaf.setOnClickListener {
            startActivity(intent7)
        }

        val intent8 = Intent(this, DaryalskoeUschelie::class.java)
        var ff =findViewById<ImageButton>(R.id.imageButton111)
        ff.setOnClickListener {
            startActivity(intent8)
        }

        val intent9 = Intent(this, HristosInGarden::class.java)
        var fp =findViewById<ImageButton>(R.id.imageButton112)
        fp.setOnClickListener {
            startActivity(intent9)
        }

        val intent10 = Intent(this, RadugaDuga::class.java)
        var ffo =findViewById<ImageButton>(R.id.imageButton113)
        ffo.setOnClickListener {
            startActivity(intent10)
        }

        val intent11 = Intent(this, Nochnoe::class.java)
        var ffl =findViewById<ImageButton>(R.id.imageButton114)
        ffl.setOnClickListener {
            startActivity(intent11)
        }

        val intent12 = Intent(this, RedZakat::class.java)
        var ffr =findViewById<ImageButton>(R.id.imageButton117)
        ffr.setOnClickListener {
            startActivity(intent12)
        }
    }
}