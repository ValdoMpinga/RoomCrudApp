package com.example.studentregister

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.studentregister.db.Student
import com.example.studentregister.db.StudentDao
import kotlinx.coroutines.launch

class StudentViewModel(private val dao: StudentDao) : ViewModel()
{
    val students = dao.getAllStudents()

    fun insertStudents(student: Student) = viewModelScope.launch {
        dao.insertStudent(student)
    }

    fun updateStudents(student: Student) = viewModelScope.launch {
        dao.updateStudent(student)
    }
    fun deleteStudents(student: Student) = viewModelScope.launch {
        dao.deleteStudent(student)
    }
}