package com.mobiledimas.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class belanja : AppCompatActivity() {

    private lateinit var total: EditText
    private lateinit var hitung: Button
    private lateinit var hasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_belanja)

        total = findViewById(R.id.total)
        hitung = findViewById(R.id.hitung)
        hasil = findViewById(R.id.txthasil)

        hitung.setOnClickListener(){
            val total_belanja = total.text.toString().toDoubleOrNull()

            if (total_belanja != null){
                val diskon = when {
                    total_belanja < 100000 -> 0.0
                    total_belanja <= 500000 -> 0.1
                    total_belanja <= 1000000 -> 0.2
                    else -> 0.3
                }
                val jumlahdiskon = total_belanja * diskon
                val total_bayar = total_belanja - jumlahdiskon

                hasil.text = "Diskon: Rp. ${jumlahdiskon.toInt()} dan Total Bayar: Rp. ${total_bayar.toInt()}"
            } else {
                hasil.text = "Masukan total belanja dengan benar"
            }
        }
    }
}