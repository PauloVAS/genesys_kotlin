package com.example.genesys.ui.login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.genesys.R

class HomeActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        val logar = findViewById<EditText>(R.id.logar)
        val cadastre = findViewById<EditText>(R.id.cadastre)
        val nassau = findViewById<EditText>(R.id.nassau)

        logar.setOnClickListener {
            // Handler code here.
            val intent = Intent(context, LoginActivity::class.java)
            startActivity(intent);
        }
        }
    }

 }