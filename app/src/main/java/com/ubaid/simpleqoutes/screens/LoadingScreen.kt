package com.ubaid.simpleqoutes.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
 fun LoadingScreen() {
    Box(
        modifier = Modifier.fillMaxSize(1f), contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Loading Quotes.....",
            style = MaterialTheme.typography.headlineMedium
        )
    }

}