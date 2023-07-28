package com.example.noteit.feature.domain.use_case

import com.example.noteit.feature.domain.model.Note
import com.example.noteit.feature.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}