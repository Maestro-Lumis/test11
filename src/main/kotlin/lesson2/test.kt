package com.woke.lesson2


var celsius: Double = 12.11
    set(value){
        if(value < 12.12){
            println("$value < 12.12")
        }else{
            field = value
        }
    }

val fahrenheit: Double
    get() = celsius * 9/5 +32


fun main(){
    println(celsius)
    println(fahrenheit)

    celsius = 10.0
    println(celsius)
    println(fahrenheit)

    celsius = 30.0
    println(celsius)
    println(fahrenheit)

    val x: Any = "Привет"
    if (x is String ) println("Это строка")

    val day = 3
    when (day) {
        1 -> println("Понедельник")
        6,7 -> println("Выходные")
        else -> println("dewdwe")
    }

    val day1 = 43
    when (day1) {
        in 1..33 -> println("Понедельник")
        in 66..99 -> println("Выходные")
        else -> println("...")
    }

    val day2: Any = "Sefe"
    when (day2) {
        is String -> println("Строка ${day2.length}")
        else -> println("...")
    }

    outer@ for(i in 1..2){
        for(j in 1..3){
            if (j ==2) break@outer
            println("i=$i, j = $j")
        }
    }
}

