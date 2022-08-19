package com.lemonboy.unsplashdemoapi.di

import android.content.Context
import androidx.room.Room
import com.lemonboy.unsplashdemoapi.data.local.UnsplashDatabase
import com.lemonboy.unsplashdemoapi.util.Constants.UNSPLASH_DATABASE
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

/**
 * Database instance class
 * How to provide instance of Room DB
 * */

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    fun provideDatabase(
        @ApplicationContext context: Context):
            UnsplashDatabase {
        return Room.databaseBuilder(context, UnsplashDatabase::class.java, UNSPLASH_DATABASE).build()
    }
}