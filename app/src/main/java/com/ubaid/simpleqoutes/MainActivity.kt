package com.ubaid.simpleqoutes

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.ubaid.simpleqoutes.models.QuotesData
import com.ubaid.simpleqoutes.screens.LoadingScreen
import com.ubaid.simpleqoutes.screens.QuoteDetail
import com.ubaid.simpleqoutes.screens.QuotesListScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        CoroutineScope(Dispatchers.IO).launch {
            delay(10000)
            DataManager.loadAssetsFromFile(applicationContext)

        }
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    if (DataManager.isDataLoaded.value) {
        if (DataManager.currentPage.value == Pages.LISTING){
            QuotesListScreen(data = DataManager.quoteData) {
            DataManager.switchPages(it)
            }
        }else{
            DataManager.currentQuote?.let { QuoteDetail(quotesData = it) }
        }

    } else {
        LoadingScreen()
    }
}

enum class Pages{
    LISTING,
    DETAIL
}