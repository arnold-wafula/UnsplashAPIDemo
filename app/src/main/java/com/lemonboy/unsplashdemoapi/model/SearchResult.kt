package com.lemonboy.unsplashdemoapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResult(
    @SerialName("results") val images: List<UnsplashImage>,
)