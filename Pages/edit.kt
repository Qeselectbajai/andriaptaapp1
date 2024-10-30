// edit.kt
package com.example.utsmobcom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.utsmobcom.ui.theme.UtsmobcomTheme

@Composable
fun EditActivity(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        BookInfoScreen(modifier = Modifier.padding(innerPadding), navController = navController)
    }
}

@Composable
fun BookInfoScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    var title by remember { mutableStateOf(DataBuku.title) }
    var author by remember { mutableStateOf(DataBuku.author) }
    var summary by remember { mutableStateOf(DataBuku.rangkuman) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFCECECE))
                .padding(16.dp)
        ) {
            Text(
                text = "Judul:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            TextField(
                value = title,
                onValueChange = { title = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Masukkan Judul") }
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Pengarang:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            TextField(
                value = author,
                onValueChange = { author = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Masukkan Pengarang") }
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Rangkuman:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            TextField(
                value = summary,
                onValueChange = { summary = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Masukkan Rangkuman") }
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier.padding(end = 16.dp)
            ) {
                Text(text = "Kembali", color = Color.White)
            }
            Button(
                onClick = {
                    // Memperbarui DataBuku dengan nilai dari form
                    DataBuku.updateData(title, author, summary)
                    navController.popBackStack() // Kembali setelah menyimpan
                },
            ) {
                Text(text = "Simpan", color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBookInfoScreen() {
    UtsmobcomTheme {
        BookInfoScreen(modifier = Modifier, navController = rememberNavController())
    }
}
