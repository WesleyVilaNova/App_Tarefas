package com.example.todolist.models

data class Modelo(
    val title: String,
    val hour: String,
    val date: String,
    val id: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Modelo

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}