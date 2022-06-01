package com.code_source.todolist

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)