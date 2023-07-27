package com.example.noteit.feature.domain.use_case

import com.example.noteit.feature.domain.model.Note
import com.example.noteit.feature.domain.repository.NoteRepository
import com.example.noteit.feature.domain.util.OrderNoteType
import com.example.noteit.feature.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase (private val repository: NoteRepository){
    operator fun invoke(
        orderNoteType: OrderNoteType = OrderNoteType.Date(OrderType.descending)
    ): Flow<List<Note>>{
        return repository.getNotes().map { notes ->
            when(orderNoteType.orderType){
                is OrderType.ascending -> {
                    when(orderNoteType){
                        is OrderNoteType.Title -> notes.sortedBy { it.title.lowercase() }
                        is OrderNoteType.Date ->  notes.sortedBy { it.timestamp }
                        is OrderNoteType.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.descending -> {
                    when(orderNoteType){
                        is OrderNoteType.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is OrderNoteType.Date ->  notes.sortedByDescending { it.timestamp }
                        is OrderNoteType.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}