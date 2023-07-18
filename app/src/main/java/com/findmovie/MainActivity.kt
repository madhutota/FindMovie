package com.findmovie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.findmovie.navigation.AppNavGraph
import com.findmovie.navigation.NavigationProvider
import com.findmovie.ui.theme.FindMovieTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationProvider: NavigationProvider
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var navHostController = NavHostController(this)
            FindMovieTheme {
                App(navHostController = navHostController, navigationProvider)
            }
        }
    }
}


@Composable
fun App(navHostController: NavHostController, navigationProvider: NavigationProvider) {
    /*Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

        AppNavGraph(navHostController = navHostController, navigationProvider = navigationProvider)

    }
*/
}