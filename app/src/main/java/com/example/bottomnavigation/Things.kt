package com.example.bottomnavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottomnavigation.R

@Composable
fun NoFavoritesScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize() // Makes it cover the full screen
            .border(4.dp, Color.Red, shape = RectangleShape) // Adds a red border
            .padding(16.dp) // Optional: Adds padding inside the border
    ) {






    Scaffold(
        topBar = { TopBarWithEditIcon() },
        floatingActionButton = { FloatingAddButton() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Star Icon
            Image(
                painter = painterResource(id = R.drawable.favorites),
                contentDescription = "Device Icon",
                modifier = Modifier.size(80.dp)
            )


            Spacer(modifier = Modifier.height(10.dp))

            // Title
            Text(
                text = "No Favorites!",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )

            // Subtitle
            Text(
                text = "Add your favorite routines for easy access here.\n\n" +
                        "Tap the '+' button below to add your favorite routines.",
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(16.dp),
                lineHeight = 18.sp
            )



        }
    }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarWithEditIcon() {
    TopAppBar(
        title = {
            Text("My Smart Home",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(30.dp)) },
        actions = {
            IconButton(onClick = { /* Handle edit action */ }) {
                Icon(Icons.Default.Edit, contentDescription = "Edit", tint = Color.White)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFFFD700))
    )
}

@Composable
fun FloatingAddButton() {
    FloatingActionButton(
        onClick = {  },
        containerColor = Color(0xFF03A9F4),
        shape = CircleShape
    ) {
        Icon(Icons.Default.Add, contentDescription = "Add", tint = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNoFavoritesScreen() {
    NoFavoritesScreen()
}

