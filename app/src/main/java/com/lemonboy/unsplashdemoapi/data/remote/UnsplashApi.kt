package com.lemonboy.unsplashdemoapi.data.remote

import com.lemonboy.unsplashdemoapi.BuildConfig
import com.lemonboy.unsplashdemoapi.model.SearchResult
import com.lemonboy.unsplashdemoapi.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    /**
     * HTTP request to send @GET
     * Endpoint to be used /photos
     * Return type is List
     * The @Headers annotation is used to define our API Key
     * */
    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashImage>

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("query") query: String,
        @Query("per_page") perPage: Int
    ): SearchResult
}