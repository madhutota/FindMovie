package com.feature.movie.domain.repo

import com.feature.movie.domain.model.Movie

interface MovieRepository {
    suspend fun getMoviesList(apiKey: String, q: String): List<Movie>
}