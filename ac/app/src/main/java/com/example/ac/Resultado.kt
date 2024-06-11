package com.example.ac

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.TextView

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        val lowRisk = intent.getBooleanExtra("BAIXO RISCO", false)
        val highReturn = intent.getBooleanExtra("RETORNO RÁPIDO", false)
        val riskTolerance = intent.getIntExtra("NÍVEL DE TOLERÂNCIA", 0)
        val sustainableInvesting = intent.getBooleanExtra("INVESTIMENTO SUSTENTÁVEL", false)
        val diversification = intent.getBooleanExtra("DIVERSIFICAÇÃO", false)


        val profile = when {
            lowRisk && sustainableInvesting -> "Conservador e Sustentável"
            highReturn && sustainableInvesting -> "Abusado e Sustentável"
            lowRisk -> "Conservador"
            highReturn -> "Abusado"
            diversification -> "Diversificado"
            else -> if (riskTolerance > 5) "Moderado" else "Conservador"
        }

        tvResult.text = "Seu perfil é: $profile"


    }
}
