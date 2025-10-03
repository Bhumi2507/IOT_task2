
package org.example

import kotlinx.coroutines.*

fun main() = runBlocking {

    println("**Short Adventure Story**")
    println("NARRATION:\nYou wake up in a dense enchanted forest. The air is misty, and you hear a river " +
            "flowing nearby.\nA faint light flickers deeper in the woods."
    )
    delay(3000)
    val choices = listOf("1.Follow the River","2.Follow the light")
    choices.forEach { choice->
        println("$choice ..")
        delay(1000)
    }
    println("Enter Your Choice(1-2): ")
    val choice : Int = readlnOrNull()?.toIntOrNull()?:0
    when (choice) {
        1 -> stage2A("** THE RIVER PATH **")
        2 -> stage2B("** THE LIGHT PATH **")
        else -> println("Invalid Choice")
    }
}