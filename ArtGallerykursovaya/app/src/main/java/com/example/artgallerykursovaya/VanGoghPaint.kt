package com.example.artgallerykursovaya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class VanGoghPaint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_van_gogh_paint)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = Intent(this, PortraitWoman::class.java)
        var m =findViewById<ImageButton>(R.id.imageButton27)
        m.setOnClickListener {
            startActivity(intent)
        }

        val intent2 = Intent(this, Lunnik::class.java)
        var a =findViewById<ImageButton>(R.id.imageButton12)
        a.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, Edoki::class.java)
        var r =findViewById<ImageButton>(R.id.imageButton13)
        r.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, Bibliya::class.java)
        var p =findViewById<ImageButton>(R.id.imageButton15)
        p.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, Cherep::class.java)
        var s =findViewById<ImageButton>(R.id.imageButton16)
        s.setOnClickListener {
            startActivity(intent5)
        }

        val intent6 = Intent(this, WomenBlue::class.java)
        var l =findViewById<ImageButton>(R.id.imageButton17)
        l.setOnClickListener {
            startActivity(intent6)
        }

        val intent7 = Intent(this, VidParis::class.java)
        var x =findViewById<ImageButton>(R.id.imageButton)
        x.setOnClickListener {
            startActivity(intent7)
        }

        val intent8 = Intent(this, Chasha::class.java)
        var d =findViewById<ImageButton>(R.id.imageButton18)
        d.setOnClickListener {
            startActivity(intent8)
        }

        val intent9 = Intent(this, SelfPortraitTr::class.java)
        var o =findViewById<ImageButton>(R.id.imageButton19)
        o.setOnClickListener {
            startActivity(intent9)
        }

        val intent10 = Intent(this, Para::class.java)
        var b =findViewById<ImageButton>(R.id.imageButton20)
        b.setOnClickListener {
            startActivity(intent10)
        }

        val intent11 = Intent(this, SelfPortrait::class.java)
        var f =findViewById<ImageButton>(R.id.imageButton21)
        f.setOnClickListener {
            startActivity(intent11)
        }

        val intent12 = Intent(this, Sirene::class.java)
        var q =findViewById<ImageButton>(R.id.imageButton22)
        q.setOnClickListener {
            startActivity(intent12)
        }

        val intent13 = Intent(this, Terrasa::class.java)
        var j =findViewById<ImageButton>(R.id.imageButton23)
        j.setOnClickListener {
            startActivity(intent13)
        }

        val intent14 = Intent(this, NightRona::class.java)
        var t =findViewById<ImageButton>(R.id.imageButton24)
        t.setOnClickListener {
            startActivity(intent14)
        }

        val intent15 = Intent(this, SpalnaArl::class.java)
        var w =findViewById<ImageButton>(R.id.imageButton25)
        w.setOnClickListener {
            startActivity(intent15)
        }

        val intent16 = Intent(this, Sunflouwers::class.java)
        var h =findViewById<ImageButton>(R.id.imageButton26)
        h.setOnClickListener {
            startActivity(intent16)
        }

        val intent17 = Intent(this, Djozef::class.java)
        var k =findViewById<ImageButton>(R.id.imageButton38)
        k.setOnClickListener {
            startActivity(intent17)
        }

        val intent18 = Intent(this, PinkKust::class.java)
        var v =findViewById<ImageButton>(R.id.imageButton28)
        v.setOnClickListener {
            startActivity(intent18)
        }

        val intent19 = Intent(this, StarNight::class.java)
        var g =findViewById<ImageButton>(R.id.imageButton29)
        g.setOnClickListener {
            startActivity(intent19)
        }

        val intent21 = Intent(this, Kiparis::class.java)
        var gp =findViewById<ImageButton>(R.id.imageButton30)
        gp.setOnClickListener {
            startActivity(intent21)
        }

        val intent22 = Intent(this, PoleMaki::class.java)
        var gl =findViewById<ImageButton>(R.id.imageButton31)
        gl.setOnClickListener {
            startActivity(intent22)
        }

        val intent23 = Intent(this, Mindal::class.java)
        var gg =findViewById<ImageButton>(R.id.imageButton32)
        gg.setOnClickListener {
            startActivity(intent23)
        }

        val intent24 = Intent(this, Guk::class.java)
        var pl =findViewById<ImageButton>(R.id.imageButton33)
        pl.setOnClickListener {
            startActivity(intent24)
        }

        val intent25 = Intent(this, Butterflies::class.java)
        var gd =findViewById<ImageButton>(R.id.imageButton34)
        gd.setOnClickListener {
            startActivity(intent25)
        }

        val intent26 = Intent(this, Irises::class.java)
        var fd =findViewById<ImageButton>(R.id.imageButton35)
        fd.setOnClickListener {
            startActivity(intent26)
        }

        val intent27 = Intent(this, PinkRoses::class.java)
        var fc =findViewById<ImageButton>(R.id.imageButton36)
        fc.setOnClickListener {
            startActivity(intent27)
        }

        val intent28 = Intent(this, Green::class.java)
        var fv =findViewById<ImageButton>(R.id.imageButton39)
        fv.setOnClickListener {
            startActivity(intent28)
        }

        val intent29 = Intent(this, DoctorGashe::class.java)
        var fa =findViewById<ImageButton>(R.id.imageButton40)
        fa.setOnClickListener {
            startActivity(intent29)
        }

        val intent30 = Intent(this, PinkR::class.java)
        var fh =findViewById<ImageButton>(R.id.imageButton41)
        fh.setOnClickListener {
            startActivity(intent30)
        }

        val intent31 = Intent(this, Adelina::class.java)
        var fm =findViewById<ImageButton>(R.id.imageButton42)
        fm.setOnClickListener {
            startActivity(intent31)
        }

        val intent32 = Intent(this, Vinogradniki::class.java)
        var fn =findViewById<ImageButton>(R.id.imageButton43)
        fn.setOnClickListener {
            startActivity(intent32)
        }

        val intent33 = Intent(this, Pole::class.java)
        var nk =findViewById<ImageButton>(R.id.imageButton44)
        nk.setOnClickListener {
            startActivity(intent33)
        }

        val intent34 = Intent(this, Margaritki::class.java)
        var lp =findViewById<ImageButton>(R.id.imageButton45)
        lp.setOnClickListener {
            startActivity(intent34)
        }

        val intent35 = Intent(this, Mlva::class.java)
        var mk =findViewById<ImageButton>(R.id.imageButton46)
        mk.setOnClickListener {
            startActivity(intent35)
        }
    }
}



