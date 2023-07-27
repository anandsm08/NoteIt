package com.example.noteit.feature.domain.use_case

import com.example.noteit.feature.domain.model.InvalidNoteException
import com.example.noteit.feature.domain.model.Note
import com.example.noteit.feature.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()){
            throw InvalidNoteException("Title cannot be empty")

        }
        if(note.content.isBlank()){
            throw InvalidNoteException("Content cannot be empty")

        }
        repository.insertNote(note)
    }
}