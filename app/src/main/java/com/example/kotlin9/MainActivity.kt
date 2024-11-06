package com.example.kotlin9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin9.ui.theme.Kotlin9Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin9Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainContent(
                        name = "Bondarenko Elizaveta",
                        lastName = "Alekseevna",
                        group = "IKBO-11-22",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Name: $name",
        modifier = modifier.padding(8.dp),
        fontSize = 20.sp,
        color = MaterialTheme.colorScheme.primary
    )
}

@Composable
fun LastName(lastName: String, modifier: Modifier = Modifier) {
    Text(
        text = "Last Name: $lastName",
        modifier = modifier.padding(8.dp),
        fontSize = 20.sp,
        color = MaterialTheme.colorScheme.secondary
    )
}

@Composable
fun Group(group: String, color: Color, modifier: Modifier = Modifier) {
    Text(
        text = "Group: $group",
        modifier = modifier
            .padding(8.dp)
            .background(color = color.copy(alpha = 0.2f))
            .padding(8.dp),
        fontSize = 20.sp,
        color = color
    )
}

@Composable
fun MainContent(name: String, lastName: String, group: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Greeting(name = name)
        LastName(lastName = lastName)
        Group(group = group, color = Color.Red)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Kotlin9Theme {
        MainContent(
            name = "Bondarenko Elizaveta",
            lastName = "Alekseevna",
            group = "IKBO-11-22"
        )
    }
}
