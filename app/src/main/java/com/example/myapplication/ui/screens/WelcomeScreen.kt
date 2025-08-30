package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun WelcomeScreen(modifier: Modifier) {
    Column (modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier,
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = "welcome"
        )
    }
    Column(
        modifier = Modifier.fillMaxWidth().padding(top = 350.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Discover your",
            fontSize = 33.sp, color = Color.Blue)
        Text("Dream Job here",
            fontSize = 33.sp, color = Color.Blue)
        Spacer(Modifier.height(15.dp))
        Text("Explore all the existing job roles based on your",
            fontSize = 14.sp, color = Color.Black)
        Text("interest and study major",
            fontSize = 14.sp, color = Color.Black)
    }
    Row(
        Modifier.fillMaxWidth().padding(top = 510.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(onClick = { },
            modifier = Modifier
                .width(160.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White,
            ),
            shape = RoundedCornerShape(12.dp)
        ) { Text("Login") }

        Button(onClick = { },
            modifier = Modifier
                .width(160.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            ),
            shape = RoundedCornerShape(12.dp)
        ) { Text("Register") }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(Modifier.fillMaxSize())
}
