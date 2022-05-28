package com.pravin.jetpackcompose.screens_navigation

sealed class Screen(var routs:String) {
    object FirstScreen:Screen("First Screen")
    object SecondScreen:Screen("Second Screen")

    fun withArgs(vararg args:String):String{
        return buildString {
            append(routs)
            args.forEach {arg->
                append("/$arg")
            }
        }
    }
}