package com.example.noteit.feature.presentation.notes

import com.example.noteit.feature.domain.model.Note
import com.example.noteit.feature.domain.util.OrderNoteType
import com.example.noteit.feature.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: OrderNoteType = OrderNoteType.Date(OrderType.descending),
    val isOrderSectionVisible: Boolean = false,

)
