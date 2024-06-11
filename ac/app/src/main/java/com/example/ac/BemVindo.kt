package com.example.ac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ac.R

class BemVindo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)

        val botaoIniciar = findViewById<Button>(R.id.comecar)
        botaoIniciar.setOnClickListener {
            val intent = Intent(this@BemVindo, Formulario::class.java)
            startActivity(intent)
        }
    }
}