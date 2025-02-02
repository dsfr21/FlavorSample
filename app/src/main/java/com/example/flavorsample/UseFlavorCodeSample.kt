@file:Suppress("RemoveRedundantQualifierName")

package com.example.flavorsample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UseFlavorCodeSample(modifier: Modifier = Modifier) {
    var userInput by remember { mutableStateOf("") }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("決定你的 Username")
        // 使用 flavor 中的實作
        com.example.flavorsample.UserInput(onInput = { userInput = it })
        Text("結果：$userInput")
    }
}

@Preview
@Composable
private fun UseFlavorCodeSamplePreview() {
    UseFlavorCodeSample(
        modifier =  Modifier
            .background(Color.White)
    )
}

