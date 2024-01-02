package com.example.borutoapp.domain.useCase

import com.example.borutoapp.domain.useCase.getAllHeroes.GetAllHeroesUseCase
import com.example.borutoapp.domain.useCase.getSelectedHero.GetSelectedHeroUseCase
import com.example.borutoapp.domain.useCase.readOnboardingUsecase.ReadOnBoardingUseCase
import com.example.borutoapp.domain.useCase.saveOnboardingUsecase.SaveOnBoardingUseCase
import com.example.borutoapp.domain.useCase.searchHeroes.SearchHeroesUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase,
    val getSelectedHeroUseCase: GetSelectedHeroUseCase
)