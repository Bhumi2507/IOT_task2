package org.example

import kotlinx.coroutines.*

fun stage2B(stage: String) = runBlocking {
    println(stage)
    println("You follow the flickering light and discover it’s a lantern hanging outside an old cabin.\n" +
            "The door is slightly open."
    )
    delay(1000)
    val choices = listOf("1.Enter the Cabin","2.Knock on the door")
    println("Now You've got two choices.")
    choices.forEach { choice ->
        println("$choice..")
        delay(1000)
    }
    val choice : Int = readlnOrNull()?.toIntOrNull()?:0
    when (choice) {
        1 -> stage4("Cabin")
        2 -> stage3C()
        else -> println("Invalid Choice")
    }
}

suspend fun stage3C(){
    println("You knock politely...\n")
    delay(1000)
    println("Suddenly the door bursts open and a shadow creature drags you inside.")
    println("**GAME-OVER**\n")
    delay(1000)
    stage2B("Back to the Light Path")
}