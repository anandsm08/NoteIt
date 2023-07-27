package com.example.noteit.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteit.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,

    @PrimaryKey val id: Int? =null
){
    companion object{
        val noteColors = listOf(limeYellow,limeGreen, lightGreen, lightblue, babyBlue)
    }
}

class InvalidNoteException(message: String): Exception(message)