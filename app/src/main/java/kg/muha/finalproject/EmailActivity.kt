package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        val signin2 = findViewById<Button>(R.id.signin2)

        signin2.setOnClickListener{
            startActivity(Intent(this,DiscoverActivity::class.java))
        }
    }
}