package com.example.noteit.feature.presentation.notes

import com.example.noteit.feature.domain.model.Note
import com.example.noteit.feature.domain.util.OrderType

sealed class NotesEvent{
    data class Order(val noteOrder: OrderType): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrder: NotesEvent()
}
