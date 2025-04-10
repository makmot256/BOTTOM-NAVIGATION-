package com.example.bottomnavigation
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import org.intellij.lang.annotations.JdkConstants

@Composable
fun NoDevicesScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize() // Makes it cover the full screen
            .border(4.dp, Color.Red, shape = RectangleShape) // Adds a red border
            .padding(16.dp) // Optional: Adds padding inside the border
    ) {







    Scaffold(
        topBar = { TopBarWithMenuIcon() }
    ) { paddingValues ->


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))

            // Placeholder Icon

            Image(
                painter = painterResource(id = R.drawable.things), // Replace with your image name
                contentDescription = "Device Icon",
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Title
            Text(
                text = "No things!",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )

            // Subtitle
            Text(
                text = "It looks like we didn't discover any devices.\n\t\t\t\t\tTry an option below",
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(16.dp),
                lineHeight = 18.sp
            )
            Divider(color = Color.Gray, modifier = Modifier.padding(30.dp))
            // Spacer(modifier = Modifier.height(10.dp))
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceBetween


            ) {


            }


            OptionRows(Icons.Default.Search, text = "Run discovery")
            OptionRows(Icons.Default.Add, text = "Add a cloud account")
            OptionRows(Icons.Default.List, text = "View our supported devices")
            OptionRows(Icons.Default.Email, text = "Contact Support")


        }
    }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarWithMenuIcon() {
    TopAppBar(
        title = { Text("My Smart Home", color = Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(60.dp)) },
        actions = {
            IconButton(onClick = { /* Handle menu click */ }) {
                Icon(Icons.Default.Search, contentDescription = "Menu", tint = Color.White)
            }
            IconButton(onClick = { /* Handle menu click */ }) {
                Icon(Icons.Default.Menu, contentDescription = "Menu", tint = Color.White)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFFFD700))
    )
}




@Composable
fun OptionRows(icons: androidx.compose.ui.graphics.vector.ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
    ) {

        IconButton(
            onClick = { /* Handle click */ },
            modifier = Modifier
                .size(56.dp)  // Ensure width = height
                .clip(CircleShape)  // Apply circular clipping
                .background(Color.Blue), // Apply background explicitly
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color.Transparent // Use transparent color if needed
            )
        ) {

            Icon(
                imageVector = icons, contentDescription = "Option", tint = Color.White,
                //contentDescription = "Favorite",
                //tint = Color.White
            )
        }


        Spacer(modifier = Modifier.width(12.dp))

        Text(text = text, fontSize = 16.sp ,color = Color.Blue)
    }
}





@Preview(showBackground = true)
@Composable
fun PreviewNoDevicesScreen() {
    NoDevicesScreen()
}