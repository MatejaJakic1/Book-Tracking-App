package hr.ferit.matejajakic.mindgarden

import retrofit2.Call
import retrofit2.http.GET

interface FakerEndpoints {
    @GET("/raw/X92nDqcq")
    fun getBooks(): Call<ArrayList<BookJSON>>
}