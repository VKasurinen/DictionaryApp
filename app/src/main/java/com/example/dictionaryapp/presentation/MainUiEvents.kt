package com.example.dictionaryapp.presentation

sealed class MainUiEvents {
    data class onSearchWordChange(val newWord: String) : MainUiEvents()
    object onSearchClick: MainUiEvents()
}
