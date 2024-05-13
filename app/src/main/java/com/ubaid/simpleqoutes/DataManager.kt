package com.ubaid.simpleqoutes

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson
import com.ubaid.simpleqoutes.models.QuotesData
import java.nio.charset.StandardCharsets.UTF_8

object DataManager {
    var quoteData = emptyArray<QuotesData>()
    var currentQuote: QuotesData? = null
    var isDataLoaded = mutableStateOf(false)
    var currentPage = mutableStateOf(Pages.LISTING)
    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("Quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, UTF_8)
        val gson = Gson()
        quoteData = gson.fromJson(json, Array<QuotesData>::class.java)
        isDataLoaded.value = true
    }

    fun switchPages(quotesData: QuotesData?){
        if (currentPage.value == Pages.LISTING){
            currentQuote = quotesData
            currentPage.value = Pages.DETAIL
        }else{
            currentPage.value = Pages.LISTING
        }
    }
}