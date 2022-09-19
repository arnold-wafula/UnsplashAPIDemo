package com.lemonboy.unsplashdemoapi.screens.home

import androidx.lifecycle.ViewModel
import androidx.paging.ExperimentalPagingApi
import com.lemonboy.unsplashdemoapi.data.repository.Repository
import dagger.Provides
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@ExperimentalPagingApi
@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: Repository
): ViewModel() {
    val getAllImages = repository.getAllImages()
}