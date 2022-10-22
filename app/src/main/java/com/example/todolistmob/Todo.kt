package com.example.todolistmob

data class Todo(
    val title: String,
    var isChecked: Boolean = false // default value
)