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

        val intent5 = Intent(this, Melanholiya::class.java)
        var aa =findViewById<ImageButton>(R.id.imageButton134)
        aa.setOnClickListener {
            startActivity(intent5)
        }

        val intent6 = Intent(this, SecretSummerNight::class.java)
        var bs =findViewById<ImageButton>(R.id.imageButton135)
        bs.setOnClickListener {
            startActivity(intent6)
        }

        val intent7 = Intent(this, Scream::class.java)
        var cs =findViewById<ImageButton>(R.id.imageButton136)
        cs.setOnClickListener {
            startActivity(intent7)
        }

        val intent8 = Intent(this, Trevoga::class.java)
        var dv =findViewById<ImageButton>(R.id.imageButton137)
        dv.setOnClickListener {
            startActivity(intent8)
        }

        val intent9 = Intent(this, EyesOnEyes::class.java)
        var bo =findViewById<ImageButton>(R.id.imageButton138)
        bo.setOnClickListener {
            startActivity(intent9)
        }

        val intent10 = Intent(this, GirlsOnBrige::class.java)
        var csf =findViewById<ImageButton>(R.id.imageButton139)
        csf.setOnClickListener {
            startActivity(intent10)
        }

        val intent11 = Intent(this, SelfportraitWithHands::class.java)
        var ddv =findViewById<ImageButton>(R.id.imageButton140)
        ddv.setOnClickListener {
            startActivity(intent11)
        }

        val intent12 = Intent(this, Drovosek::class.java)
        var ct =findViewById<ImageButton>(R.id.imageButton141)
        ct.setOnClickListener {
            startActivity(intent12)
        }

        val intent13 = Intent(this, SelfPBergen::class.java)
        var dh =findViewById<ImageButton>(R.id.imageButton142)
        dh.setOnClickListener {
            startActivity(intent13)
        }
    }
}