package com.pravin.jetpackcompose.screens

sealed class Screen(var routs:String) {
    object FirstScreen:Screen("First Screen")
    object SecondScreen:Screen("Second Screen")
}