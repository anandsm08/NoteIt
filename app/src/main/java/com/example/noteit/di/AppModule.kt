package com.example.noteit.di

import android.app.Application
import androidx.room.Room
import com.example.noteit.feature.data.data_source.NoteDatabase
import com.example.noteit.feature.data.repository.NoteRepositoryImplementation
import com.example.noteit.feature.domain.repository.NoteRepository
import com.example.noteit.feature.domain.use_case.AddNote
import com.example.noteit.feature.domain.use_case.DeleteNoteUseCase
import com.example.noteit.feature.domain.use_case.GetNotesUseCase
import com.example.noteit.feature.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application):NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
            ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImplementation(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCase(repository: NoteRepository):NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotesUseCase(repository),
            deleteNotes = DeleteNoteUseCase(repository),
            addNote = AddNote(repository)
        )
    }
}