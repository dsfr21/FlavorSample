package com.example.flavorsample

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.github.javafaker.Faker

@Composable
fun UserInput(
    modifier: Modifier = Modifier,
    onInput: (String) -> Unit
) {
    var inputString by remember { mutableStateOf("") }
    TextField(
        value = inputString,
        onValueChange = {
            inputString = it
            onInput(it)
        },
        placeholder = { Text("請輸入名稱") }
    )
    Button(
        modifier = modifier,
        onClick = {
            val name = funnyName.name()
            inputString = name
            onInput(name)
        }
    ) {
        Text("隨機產生")
    }
}

private val funnyName = Faker().funnyName()