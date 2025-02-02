package com.example.flavorsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.flavorsample.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface {
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .safeContentPadding(),
                        verticalArrangement = Arrangement.SpaceAround,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ProvideTextStyle(MaterialTheme.typography.headlineMedium) {

                            // 展示使用不同 flavor 的 resource
                            UseResourceSample()

                            // 展示使用不同 flavor 的程式碼
                            UseFlavorCodeSample()

                            // 展示使用不同 flavor 的環境變數
                            UseBuildConfigSample()
                        }
                    }
                }
            }
        }
    }
}



