package com.example.multiscreenapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        Text(" Home Screen")
        Button(onClick = { navController.navigate("profile/42") }) {
            Text("Go to Profile (userId=Papin Eduard K-41)")
        }
        Button(onClick = { navController.navigate("settings") }) {
            Text("Go to Settings")
        }
    }
}