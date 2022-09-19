package com.lemonboy.unsplashdemoapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.lemonboy.unsplashdemoapi.navigation.SetupNavGraph
import com.lemonboy.unsplashdemoapi.ui.theme.UnsplashDemoAPITheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * @AndroidEntryPoint since our activity will contain
 * all the screens and components which we will inject
 * dependencies
 * */

@OptIn(ExperimentalCoilApi::class)
@ExperimentalPagingApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnsplashDemoAPITheme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}