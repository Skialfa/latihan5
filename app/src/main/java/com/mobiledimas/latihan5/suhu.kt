package com.mobiledimas.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class suhu : AppCompatActivity() {

    private lateinit var angka1: EditText
    private lateinit var f: Button
    private lateinit var k: Button
    private lateinit var r: Button
    private lateinit var txthasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suhu)

        angka1 = findViewById(R.id.angka1)
        f = findViewById(R.id.f)
        k = findViewById(R.id.k)
        r = findViewById(R.id.r)
        txthasil = findViewById(R.id.hasil)

        f.setOnClickListener() {
            val angka1 = angka1.text.toString().toDouble()
            val hasil = 9 / 5 * angka1 + 32

            txthasil.setText("Hasilnya :" + hasil)
        }

        k.setOnClickListener() {
            val angka1 = angka1.text.toString().toDouble()
            val hasil = angka1 + 275.15

            txthasil.setText("Hasilnya :" + hasil)
        }
        r.setOnClickListener() {
            val angka1 = angka1.text.toString().toDouble()
            val hasil = 4 / 5 * angka1

            txthasil.setText("Hasilnya :" + hasil)
        }
    }
}
