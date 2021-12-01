package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class Mm4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mm4)

        val search = findViewById<LinearLayout>(R.id.search)

        search.setOnClickListener{
            startActivity(Intent(this,Mm8::class.java))
        }

        val layoutpizza = findViewById<LinearLayout>(R.id.layoutpizza)

        layoutpizza.setOnClickListener{
            startActivity(Intent(this,Mm10::class.java))
        }

        val layoutbrownies = findViewById<LinearLayout>(R.id.layoutbrownies)

        layoutbrownies.setOnClickListener{
            startActivity(Intent(this,Mm11::class.java))
        }

        val liked = findViewById<ImageView>(R.id.liked_bottom)

        liked.setOnClickListener{
            startActivity(Intent(this,Mm5::class.java))
        }

        val myrecipes = findViewById<ImageView>(R.id.myrecipes_bottom)

        myrecipes.setOnClickListener{
            startActivity(Intent(this,Mm6::class.java))
        }


    }
}