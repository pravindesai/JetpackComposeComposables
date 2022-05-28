package com.pravin.jetpackcompose.bottom_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationScreen(val rout: String, val title: String, val icon: ImageVector) {
    object Home : BottomNavigationScreen("home", "Home", Icons.Default.Home)
    object Profile : BottomNavigationScreen("profile", "Profile", Icons.Default.Person)
    object Setting : BottomNavigationScreen("setting", "Setting", Icons.Default.Settings)
}