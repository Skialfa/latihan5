package com.mobiledimas.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pyhton : AppCompatActivity() {

    lateinit var angka: EditText
    lateinit var hitung: Button
    lateinit var txthasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pyhton)

        angka = findViewById(R.id.angka)
        txthasil = findViewById(R.id.txthasil)
        hitung = findViewById(R.id.hitung)

        hitung.setOnClickListener {

            val nilaiAngka = angka.text.toString().toIntOrNull()

            if (nilaiAngka != null) {
                if (nilaiAngka % 2 == 0) {
                    txthasil.text = "$nilaiAngka adalah bilangan genap"
                } else {
                    txthasil.text = "$nilaiAngka adalah bilangan ganjil"
                }
            } else {
                txthasil.text = "Masukkan bilangan yang valid"
            }
        }

        }
    }