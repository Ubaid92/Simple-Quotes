package com.ubaid.simpleqoutes.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ubaid.simpleqoutes.R
import com.ubaid.simpleqoutes.models.QuotesData

@Composable
fun QuotesListScreen(data: Array<QuotesData>, onClick: (quote: QuotesData) -> Unit) {
    Column {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.headlineMedium,
            fontFamily = FontFamily(Font(R.font.montserrat))
        )
        QuoteList(data = data, onClick)
    }
}
//Text(
//modifier = Modifier.align(Alignment.BottomCenter)
//.padding(0.dp,0.dp,0.dp,50.dp),
//text = "Created by Ubaid Niazi",
//style = MaterialTheme.typography.bodyLarge,
//
//)