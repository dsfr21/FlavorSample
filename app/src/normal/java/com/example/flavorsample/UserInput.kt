package com.example.flavorsample

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.javafaker.Faker

@Composable
fun UserInput(
    modifier: Modifier = Modifier,
    onInput: (String) -> Unit
) {
    Button(
        modifier = modifier,
        onClick = { onInput(funnyName.name()) }
    ) {
        Text("隨機產生")
    }
}

private val funnyName = Faker().funnyName()