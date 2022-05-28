package com.pravin.jetpackcompose.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pravin.jetpackcompose.bottom_navigation.screens.HomeScreen
import com.pravin.jetpackcompose.bottom_navigation.screens.Profile
import com.pravin.jetpackcompose.bottom_navigation.screens.Settings

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavigationScreen.Home.rout) {

        composable(route = BottomNavigationScreen.Home.rout){
            HomeScreen()
        }
        composable(route = BottomNavigationScreen.Profile.rout){
            Profile()
        }
        composable(route = BottomNavigationScreen.Setting.rout){
            Settings()
        }

    }

}