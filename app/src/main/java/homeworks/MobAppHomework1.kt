package homeworks

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

class MobAppHomework1 {
    companion object {
        class Person(val name: String, val age: Int){
            fun getLifeStage(): String{
                return when {
                    age < 0 -> "Invalid Age" // Negative age is invalid
                    age in 0..12 -> "Child"
                    age in 13..19 -> "Teenager"
                    age >= 20 -> "Adult"
                    else -> "Unknown"
                }
            }
        }

        @RequiresApi(Build.VERSION_CODES.O)
        @JvmStatic
        fun main(args: Array<String>) {
            exercise1()
            exercise2()
            exercise3()
            printExercise4()
            exercise5()
            exercise6(5.0,0.0)
            println(exercise6(4.0,2.0))
            println()
            exercise7()
            exercise8and9()
            exercise10()
        }
        private fun exercise1() {
            println("Exercise 1")

            val intArray = intArrayOf(1, 2, 3, 4, 5)
            val stringList = listOf("Moscow", "Yerevan", "London", "Paris", "Rome")

            println("Elements of the integer array:")
            for (element in intArray) {
                println(element)
            }

            // Print the elements of the list
            println("Elements of the string list:")
            for (element in stringList) {
                println(element)
            }

            println()
        }

        private fun exercise2() {
            println("Exercise 2")

            val string = "Hello, Kotlin!"

            val concatenatedString = string + "What's up?"
            println("Concatenated String: $concatenatedString")

            val substring = string.substring(7,13)
            println("Substring: $substring")

            val uppercaseString = string.uppercase(Locale.getDefault())
            val lowercaseString = string.lowercase(Locale.getDefault())

            println("Uppercase String: $uppercaseString")
            println("Lowercase String: $lowercaseString")

            println()
        }

        private fun exercise3() {
            println("Exercise 3")
            val studentGrades = mapOf(
                "Partev" to 100,
                "Andranik" to 99,
                "Narek" to 74,
                "Zhanna" to 95,
                "Norayr" to 50
            )

            studentGrades.forEach { entry ->
                println("${entry.key} : ${entry.value}")
            }

            println()
        }

        private fun exercise4(number: Int): String {
            return when {
                number > 0 -> "Positive"
                number < 0 -> "Negative"
                else -> "Zero"
            }
        }

        private fun printExercise4() {
            println("Exercise 4")

            val positiveNumber = 17
            val zero = 0
            val negativeValue = -22

            println("Number $positiveNumber is ${exercise4(positiveNumber)}")
            println("Number $zero is ${exercise4(zero)}")
            println("Number $negativeValue is ${exercise4(negativeValue)}")

            println()
        }

        private fun exercise5() {
            println("Exercise 5")

            print("Enter your name: ")
            val name = readlnOrNull()
            print("Enter your age: ")
            val age = readlnOrNull()?.toIntOrNull()

            if (age != null) {
                val greeting = when {
                    age < 0 -> "You haven't been born yet!"
                    age in 0..12 -> "Hello, $name! You're a kid."
                    age in 13..19 -> "Hello, $name! You're a teenager."
                    age in 20..64 -> "Hello, $name! You're an adult."
                    else -> "Hello, $name! You're a senior citizen."
                }

                println(greeting)
            } else {
                println("Invalid age input. Please enter a valid age.")
            }

            println()
        }

        private fun exercise6 (dividend:Double, divisor:Double): Double? {
            println("Exercise 6")


            return if (divisor != 0.0) {
                dividend / divisor
            }else {
                println("Invalid argument:Cannot divide a number to zero!")
                null
            }
        }

        @RequiresApi(Build.VERSION_CODES.O)
        private fun exercise7() {
            println("Exercise 7")

            val currentDateTime = LocalDateTime.now()

            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

            val formattedDateTime = currentDateTime.format(formatter)

            println("Current Date and Time: $formattedDateTime")

            println()
        }

        private fun exercise8and9() {
            println("Exercise 8,9")

            val person = Person("Partev", 10)

            println("Person's Name: ${person.name}")
            println("Person's Age: ${person.age}")

            println("Person's lifeStage: " + person.getLifeStage())

            println()
        }

        private fun exercise10(){
            println("Exercise 10")

            val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

            val evenNumbers = numbers.filter { it % 2 == 0 }

            println("Even Numbers: $evenNumbers")
        }
    }




}