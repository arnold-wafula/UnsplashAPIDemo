package com.lemonboy.unsplashdemoapi.model

import androidx.room.Embedded
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @Embedded tells Room library that userlinks contains a nested class
 * and how to store it
 * */

@Serializable
data class User(
    @SerialName("links")
    @Embedded
    val userLinks: UserLinks,
    val username: String
)