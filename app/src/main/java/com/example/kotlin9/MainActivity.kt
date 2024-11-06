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
import com.example.kotlin9.ui.theme.Green90
import com.example.kotlin9.ui.theme.Beige100
import com.example.kotlin9.ui.theme.Gray50

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
        color = MaterialTheme.colorScheme.primary // Используем цвет из темы
    )
}

@Composable
fun LastName(lastName: String, modifier: Modifier = Modifier) {
    Text(
        text = "Last Name: $lastName",
        modifier = modifier.padding(8.dp),
        fontSize = 20.sp,
        color = MaterialTheme.colorScheme.secondary // Используем второй цвет из темы
    )
}

@Composable
fun Group(group: String, modifier: Modifier = Modifier) {
    Text(
        text = "Group: $group",
        modifier = modifier
            .padding(8.dp)
            .background(color = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.2f)) // Используем третий цвет из темы
            .padding(8.dp),
        fontSize = 20.sp,
        color = MaterialTheme.colorScheme.tertiary // Используем третий цвет для текста
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
        Group(group = group) // Передаем модификатор по умолчанию
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
