package com.pravin.jetpackcompose.screens_navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
@Preview
fun NavigationDesign() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.FirstScreen.routs) {
        composable(route = Screen.FirstScreen.routs) {
            FirstScreen(navController = navController)
        }
        composable(route = Screen.SecondScreen.routs+"/{data}",
                    arguments = listOf(
                        navArgument("data"){
                            type = NavType.StringType
                            defaultValue = "DEFAULT"
                            nullable = true
                        }
                    )) {args->
            SecondScreen(data = args.arguments?.getString("data")?:"" , navController = navController)
        }
    }
}