package com.feature.movie.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.feature_api.FeatureApi

object InternalMovieFeatureApi:FeatureApi {
    override fun registerGraph(navController: NavController, navGraphBuilder: NavGraphBuilder) {

        navGraphBuilder.navigation(startDestination = "", route = "movie_nested_navigation"){
            composable("movie"){

            }
        }

    }
}