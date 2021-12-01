package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mm3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mm3)

        val signin2 = findViewById<Button>(R.id.signin2)

        signin2.setOnClickListener{
            startActivity(Intent(this,Mm4::class.java))
        }
    }
}