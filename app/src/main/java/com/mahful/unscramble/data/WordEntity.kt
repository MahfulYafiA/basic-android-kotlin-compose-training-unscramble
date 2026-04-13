package com.mahful.unscramble.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history_table")
data class WordEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val guessedWord: String
)