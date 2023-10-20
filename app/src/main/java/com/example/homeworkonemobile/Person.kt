package com.example.homeworkonemobile

open class Person(val name: String, val age: Int, val city: String, val email: String)

class ExtendedPerson(name: String, age: Int, city: String, email: String) :
    Person(name, age, city, email) {
    fun getLifeStage(): String {
        return when {
            age in 0..12 -> "Child"
            age in 13..19 -> "Teenager"
            age >= 20 -> "Adult"
            else -> "Invalid age"
        }
    }
}

