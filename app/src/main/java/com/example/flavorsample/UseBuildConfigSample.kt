package com.example.flavorsample

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun UseBuildConfigSample(modifier: Modifier = Modifier) {
    // 只有不是會員的情況才出現
    if (!BuildConfig.IS_MEMBER) {
        Button(
            modifier = modifier,
            onClick = {}
        ) {
            Text("加入會員")
        }
    }
    else {
        Text("已加入會員！")
    }
}