package com.example.ac

import ResultActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class QuestionActivity : AppCompatActivity() {

    private lateinit var rgQuestion1: RadioGroup
    private lateinit var rgQuestion2: RadioGroup
    private lateinit var rgQuestion3: RadioGroup
    private lateinit var rgQuestion4: RadioGroup
    private lateinit var rgQuestion5: RadioGroup
    private lateinit var rgQuestion6: RadioGroup
    private lateinit var rgQuestion7: RadioGroup
    private lateinit var rgQuestion8: RadioGroup
    private lateinit var rgQuestion9: RadioGroup
    private lateinit var rgQuestion10: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        rgQuestion1 = findViewById(R.id.rgQuestion1)
        rgQuestion2 = findViewById(R.id.rgQuestion2)
        rgQuestion3 = findViewById(R.id.rgQuestion3)
        rgQuestion4 = findViewById(R.id.rgQuestion4)
        rgQuestion5 = findViewById(R.id.rgQuestion5)
        rgQuestion6 = findViewById(R.id.rgQuestion6)
        rgQuestion7 = findViewById(R.id.rgQuestion7)
        rgQuestion8 = findViewById(R.id.rgQuestion8)
        rgQuestion9 = findViewById(R.id.rgQuestion9)
        rgQuestion10 = findViewById(R.id.rgQuestion10)

        findViewById<Button>(R.id.btnSubmit).setOnClickListener {
            val score = calculateScore()
            val result = determineResult(score)
            val intent = Intent(this@QuestionActivity, ResultActivity::class.java)
            intent.putExtra("RESULT", result)
            startActivity(intent)
        }
    }

    private fun calculateScore(): Int {
        var score = 0

        score += getScoreFromRadioGroup(rgQuestion1)
        score += getScoreFromRadioGroup(rgQuestion2)
        score += getScoreFromRadioGroup(rgQuestion3)
        score += getScoreFromRadioGroup(rgQuestion4)
        score += getScoreFromRadioGroup(rgQuestion5)
        score += getScoreFromRadioGroup(rgQuestion6)
        score += getScoreFromRadioGroup(rgQuestion7)
        score += getScoreFromRadioGroup(rgQuestion8)
        score += getScoreFromRadioGroup(rgQuestion9)
        score += getScoreFromRadioGroup(rgQuestion10)

        return score
    }

    private fun getScoreFromRadioGroup(radioGroup: RadioGroup): Int {
        return when (radioGroup.checkedRadioButtonId) {
            R.id.rbQ1A1, R.id.rbQ3A1, R.id.rbQ5A1, R.id.rbQ8A1, R.id.rbQ10A1,
            R.id.rbQ2A1, R.id.rbQ4A1, R.id.rbQ6A1, R.id.rbQ7A1, R.id.rbQ9A1 -> 4
            R.id.rbQ1A2, R.id.rbQ3A2, R.id.rbQ5A2, R.id.rbQ8A2, R.id.rbQ10A2,
            R.id.rbQ2A2, R.id.rbQ4A2, R.id.rbQ6A2, R.id.rbQ7A2, R.id.rbQ9A2 -> 3
            R.id.rbQ1A3, R.id.rbQ3A3, R.id.rbQ5A3, R.id.rbQ8A3, R.id.rbQ10A3,
            R.id.rbQ2A3, R.id.rbQ4A3, R.id.rbQ6A3, R.id.rbQ7A3, R.id.rbQ9A3 -> 2
            R.id.rbQ1A4, R.id.rbQ3A4, R.id.rbQ5A4, R.id.rbQ8A4, R.id.rbQ10A4,
            R.id.rbQ2A4, R.id.rbQ4A4, R.id.rbQ6A4, R.id.rbQ7A4, R.id.rbQ9A4 -> 1
            else -> 0
        }
    }

    private fun determineResult(score: Int): String {
        return when {
            score >= 35 -> "Você é uma pessoa fiel e confiável"
            score >= 20 -> "Você é uma pessoa boa, porém tem que ficar de olho"
            else -> "Eu tenteiiiii, não ser moleque com você eu tentei"
        }
    }
}
