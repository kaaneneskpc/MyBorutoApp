package com.example.borutoapp.domain.useCase.getAllHeroes

import androidx.paging.PagingData
import com.example.borutoapp.data.repository.Repository
import com.example.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }
}