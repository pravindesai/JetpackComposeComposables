package com.pravin.jetpackcompose

import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showSystemUi = true)
fun BottomNavigationComponent(modifier: Modifier=Modifier) {
        BottomNavigation(modifier = modifier.wrapContentHeight()) {
            BottomNavigationItem(selected = true,
                onClick = { },
                icon = {
                    Icon(painter = painterResource(id = R.drawable.ic_baseline_home_24),
                    contentDescription ="" )},
                label = { Text(text = "Home")}
            )
            BottomNavigationItem(selected = false,
                onClick = { },
                icon = {
                    Icon(painter = painterResource(id = R.drawable.ic_baseline_search_24),
                        contentDescription ="" )},
                label = { Text(text = "Search")}
            )
            BottomNavigationItem(selected = false,
                onClick = { },
                icon = {
                    Icon(painter = painterResource(id = R.drawable.ic_baseline_settings_24),
                        contentDescription ="" )},
                label = { Text(text = "Setting")}
            )
            BottomNavigationItem(selected = false,
                onClick = { },
                icon = {
                    Icon(painter = painterResource(id = R.drawable.ic_baseline_person_24),
                        contentDescription ="" )},
                label = { Text(text = "Profile")}
            )
        }
}

@Composable
@Preview(showSystemUi = true)
fun BottomNavigationComponent2(modifier: Modifier=Modifier) {
    val navList  = listOf(
        NavItem.HOME,
        NavItem.SEARCH,
        NavItem.SETTING,
        NavItem.PROFILE
    )

    BottomNavigation(modifier = modifier.wrapContentHeight()) {
        navList.forEach {item->
            BottomNavigationItem(selected = (item==NavItem.HOME),
                onClick = { },
                icon = {
                    Icon(painter = painterResource(id = item.icon),
                        contentDescription ="" )},
                label = { Text(text = item.title)}
            )
        }
    }
}

sealed class NavItem(val title:String, var icon:Int){
    object HOME:NavItem("Home", R.drawable.ic_baseline_home_24)
    object SEARCH:NavItem("Search", R.drawable.ic_baseline_search_24)
    object SETTING:NavItem("Setting", R.drawable.ic_baseline_settings_24)
    object PROFILE:NavItem("Profile", R.drawable.ic_baseline_person_24)
}