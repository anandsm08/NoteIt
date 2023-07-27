package com.example.noteit.feature.domain.use_case

import com.example.noteit.feature.domain.model.Note
import com.example.noteit.feature.domain.repository.NoteRepository

class DeleteNoteUseCase(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}