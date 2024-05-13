package com.ubaid.simpleqoutes.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ubaid.simpleqoutes.models.QuotesData

@Composable
fun QuoteList(data: Array<QuotesData>, onClick: (quote:QuotesData)-> Unit) {
    LazyColumn(modifier = Modifier.padding(0.dp,0.dp,0.dp,50.dp)) {
        items(data) {
            QuotesListItems(quotesData = it, onClick)
        }
    }
}