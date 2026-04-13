package com.mahful.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWord(word: WordEntity)

    @Query("SELECT * FROM history_table ORDER BY id DESC")
    fun getAllWords(): Flow<List<WordEntity>>
}