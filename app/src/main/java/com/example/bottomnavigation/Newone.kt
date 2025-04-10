package com.example.bottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun MySmartHomeScreens() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // App Title
        Text(
            text = "My Smart Home",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color(0xFFFFC107))
                .padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Placeholder for No Devices Found Icon
        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_info_details),
            contentDescription = "No devices found"
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "No things!", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Text(
            text = "It looks like we didn't discover any devices.\nTry an option below",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Options List
        OptionRow(icon = android.R.drawable.ic_menu_search, text = "Run discovery")
        OptionRow(icon = android.R.drawable.ic_menu_add, text = "Add a cloud account")
        OptionRow(icon = android.R.drawable.ic_menu_info_details, text = "View our supported devices")
        OptionRow(icon = android.R.drawable.ic_menu_send, text = "Contact support")
    }
}

@Composable
fun OptionRow(icon: Int, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
    ) {
        Button(
            onClick = { /* TODO: Implement Action */ },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3)),
            modifier = Modifier.size(40.dp) // Set fixed size for button
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = text
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Text(text = text, fontSize = 16.sp)
    }
}