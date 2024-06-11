package com.example.ac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_formulario)


        val proximo = findViewById<Button>(R.id.next)
        proximo.setOnClickListener {
            val intent = Intent(this@Formulario, Questionario::class.java)
            startActivity(intent)
        }
    }
}