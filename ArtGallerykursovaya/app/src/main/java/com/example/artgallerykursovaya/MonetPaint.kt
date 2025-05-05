package com.example.artgallerykursovaya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MonetPaint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_monet_paint)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = Intent(this, GardenGiverniya::class.java)
        var m =findViewById<ImageButton>(R.id.imageButton85)
        m.setOnClickListener {
            startActivity(intent)
        }

        val intent2 = Intent(this, PolyaGolland::class.java)
        var a =findViewById<ImageButton>(R.id.imageButton86)
        a.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, Spring::class.java)
        var r =findViewById<ImageButton>(R.id.imageButton87)
        r.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, BigNaberegnaya::class.java)
        var p =findViewById<ImageButton>(R.id.imageButton88)
        p.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, Kuvshinki::class.java)
        var ma =findViewById<ImageButton>(R.id.imageButton96)
        ma.setOnClickListener {
            startActivity(intent5)
        }

        val intent6 = Intent(this, Parlament::class.java)
        var aa =findViewById<ImageButton>(R.id.imageButton97)
        aa.setOnClickListener {
            startActivity(intent6)
        }

        val intent7 = Intent(this, RuanskiSobor::class.java)
        var ra =findViewById<ImageButton>(R.id.imageButton98)
        ra.setOnClickListener {
            startActivity(intent7)
        }

        val intent8 = Intent(this, StogaSena::class.java)
        var pa =findViewById<ImageButton>(R.id.imageButton99)
        pa.setOnClickListener {
            startActivity(intent8)
        }

        val intent9 = Intent(this, PapashaPoli::class.java)
        var maa =findViewById<ImageButton>(R.id.imageButton89)
        maa.setOnClickListener {
            startActivity(intent9)
        }

        val intent10 = Intent(this, Progulka::class.java)
        var aaa =findViewById<ImageButton>(R.id.imageButton90)
        aaa.setOnClickListener {
            startActivity(intent10)
        }

        val intent11 = Intent(this, Vokzal::class.java)
        var raa =findViewById<ImageButton>(R.id.imageButton91)
        raa.setOnClickListener {
            startActivity(intent11)
        }

        val intent12 = Intent(this, Vpechatlenie::class.java)
        var paa =findViewById<ImageButton>(R.id.imageButton92)
        paa.setOnClickListener {
            startActivity(intent12)
        }

        val intent13 = Intent(this, Bridge::class.java)
        var aaf =findViewById<ImageButton>(R.id.imageButton93)
        aaf.setOnClickListener {
            startActivity(intent13)
        }

        val intent14 = Intent(this, PoleSMakami::class.java)
        var raf =findViewById<ImageButton>(R.id.imageButton94)
        raf.setOnClickListener {
            startActivity(intent14)
        }

        val intent15 = Intent(this, JapanBridge::class.java)
        var paf =findViewById<ImageButton>(R.id.imageButton95)
        paf.setOnClickListener {
            startActivity(intent15)
        }
    }
}