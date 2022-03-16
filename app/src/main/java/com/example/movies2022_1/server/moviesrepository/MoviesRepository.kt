package com.example.movies2022_1.server.moviesrepository

import com.example.movies2022_1.server.MovieDB
import com.example.movies2022_1.server.model.Movie

class MoviesRepository {

    private val apiKey = "6ecfc0526e52f8ac43c7622326779b41"

    suspend fun getMovies()  = MovieDB.retrofit.getTopRated(apiKey)
}