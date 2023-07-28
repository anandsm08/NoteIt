package com.example.noteit.feature.presentation.edit_notes

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String) : AddEditNoteEvent()
    data class FocusedTitle(val focusState: FocusState) : AddEditNoteEvent()
    data class EnteredContent(val value: String) : AddEditNoteEvent()
    data class FocusedContent(val focusState: FocusState): AddEditNoteEvent()
    data class changeColor(val color: Int): AddEditNoteEvent()
    object saveNote: AddEditNoteEvent()
}
