package app.adachenko.mymovies.data.network

import app.adachenko.mymovies.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>
}