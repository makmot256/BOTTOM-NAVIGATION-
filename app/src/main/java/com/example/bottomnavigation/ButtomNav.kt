package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ButtomNav
    (
            val route: String,
            val title: String,
            val icon: ImageVector


            )
{
       object favorites: ButtomNav(
           route = "favorites",
           title = "Favorites",
           icon =Icons.Default.Home

       )




    object things: ButtomNav(
        route = "things",
        title = "Things",
        icon =Icons.Default.Home

    )


    object routines: ButtomNav(
        route = "routines",
        title = "Routines",
        icon =Icons.Default.Home

    )

    object ideas: ButtomNav(
        route = "ideas",
        title = "Ideas",
        icon =Icons.Default.Home

    )

    object settings: ButtomNav(
        route = "settings",
        title = "Settings",
        icon =Icons.Default.Home

    )



}