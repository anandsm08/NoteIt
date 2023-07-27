package com.example.noteit.feature.domain.use_case

data class NoteUseCases (
    val getNotes: GetNotesUseCase,
    val deleteNotes: DeleteNoteUseCase,
    val addNote: AddNote,

        )