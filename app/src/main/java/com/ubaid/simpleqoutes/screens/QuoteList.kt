package com.ubaid.simpleqoutes.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.ubaid.simpleqoutes.models.QuotesData

@Composable
fun QuoteList(data: Array<QuotesData>, onClick: (quote:QuotesData)-> Unit) {
    LazyColumn {
        items(data) {
            QuotesListItems(quotesData = it, onClick)
        }
    }
}