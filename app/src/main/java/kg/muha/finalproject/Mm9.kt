package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class Mm9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mm9)

        val discover = findViewById<ImageView>(R.id.discover_bottom)

        discover.setOnClickListener{
            startActivity(Intent(this,Mm4::class.java))
        }

        val liked = findViewById<ImageView>(R.id.liked_bottom)

        liked.setOnClickListener{
            startActivity(Intent(this,Mm5::class.java))
        }

        val back2 = findViewById<ImageView>(R.id.back2)

        back2.setOnClickListener{
            startActivity(Intent(this,Mm7::class.java))
        }

        val chek = findViewById<ImageView>(R.id.chek)

        chek.setOnClickListener{
            startActivity(Intent(this,Mm7::class.java))
        }


    }
}