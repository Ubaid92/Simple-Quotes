package com.ubaid.simpleqoutes.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoadingScreen() {
    Box(
        modifier = Modifier.fillMaxSize(1f),
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "Loading Quotes...",
            style = MaterialTheme.typography.headlineMedium,

        )
        Text(
            modifier = Modifier.align(Alignment.BottomCenter)
                .padding(0.dp,0.dp,0.dp,50.dp),
            text = "Created by Ubaid Niazi",
            style = MaterialTheme.typography.bodyLarge,

            )
    }
}

