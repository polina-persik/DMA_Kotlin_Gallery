package com.example.artgallerykursovaya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class magritt_paint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_magritt_paint)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = Intent(this, Cat::class.java)
        var a =findViewById<ImageButton>(R.id.imageButton47)
        a.setOnClickListener {
            startActivity(intent)
        }

        val intent2 = Intent(this, PierB::class.java)
        var b =findViewById<ImageButton>(R.id.imageButton48)
        b.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, SelfP::class.java)
        var c =findViewById<ImageButton>(R.id.imageButton49)
        c.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, Gorgetta::class.java)
        var d =findViewById<ImageButton>(R.id.imageButton50)
        d.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, Window::class.java)
        var e =findViewById<ImageButton>(R.id.imageButton51)
        e.setOnClickListener {
            startActivity(intent5)
        }

        val intent6 = Intent(this, MindProhogiy::class.java)
        var f =findViewById<ImageButton>(R.id.imageButton52)
        f.setOnClickListener {
            startActivity(intent6)
        }

        val intent7 = Intent(this, Lovers::class.java)
        var g =findViewById<ImageButton>(R.id.imageButton53)
        g.setOnClickListener {
            startActivity(intent7)
        }

        val intent8 = Intent(this, Answer::class.java)
        var h =findViewById<ImageButton>(R.id.imageButton54)
        h.setOnClickListener {
            startActivity(intent8)
        }

        val intent9 = Intent(this, Verolomstvo::class.java)
        var i =findViewById<ImageButton>(R.id.imageButton55)
        i.setOnClickListener {
            startActivity(intent9)
        }

        val intent10 = Intent(this, Princip::class.java)
        var j =findViewById<ImageButton>(R.id.imageButton56)
        j.setOnClickListener {
            startActivity(intent10)
        }

        val intent11 = Intent(this, RaneeMorning::class.java)
        var k =findViewById<ImageButton>(R.id.imageButton57)
        k.setOnClickListener {
            startActivity(intent11)
        }

        val intent12 = Intent(this, Fire::class.java)
        var l =findViewById<ImageButton>(R.id.imageButton58)
        l.setOnClickListener {
            startActivity(intent12)
        }

        val intent13 = Intent(this, plenitca::class.java)
        var m =findViewById<ImageButton>(R.id.imageButton59)
        m.setOnClickListener {
            startActivity(intent13)
        }

        val intent14 = Intent(this, VoiceBlood::class.java)
        var n =findViewById<ImageButton>(R.id.imageButton60)
        n.setOnClickListener {
            startActivity(intent14)
        }

        val intent15 = Intent(this, LightsImperiya::class.java)
        var o =findViewById<ImageButton>(R.id.imageButton61)
        o.setOnClickListener {
            startActivity(intent15)
        }

        val intent16 = Intent(this, Tcennosti::class.java)
        var p =findViewById<ImageButton>(R.id.imageButton62)
        p.setOnClickListener {
            startActivity(intent16)
        }

        val intent17 = Intent(this, Struna::class.java)
        var q =findViewById<ImageButton>(R.id.imageButton63)
        q.setOnClickListener {
            startActivity(intent17)
        }

        val intent18 = Intent(this, WorldsSun::class.java)
        var r =findViewById<ImageButton>(R.id.imageButton64)
        r.setOnClickListener {
            startActivity(intent18)
        }
    }
}