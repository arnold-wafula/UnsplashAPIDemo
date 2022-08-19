package com.lemonboy.unsplashdemoapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lemonboy.unsplashdemoapi.ui.theme.UnsplashDemoAPITheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * @AndroidEntryPoint since our activity will contain
 * all the screens and components which we will inject
 * dependencies
 * */

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnsplashDemoAPITheme {
                
            }
        }
    }
}