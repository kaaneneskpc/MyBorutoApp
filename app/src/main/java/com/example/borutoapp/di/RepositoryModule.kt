package com.example.borutoapp.di

import android.content.Context
import com.example.borutoapp.data.repository.DataStoreOperationsImpl
import com.example.borutoapp.data.repository.Repository
import com.example.borutoapp.domain.repository.DataStoreOperations
import com.example.borutoapp.domain.useCase.UseCases
import com.example.borutoapp.domain.useCase.getAllHeroes.GetAllHeroesUseCase
import com.example.borutoapp.domain.useCase.readOnboardingUsecase.ReadOnBoardingUseCase
import com.example.borutoapp.domain.useCase.saveOnboardingUsecase.SaveOnBoardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository)
        )
    }

}