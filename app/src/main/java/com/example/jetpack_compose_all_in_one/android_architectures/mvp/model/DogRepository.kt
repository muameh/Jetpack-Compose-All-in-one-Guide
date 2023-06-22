package com.example.jetpack_compose_all_in_one.android_architectures.mvp.model

import com.example.jetpack_compose_all_in_one.android_architectures.mvp.model.data.DogResponse
import retrofit2.Response


class DogRepository(private val apiService: DogApiService): IDogRepository {

    override suspend fun getDogImage(): Response<DogResponse> {
        return apiService.getRandomDog()
    }
}