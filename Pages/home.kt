// home.kt
package com.example.utsmobcom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Andri Apta APP", color = Color.Black, fontSize = 18.sp) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFCECECE)
                )
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        MainContent(navController, Modifier.padding(innerPadding))
    }
}

@Composable
fun MainContent(navController: NavHostController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF12202F))
            .padding(10.dp)
    ) {
        BookInfoPanel(navController)

        Button(
            onClick = { /* TODO: Handle TAMBAH BUKU action */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .height(55.dp)
        ) {
            Text(text = "TAMBAH\nBUKU", color = Color.White, fontSize = 12.sp, lineHeight = 14.sp)
        }
    }
}
