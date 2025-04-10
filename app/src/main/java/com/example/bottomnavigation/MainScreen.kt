package com.example.bottomnavigation

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(){
  val navController= rememberNavController()
    Scaffold(
        bottomBar = {}
    ) {

BottomNavGraph(navController=navController)


    }




}
@Composable fun bottombar(){
    val items=listOf(

        ButtomNav.favorites,
        ButtomNav.ideas,
        ButtomNav.favorites,
        ButtomNav.ideas

    )







}