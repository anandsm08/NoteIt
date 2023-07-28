package com.example.noteit.feature.presentation.edit_notes

data class NoteTextFieldState (
    val text: String = "",
    val hint: String= "",
    val isHintVisible: Boolean = true
    )