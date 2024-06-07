import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ac.R
import android.widget.Button
import android.widget.TextView
import com.example.ac.MainActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnRestartQuiz = findViewById<Button>(R.id.btnRestartQuiz)
        val btnOpenWebsite = findViewById<Button>(R.id.btnOpenWebsite)

        val result = intent.getStringExtra("RESULT")
        tvResult.text = result

        btnRestartQuiz.setOnClickListener {
            val intent = Intent(this@ResultActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Remova a atividade atual da pilha ao iniciar a próxima
        }

        btnOpenWebsite.setOnClickListener {
            // Abrir a URL no navegador padrão do dispositivo
            val url = "https://www.semprefamilia.com.br/casamento-e-compromisso/dicas-para-se-tornar-um-marido-melhor/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}
