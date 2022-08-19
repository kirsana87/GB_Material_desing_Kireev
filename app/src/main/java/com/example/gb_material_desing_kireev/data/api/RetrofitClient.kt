package com.example.gb_material_desing_kireev.data.api




class RetrofitClient {
    fun getClient(): RetrofitServices {
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(createHttpClient())
            .build()

        return retrofit.create(RetrofitServices::class.java)
    }

    private fun createHttpClient(): OkHttpClient {
        val httpClient = OkHttpClient.Builder()
        httpClient
            .addInterceptor(HttpLoggingInterceptor().apply { setLevel(HttpLoggingInterceptor.Level.BODY) })
            .addInterceptor {
                it.proceed(
                    it.request()
                        .newBuilder()
                        .url(
                            it.request().url.newBuilder()
                                .addQueryParameter("api_key", BuildConfig.NASA_API_KEY).build()
                        )
                        .build()
                )
            }

        return httpClient.build()
    }
}
