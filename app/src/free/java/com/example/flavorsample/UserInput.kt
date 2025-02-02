package com.example.flavorsample

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun UserInput(
    modifier: Modifier = Modifier,
    onInput: (String) -> Unit
) {
    Button(
        modifier = modifier,
        enabled = false,
        onClick = {}
    ) {
        Text("沒付錢不能按ㄛ")
    }
}