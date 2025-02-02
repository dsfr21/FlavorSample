package com.example.flavorsample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UseResourceSample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val versionName = stringResource(R.string.version_name)
        Text("版本： $versionName")
        val versionDescription = stringResource(R.string.version_description)
        Text("說明： $versionDescription")
    }
}

@Preview
@Composable
private fun UseResourceSamplePreview() {
    UseResourceSample(
        modifier =  Modifier
            .background(Color.White)
    )
}