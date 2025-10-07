package com.example.multiscreenapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiscreenapp.viewmodel.SettingsViewModel

@Composable
fun SettingsScreen(
    navController: NavController,
    viewModel: SettingsViewModel = viewModel()
) {
    val username by viewModel.username.collectAsState()
    Column(modifier = Modifier.padding(24.dp)) {
        Text("⚙ Settings Screen")
        UsernameInput(username = username, onUsernameChange = viewModel::updateUsername)
        Text("Current username: $username")
    }
}

@Composable
fun UsernameInput(username: String, onUsernameChange: (String) -> Unit) {
    TextField(
        value = username,
        onValueChange = onUsernameChange,
        label = { Text("Enter your name") }
    )
}
