package com.lemonboy.unsplashdemoapi.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.lemonboy.unsplashdemoapi.data.remote.UnsplashApi
import com.lemonboy.unsplashdemoapi.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Describes how to provide an instance of our retrofit
 * */

@OptIn(ExperimentalSerializationApi::class)
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    /**
     * Provide instance of OkHttp client
     * Retrofit depends on OkHttp client
     * */
    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .build()
    }

    /**
     * Provide instance of Retrofit library
     * Retrofit depends on OkHttp client
     * addConverterFactory() parses the library responsible for
     * deserialization. i.e RESPONSE = JSON FORMAT
     * */
    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val contentType = "application/json".toMediaType()
        val json = Json {
            ignoreUnknownKeys = true
        }

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(json.asConverterFactory(contentType))
            .build()
    }

    /**
     * Provide instance of our UnsplashApi
     * UnsplashApi depends on Retrofit
     * */
    @Provides
    @Singleton
    fun provideUnsplashApi(retrofit: Retrofit): UnsplashApi {
        return retrofit.create(UnsplashApi::class.java)
    }
}