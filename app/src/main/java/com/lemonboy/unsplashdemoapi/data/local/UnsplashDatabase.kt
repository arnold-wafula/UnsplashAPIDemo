package com.lemonboy.unsplashdemoapi.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lemonboy.unsplashdemoapi.data.local.dao.UnsplashImageDao
import com.lemonboy.unsplashdemoapi.data.local.dao.UnsplashRemoteKeysDao
import com.lemonboy.unsplashdemoapi.model.UnsplashImage
import com.lemonboy.unsplashdemoapi.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase: RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}