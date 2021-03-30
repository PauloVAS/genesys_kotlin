package com.example.genesys.ui.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.genesys.R

class CadastrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cadastrar)

        val nome = findViewById<EditText>(R.id.nome)
        val endereco = findViewById<EditText>(R.id.endereco)
        val numero = findViewById<EditText>(R.id.numero)
        val cep = findViewById<EditText>(R.id.cep)
        val complemento = findViewById<EditText>(R.id.complemento)
        val cadastrar = findViewById<Button>(R.id.cadastrar)

    }
}