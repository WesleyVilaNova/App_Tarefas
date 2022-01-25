package com.example.todolist.datasource

import com.example.todolist.models.Modelo

object TaskDataSource {
    private val list = arrayListOf<Modelo>()

    fun getList() = list.toList()

    fun insertTask(modelo: Modelo) {
        if (modelo.id == 0) {
            list.add(modelo.copy(id = list.size + 1))
        } else {
            list.remove(modelo)
            list.add(modelo)
        }
    }

    fun findById(taskId: Int) = list.find { it.id == taskId }

    fun deleteTask(modelo: Modelo) {
        list.remove(modelo)
    }
}