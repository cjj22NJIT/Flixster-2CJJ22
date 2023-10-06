package com.example.flixstercjj22

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var releaseTextView: TextView
    private lateinit var popularityTextView: TextView
    private lateinit var voteTextView: TextView
    private lateinit var overviewTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val releaseText = "Release Date : " + intent.getStringExtra("release_date").toString()
        val titleText = intent.getStringExtra("title").toString()
        val mediaImageUrl = intent.getStringExtra("poster_path").toString()
        val popularityText = "Popularity : " + intent.getStringExtra("popularity").toString()
        val voteAverageText = "Average Vote : " + intent.getStringExtra("vote_average").toString()
        val overviewText = intent.getStringExtra("overview").toString()

        mediaImageView = findViewById(R.id.movie_image)

        titleTextView = findViewById(R.id.movie_title)
        releaseTextView = findViewById(R.id.release_date)
        popularityTextView = findViewById(R.id.popularity)
        voteTextView = findViewById(R.id.vote_average)
        overviewTextView = findViewById(R.id.movie_description)

        releaseTextView.text = releaseText
        titleTextView.text = titleText
        popularityTextView.text = popularityText
        voteTextView.text = voteAverageText
        overviewTextView.text = overviewText


        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/"+mediaImageUrl)
            .into(mediaImageView)


    }
}