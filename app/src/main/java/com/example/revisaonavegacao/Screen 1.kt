package com.example.revisaonavegacao

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun Screen1(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "Screen 1") }
        }

    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {


            Text(text = "Screen 1")
            Button(onClick = {navController.navigate(Destination.ScreenSecond.route)}) {
                Text(text = "Next")
            }

        }
    }
}