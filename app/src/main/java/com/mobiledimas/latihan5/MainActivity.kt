package com.mobiledimas.latihan5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var Nama : EditText
    lateinit var pass : EditText
    lateinit var Button1 : Button
    lateinit var Button2 : Button
    lateinit var Button3 : Button
    lateinit var Button4 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Nama = findViewById(R.id.nama)
        pass = findViewById(R.id.pass)
        Button1 = findViewById(R.id.button)
        Button2 = findViewById(R.id.button2)
        Button3 = findViewById(R.id.button3)
        Button4 = findViewById(R.id.button4)

        Button1.setOnClickListener(){
            val Nama = Nama.text.toString()
            val password = pass.text.toString()

            if (Nama == "dimas" && password == "123") {
                val intent = Intent(this, suhu::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }
        Button2.setOnClickListener(){
            val Nama = Nama.text.toString()
            val password = pass.text.toString()

            if (Nama == "dimas" && password == "123") {
                val intent = Intent(this, belanja::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }
        Button3.setOnClickListener(){
            val Nama = Nama.text.toString()
            val password = pass.text.toString()

            if (Nama == "dimas" && password == "123") {
                val intent = Intent(this, luas::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }

        Button4.setOnClickListener(){
            val Nama = Nama.text.toString()
            val password = pass.text.toString()

            if (Nama == "dimas" && password == "123") {
                val intent = Intent(this, pyhton::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}