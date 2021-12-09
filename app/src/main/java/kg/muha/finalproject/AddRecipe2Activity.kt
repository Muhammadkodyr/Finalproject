package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AddRecipe2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipe_2)

        val discover = findViewById<ImageView>(R.id.discover_bottom)

        discover.setOnClickListener{
            startActivity(Intent(this,DiscoverActivity::class.java))
        }

        val liked = findViewById<ImageView>(R.id.liked_bottom)

        liked.setOnClickListener{
            startActivity(Intent(this,LikedActivity::class.java))
        }

        val back2 = findViewById<ImageView>(R.id.back2)

        back2.setOnClickListener{
            startActivity(Intent(this,AddRecipeActivity::class.java))
        }

        val chek = findViewById<ImageView>(R.id.chek)

        chek.setOnClickListener{
            startActivity(Intent(this,AddRecipeActivity::class.java))
        }


    }
}