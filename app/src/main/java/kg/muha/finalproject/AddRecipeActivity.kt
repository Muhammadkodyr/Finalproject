package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class AddRecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipe)

        val discover = findViewById<ImageView>(R.id.discover_bottom)

        discover.setOnClickListener{
            startActivity(Intent(this,DiscoverActivity::class.java))
        }

        val liked = findViewById<ImageView>(R.id.liked_bottom)

        liked.setOnClickListener{
            startActivity(Intent(this,LikedActivity::class.java))
        }

        val plus = findViewById<LinearLayout>(R.id.plus)

        plus.setOnClickListener{
            startActivity(Intent(this,AddRecipe2Activity::class.java))
        }
    }
}