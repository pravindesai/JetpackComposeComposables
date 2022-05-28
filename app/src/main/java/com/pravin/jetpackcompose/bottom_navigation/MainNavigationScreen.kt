package com.pravin.jetpackcompose.bottom_navigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
@Preview(showSystemUi = true)
fun MainNavigationScreen() {
    var navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navHostController = navController)}
    ) {
            BottomNavGraph(navController = navController)
    }
}

@Composable
fun BottomBar(navHostController: NavHostController){
    val screens = listOf<BottomNavigationScreen>(
        BottomNavigationScreen.Home,
        BottomNavigationScreen.Profile,
        BottomNavigationScreen.Setting
    )

    val navBackstackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination  = navBackstackEntry?.destination

    BottomNavigation() {
        screens.forEach {
            AddItem(screen = it, currentDestination =currentDestination , navHostController =navHostController )
        }
    }

}

@Composable
fun RowScope.AddItem(
    screen: BottomNavigationScreen,
    currentDestination: NavDestination?,
    navHostController: NavHostController
){
        BottomNavigationItem(label = { Text(text = screen.title) },
                            icon = { Icon(imageVector = screen.icon, contentDescription = screen.title) },
                            selected = currentDestination?.hierarchy?.any {
                                it.route == screen.rout
                            }==true,
                            onClick = {
                                navHostController.navigate(screen.rout){
                                    popUpTo(navHostController.graph.findStartDestination().id)
                                    launchSingleTop = true
                                }
                            },
                          unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
                )
}