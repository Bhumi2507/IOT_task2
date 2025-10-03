package org.example

import kotlinx.coroutines.*

fun stage2A(stage : String) = runBlocking {
    println(stage)
    println("You walk along the river and find a wooden bridge. The bridge looks old and shaky.")
    delay(1000)
    val choices = listOf("1.Cross The Bridge","2.Look for another way")
    choices.forEach { choice->
        println("$choice ..")
        delay(1000)
    }
    println("Enter Your Choice:")
    val choice : Int = readlnOrNull()?.toIntOrNull()?:0
    when (choice) {
        1 -> stage3A()
        2 -> stage3B()
        else -> println("Invalid Choice")
    }
}

suspend fun stage3A(){
    println("You walk along the river and find a wooden bridge.")
    println("Halfway across, the bridge breaks!...\n")
    delay(2000)
    println("You fall into the river and get swept away.")
    println("**GAME-OVER**")
    delay(2000)
    stage2A("**BACK TO THE RIVER PATH **")
}

suspend fun stage3B(){
    println("You walk along the river and find a fallen log.\n" +
            "You use the log and carefully cross the river.\n" +
            "On the other side, you see a mysterious cave."
    )
    delay(1000)
    val choices = listOf("1.Enter the Cave","2.Ignore and keep walking")
    choices.forEach { choice->
        println("$choice ..")
        delay(1000)
    }
    println("Enter Your Choice:")
    val choice : Int = readlnOrNull()?.toIntOrNull()?:0
    when (choice) {
        1 -> stage4("Cave")
        2 -> stage2B("** THE LIGHT PATH **")
        else -> println("Invalid Choice")
    }
}