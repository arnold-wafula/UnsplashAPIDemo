package com.lemonboy.unsplashdemoapi.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lemonboy.unsplashdemoapi.util.Constants.UNSPLASH_REMOTE_KEYS_TABLE

/**
 * Stores the previous and next page keys in our local db
 * so that the Remote Mediator will know which page to request next
 * [Remote Mediator automatically caches data to the db]
 * */

@Entity(tableName = UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)