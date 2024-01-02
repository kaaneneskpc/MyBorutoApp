package com.example.borutoapp.domain.useCase.getSelectedHero

import com.example.borutoapp.data.repository.Repository
import com.example.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}