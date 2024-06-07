package com.example.ac

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnStart).setOnClickListener {
            val intent = Intent(this@MainActivity, QuestionActivity::class.java)
            startActivity(intent)
            finish() // Remove a atividade atual da pilha ao iniciar a próxima
        }

    }
}
