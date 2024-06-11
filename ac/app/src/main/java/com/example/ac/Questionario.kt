package com.example.ac

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar


class Questionario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_questionario)


        val pergunta2 = findViewById<CheckBox>(R.id.baixoRisco)
        val pergunta3 = findViewById<CheckBox>(R.id.retornoRapido)
        val pergunta4 = findViewById<SeekBar>(R.id.tolerancia2)
        val pergunta5 = findViewById<CheckBox>(R.id.investimentoSustentavel)
        val pergunta6 = findViewById<CheckBox>(R.id.diversificacao)
        val enviar = findViewById<Button>(R.id.envio)

        enviar.setOnClickListener {
            val intent = Intent(this@Questionario, Resultado::class.java)

            intent.putExtra("BAIXO RISCO", pergunta2.isChecked)
            intent.putExtra("RETORNO RÁPIDO", pergunta3.isChecked)
            intent.putExtra("NIVEL DE TOLERÂNCIA", pergunta4.progress)
            intent.putExtra("INVESTIMENTO SUSTENTÁVEL", pergunta5.isChecked)
            intent.putExtra("DIVERSIFICAÇÃO", pergunta6.isChecked)

            startActivity(intent)
        }
    }
}
