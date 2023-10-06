package com.example.flixstercjj22

import com.google.gson.annotations.SerializedName

class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("poster_path")
    var posterPath: String? = null

    @SerializedName("overview")
    var overview: String? = null

    @SerializedName("release_date")
    var releasedate: String? = null

    @SerializedName("popularity")
    var popularity: String? = null

    @SerializedName("vote_average")
    var voteAverage: String? = null

}
