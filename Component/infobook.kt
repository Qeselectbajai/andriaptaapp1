// infobook.kt
package com.example.utsmobcom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun BookInfoPanel(navController: NavHostController, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFF989898))
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Judul : ${DataBuku.title}",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Text(
                text = "Pengarang : ${DataBuku.author}",
                color = Color.White,
                fontSize = 12.sp
            )
        }

        Button(
            onClick = { navController.navigate("edit") },
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 7.dp)
        ) {
            Text(text = "Edit", color = Color.White, fontSize = 12.sp)
        }
    }
}
