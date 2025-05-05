package com.example.artgallerykursovaya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MorisotPaint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_morisot_paint)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = Intent(this, Sister::class.java)
        var m =findViewById<ImageButton>(R.id.imageButton66)
        m.setOnClickListener {
            startActivity(intent)
        }

        val intent2 = Intent(this, SisterS::class.java)
        var a =findViewById<ImageButton>(R.id.imageButton67)
        a.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, MomAndSister::class.java)
        var r =findViewById<ImageButton>(R.id.imageButton68)
        r.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, Gavani::class.java)
        var p =findViewById<ImageButton>(R.id.imageButton69)
        p.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, Balkon::class.java)
        var ma =findViewById<ImageButton>(R.id.imageButton70)
        ma.setOnClickListener {
            startActivity(intent5)
        }

        val intent6 = Intent(this, Kolbeli::class.java)
        var aa =findViewById<ImageButton>(R.id.imageButton71)
        aa.setOnClickListener {
            startActivity(intent6)
        }

        val intent7 = Intent(this, Chtenie::class.java)
        var ra =findViewById<ImageButton>(R.id.imageButton72)
        ra.setOnClickListener {
            startActivity(intent7)
        }

        val intent8 = Intent(this, InPark::class.java)
        var pa =findViewById<ImageButton>(R.id.imageButton73)
        pa.setOnClickListener {
            startActivity(intent8)
        }

        val intent9 = Intent(this, AgenMane::class.java)
        var x =findViewById<ImageButton>(R.id.imageButton74)
        x.setOnClickListener {
            startActivity(intent9)
        }

        val intent10 = Intent(this, WomenTualet::class.java)
        var d =findViewById<ImageButton>(R.id.imageButton75)
        d.setOnClickListener {
            startActivity(intent10)
        }

        val intent11 = Intent(this, Psycho::class.java)
        var j =findViewById<ImageButton>(R.id.imageButton76)
        j.setOnClickListener {
            startActivity(intent11)
        }

        val intent12 = Intent(this, SummerDay::class.java)
        var q =findViewById<ImageButton>(R.id.imageButton77)
        q.setOnClickListener {
            startActivity(intent12)
        }

        val intent13 = Intent(this, Cage::class.java)
        var da =findViewById<ImageButton>(R.id.imageButton78)
        da.setOnClickListener {
            startActivity(intent13)
        }

        val intent14 = Intent(this, InBathroom::class.java)
        var ja =findViewById<ImageButton>(R.id.imageButton80)
        ja.setOnClickListener {
            startActivity(intent14)
        }

        val intent15 = Intent(this, InStolovaya::class.java)
        var qa =findViewById<ImageButton>(R.id.imageButton79)
        qa.setOnClickListener {
            startActivity(intent15)
        }

        val intent16 = Intent(this, WomanInPark::class.java)
        var daa =findViewById<ImageButton>(R.id.imageButton81)
        daa.setOnClickListener {
            startActivity(intent16)
        }

        val intent17 = Intent(this, Flaytist::class.java)
        var jaa =findViewById<ImageButton>(R.id.imageButton82)
        jaa.setOnClickListener {
            startActivity(intent17)
        }

        val intent18 = Intent(this, GuliMane::class.java)
        var qaa =findViewById<ImageButton>(R.id.imageButton83)
        qaa.setOnClickListener {
            startActivity(intent18)
        }
    }
}