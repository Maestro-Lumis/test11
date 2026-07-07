package com.woke.lesson1



fun main(){
    var name = "Test"
    print(name)

    name = "o3ihfi3"



    val name1 = "Tst"  //
    println(name1)
    val age = 18
    print(age)
    val isStudent = true
    val height = 1.71

    val user: String
    user = "fuyerh"
    println(user)


    var score = 0
    score = 10
    score = score + 2
    score += 10
    println(score)


    var name2: String? = "Tst3e3"
    name2 = null
    println(name2?.length)
    val length = name2?.length ?: 0
    println(length)

    val userName = "dqqwe"

    val MAX_RES = 3

    val age1: Int = 11
    val price: Double = 5.0
    val big: Long = 567898765434567894L
    val ratio: Float = 2.11f


    val intValue: Int = 39000
    val doubleValue: Double = intValue.toDouble()
    val stringValue: String = intValue.toString()
    println(doubleValue)
    println(stringValue)

    val name3 = "ede"
    println("Меня зовут $name3")
    println("Сумма: ${10 + 2}")
}
