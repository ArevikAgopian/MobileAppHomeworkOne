package com.example.homeworkonemobile

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    println("Problem 1")
    //Declare an array and a list of your choice, initialize them with values, and print the elements.
    val arrayOfFruits = arrayOf("Apple", "Banana", "Orange", "Mango")
    println("Array : ${arrayOfFruits.joinToString()}")
    val listOfFruits : List<String> = listOf("Apple", "Banana", "Orange", "Mango")
    println("List : $listOfFruits")
    println()
    println("Problem2")
    //Create a string variable and perform various string manipulations such as concatenation,
    // substring extraction, and changing case, then print the modified string.
    var originalString = "Hello, World!"

    // Concatenation
    originalString += " Welcome to Kotlin"
    println("Concatenated String: $originalString")

    // Substring extraction
    val subString = originalString.substring(0, 5) // Extracts characters from index 0 to 4
    println("Substring: $subString")
    println("Uppercase : $originalString.uppercase()")
    println("Lowercase : $originalString.lowercase()")
    println()
    println("Problem 3")
    //Declare a map with key-value pairs and iterate through it to print both keys and values.
    // Declare a map with key-value pairs
    val studentGrades = mapOf(
        "Alice" to 95,
        "Bob" to 85,
        "Charlie" to 92,
        "David" to 88,
        "Eve" to 97
    )

    // Iterate through the map to print keys and values
    for ((name, grade) in studentGrades) {
        println("Student: $name, Grade: $grade")
    }
    println()
    println("Problem 4")
    //Write a function that takes an integer as input and returns a string indicating whether
    // it's positive, negative, or zero. Call this function with different integer inputs and print the results.
    val numbers = listOf(-5, 0, 10, -20, 7)

    for (number in numbers) {
        val result = classifyNumber(number)
        println("$number is $result")
    }
    println()
    println("Problem 5")
    //Create a program that asks the user for their name and age, then prints a personalized
    // greeting with their name and a message based on their age.
    // Ask the user for their name
    print("Enter your name: ")
    val name = readLine() ?: ""

    // Ask the user for their age
    print("Enter your age: ")
    val ageInput = readLine() ?: ""

    // Convert the age input to an integer
    val age = ageInput.toIntOrNull()

    // Check if the age is a valid number
    if (age != null) {
        val greeting = personalizeGreeting(name, age)
        println(greeting)
    } else {
        println("Invalid age input. Please enter a valid age as a number.")
    }

    println()
    println("Problem 6")
    //Write a function that takes two numbers as input and divides them. Implement error handling to
    // handle division by zero and print an appropriate message.
    print("Enter the dividend: ")
    val dividend = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter the divisor: ")
    val divisor = readLine()?.toDoubleOrNull() ?: 0.0

    val result = divideNumbers(dividend, divisor)
    println(result)
    println()
    println("Problem 7")
    //Get the current date and time, format it, and print it

// Get the current date and time
    val currentDateTime = LocalDateTime.now()

    // Define a date-time formatter
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    // Format the current date and time
    val formattedDateTime = currentDateTime.format(formatter)

    // Print the formatted date and time
    println("Current Date and Time: $formattedDateTime")

    println()
    println("Problem 8")
    //Define a class representing a simple "Person" with properties like name and age. Create an
    // object of this class and print its properties.
    val p = Person("Arevik",22,"Yerevan","arevik_agopian@edu.aua.am")
    // Access and print the properties
    println("Name: ${p.name}")
    println("Age: ${p.age}")
    println("City: ${p.city}")
    println("Email: ${p.email}")
    println()
    println("Problem 9")
    //Extend Person class and write a function that takes a person's age as input and returns a
    // string indicating their life stage (e.g., "Child," "Teenager," "Adult”).

    // Determine and print the life stage
    val ep = ExtendedPerson("Arevik",22,"Yerevan","arevik_agopian@edu.aua.am")
    val lifeStage = ep.getLifeStage()
    println("Life Stage: $lifeStage")
    println()
    println("Problem 10")
    //Declare a list of integers and use a lambda function to filter and print only the even numbers
    // from the list.
    // Declare a list of integers
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Use a lambda function to filter even numbers
    val evenNumbers = numbersList.filter { it % 2 == 0 }

    // Print the filtered even numbers
    println("Even Numbers: $evenNumbers")
}
fun classifyNumber(number: Int): String {
    return when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
}
fun personalizeGreeting(name: String, age: Int): String {
    return when {
        age < 0 -> "Age can't be negative, $name!"
        age < 18 -> "Hello, $name! You are a young one."
        age in 18..59 -> "Hello, $name! You are in your prime years."
        else -> "Hello, $name! You are experienced and wise."
    }
}
fun divideNumbers(dividend: Double, divisor: Double): String {
    return try {
        if (divisor == 0.0) {
            "Error: Division by zero is not allowed."
        } else {
            "Result: ${dividend / divisor}"
        }
    } catch (e: Exception) {
        "An error occurred: ${e.message}"
    }
}


