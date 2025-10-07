package com.example.multiscreenapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(userId: String?) {
    Column(modifier = Modifier.padding(24.dp)) {
        Text("Profile Screen")
        Text("User ID: $userId")
    }
}
