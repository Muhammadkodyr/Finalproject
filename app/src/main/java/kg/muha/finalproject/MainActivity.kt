package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val letsgo = findViewById<Button>(R.id.letsgo)

        letsgo.setOnClickListener{
            startActivity(Intent(this,Mm2::class.java))
        }
    }
}