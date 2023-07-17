package com.core.network.dataproviders

import com.core.network.ApiService
import javax.inject.Inject

class MovieDataProviders @Inject constructor(var networkService: ApiService) {
    suspend fun getMoviesList(apiKey: String, q: String) = networkService.getMovieList(apiKey, q)
}