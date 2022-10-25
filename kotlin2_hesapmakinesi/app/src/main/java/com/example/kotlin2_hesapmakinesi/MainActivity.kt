package com.example.kotlin2_hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toplama(view: View) {
        var sayi1=sayi1.text.toString().toIntOrNull()
        var sayi2=sayi2.text.toString().toIntOrNull()
        if(sayi1!=null && sayi2!= null)
        {
            var toplam=sayi1+sayi2
            sonuc.text="Sonuc: ${toplam}"
        }
        else
            sonuc.text="yanlış veri türü girişi"



    }

    fun cikarma(view: View) {
        var sayi1=sayi1.text.toString().toIntOrNull()
        var sayi2=sayi2.text.toString().toIntOrNull()
        if(sayi1!=null && sayi2!= null)
        {
            var toplam=sayi1-sayi2
            sonuc.text="Sonuc: ${toplam}"
        }
        else
            sonuc.text="yanlış veri türü girişi"
    }

    fun carpma(view: View) {
        var sayi1=sayi1.text.toString().toIntOrNull()
        var sayi2=sayi2.text.toString().toIntOrNull()
        if(sayi1!=null && sayi2!= null)
        {
            var toplam=sayi1*sayi2
            sonuc.text="Sonuc: ${toplam}"
        }
        else
            sonuc.text="yanlış veri türü girişi"
    }

    fun bolme(view: View) {
        var sayi1=sayi1.text.toString().toDoubleOrNull()
        var sayi2=sayi2.text.toString().toDoubleOrNull()
        if(sayi1!=null && sayi2!= null)
        {
            var toplam:Double
            toplam=sayi1/sayi2
            sonuc.text="Sonuc: ${toplam}"
        }
        else
            sonuc.text="yanlış veri türü girişi"
    }
}