package com.ezatpanah.hilt_retrofit_paging_youtube.repository

import com.ezatpanah.hilt_retrofit_paging_youtube.api.ApiServices
import javax.inject.Inject

class ApiRepository @Inject constructor(
    private val apiServices: ApiServices,
) {
    suspend fun getPopularMoviesList(page: Int) = apiServices.getPopularMoviesList(page)
    suspend fun getMovieDetails(id: Int) = apiServices.getMovieDetails(id)
}