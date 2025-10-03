package org.example

import kotlinx.coroutines.*

fun stage4( place : String) = runBlocking {
    println("Inside the $place, you discover a glowing crystal on a pedestal.\nIt hums with energy.")
    delay(2000)
    println("Now you've got two choices:\n")
    val choices = listOf("1.Touch The Crystal","2.Leave it alone")
    choices.forEach { choice->
        println("$choice ..")
        delay(1000)
    }
    val choice : Int = readlnOrNull()?.toIntOrNull()?:0
    when (choice) {
        1 -> stage5()
        2 -> stage2A("BACK TO RIVER PATH")
        else -> println("Invalid Choice")
    }
}

suspend fun stage5(){
    println("**VICTORY**\nTHE END!")
    delay(2000)
    println("1.Play Again\n2.Exit")
    val choice = readlnOrNull()?.toIntOrNull()?:0
    when (choice) {
        1 -> main()
        2 -> println("EXIT")
        else -> println("Invalid Choice")
    }
}