package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mm2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mm2)

        val signin = findViewById<Button>(R.id.signin)

        signin.setOnClickListener{
            startActivity(Intent(this,Mm3::class.java))
        }
    }
}