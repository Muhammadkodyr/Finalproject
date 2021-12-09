package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class LikedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liked)

        val layoutpizza = findViewById<LinearLayout>(R.id.layoutpizza)

        layoutpizza.setOnClickListener{
            startActivity(Intent(this,PizzaPepperoniActivity::class.java))
        }

        val layoutbrownies = findViewById<LinearLayout>(R.id.layoutbrownies)

        layoutbrownies.setOnClickListener{
            startActivity(Intent(this,BrowniesActivity::class.java))
        }

        val discover = findViewById<ImageView>(R.id.discover_bottom)

        discover.setOnClickListener{
            startActivity(Intent(this,DiscoverActivity::class.java))
        }

        val myrecipes = findViewById<ImageView>(R.id.myrecipes_bottom)

        myrecipes.setOnClickListener{
            startActivity(Intent(this,MyRecipesActivity::class.java))
        }
    }
}