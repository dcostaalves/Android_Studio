package com.example.android.marsphotos.network


class MarsApiService (){
    private const val BASE_URL ="https://android-kotlin-fun-mars-server.appspot.com"
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    interface MarsApiService {
        @GET("photos")
       suspend fun getPhotos(): String
    }

}

object MarsApi {

    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)}

}


