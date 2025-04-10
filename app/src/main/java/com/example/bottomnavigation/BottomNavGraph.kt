package com.example.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController){
NavHost(

    navController=navController, startDestination = ButtomNav.favorites.route){

    composable(route= ButtomNav.favorites.route){
        NoDevicesScreen()

    }

    composable(route= ButtomNav.things.route){
          NoFavoritesScreen()

    }
}

}