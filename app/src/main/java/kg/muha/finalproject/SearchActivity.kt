package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)


        val discover = findViewById<ImageView>(R.id.discover_bottom)

        discover.setOnClickListener{
            startActivity(Intent(this,DiscoverActivity::class.java))
        }

        val liked = findViewById<ImageView>(R.id.liked_bottom)

        liked.setOnClickListener{
            startActivity(Intent(this,LikedActivity::class.java))
        }

        val myrecipes = findViewById<ImageView>(R.id.myrecipes_bottom)

        myrecipes.setOnClickListener{
            startActivity(Intent(this,MyRecipesActivity::class.java))
        }

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MyRecipesActivity::class.java))
        }

    }
}