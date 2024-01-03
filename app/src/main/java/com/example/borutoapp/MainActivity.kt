package com.example.borutoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.example.borutoapp.domain.useCase.UseCases
import com.example.borutoapp.navigation.Screen
import com.example.borutoapp.navigation.SetupNavGraph
import com.example.borutoapp.ui.theme.BorutoAppTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class, ExperimentalCoilApi::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @Inject
    lateinit var useCases: UseCases
    private var completed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            BorutoAppTheme {
                navController = rememberNavController()
                SetupNavGraph(
                    navController = navController,
                    startDestination = if (completed) Screen.Home.route else Screen.Welcome.route
                )
            }
        }

        lifecycleScope.launch(Dispatchers.IO) {
            useCases.readOnBoardingUseCase().collect {
                completed = it
            }
        }
    }
}