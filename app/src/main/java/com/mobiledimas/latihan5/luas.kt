package com.mobiledimas.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class luas : AppCompatActivity() {

    private lateinit var panjang: EditText
    private lateinit var lebar: EditText
    private lateinit var tinggi: EditText
    private lateinit var hitung: Button
    private lateinit var hasilluas: TextView
    private lateinit var hasilvolume: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luas)

         panjang = findViewById(R.id.panjang)
         lebar = findViewById(R.id.lebar)
         tinggi = findViewById(R.id.tinggi)
         hitung = findViewById(R.id.hitung)
         hasilluas = findViewById(R.id.hasilluas)
         hasilvolume = findViewById(R.id.hasilvolume)

        hitung.setOnClickListener {
            val panjang = panjang.text.toString().toDoubleOrNull()
            val lebar = lebar.text.toString().toDoubleOrNull()
            val tinggi = tinggi.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null && tinggi != null) {

                val luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)
                val volume = panjang * lebar * tinggi

                // Menampilkan hasil
                hasilluas.text = "Luas Permukaan: $luasPermukaan"
                hasilvolume.text = "Volume: $volume"
            } else {
                hasilluas.text = "Masukkan dimensi yang valid!"
                hasilvolume.text = "Masukan dimensi yang valid"
            }
        }

    }
}