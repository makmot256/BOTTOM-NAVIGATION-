package com.example.bottomnavigation
import androidx.compose.foundation.Image
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.ColorFilter

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bottomnavigation.myicons

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Mainscreen() {
    val icons = listOf(
        myicons("Favorites",R.drawable.favorites, "Favorites"),
        myicons("Things", R.drawable.things, "Things"),
        myicons("Routines", R.drawable.routines, "Routines"),
        myicons("Ideas", R.drawable.ideasicon, "Ideas"),
        myicons("Settings", R.drawable.settingsicon, "Settings")


    )
    var indexselect by remember { mutableStateOf(0) }



    Scaffold(modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                icons.forEachIndexed { index,myicons->

                    NavigationBarItem(
                        selected = indexselect == index,
                        onClick = { indexselect = index
                                  },
                        icon = {
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .background(
                                        color = if (indexselect == index) Color.Yellow else Color.Transparent,
                                        shape = CircleShape
                                    )
                                    .padding(6.dp) // Add padding so icon is visible
                            ) {

                            Image(painter = painterResource(id=myicons.icon), contentDescription = myicons.title,
                            modifier = Modifier .size(24.dp)    // Fixed size
                            .padding(4.dp)//,
//                                colorFilter = if (indexselect == index)
//                                    ColorFilter.tint(Color.Yellow) // Tint when selected
//                                else
//                                    null

                                )} },
                        label = { Text(text = myicons.label) }, // ✅ Wrap Text inside {}

                    )

                }
            }




        }










    ) { innerPadding ->

        myscreens(modifier = Modifier.padding(innerPadding), indexselect )


    }



}

@Composable
fun myscreens(modifier: Modifier= Modifier,selectedindex: Int){
    when(selectedindex){
        0->NoFavoritesScreen()
        1->NoDevicesScreen()



    }


}