package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signin = findViewById<Button>(R.id.signin)

        signin.setOnClickListener{
            startActivity(Intent(this,EmailActivity::class.java))
        }
    }
}