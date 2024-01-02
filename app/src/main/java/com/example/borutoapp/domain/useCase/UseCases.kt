package com.example.borutoapp.domain.useCase

import com.example.borutoapp.domain.useCase.getAllHeroes.GetAllHeroesUseCase
import com.example.borutoapp.domain.useCase.readOnboardingUsecase.ReadOnBoardingUseCase
import com.example.borutoapp.domain.useCase.saveOnboardingUsecase.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase
)