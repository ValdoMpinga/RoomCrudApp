package com.example.studentregister.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface StudentDao
{
    //Those crud functions are not inserted on the main thread, but yes using a coroutine, thats why they take annotations
    @Insert
    suspend fun insertStudent(student: Student)

    @Update
    suspend fun updateStudent(student: Student)

    @Delete
    suspend fun deleteStudent(student: Student)

    @Query("Select * from student_data_table")
    fun getAllStudents(): LiveData<List<Student>>
}