package com.feature.movie.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.common.navigation_constants.MovieFeature
import com.core.feature_api.FeatureApi

object InternalMovieFeatureApi:FeatureApi {
    override fun registerGraph(navController: NavController, navGraphBuilder: NavGraphBuilder) {

        navGraphBuilder.navigation(startDestination = MovieFeature.movieScreenRoute, route = MovieFeature.movieScreenRoute){
            composable("movie"){

            }
        }

    }
}