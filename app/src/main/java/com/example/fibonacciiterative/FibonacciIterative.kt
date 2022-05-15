package com.example.fibonacciiterative


import java.util.*

fun main() {

    val read = Scanner(System.`in`)

    println("Enter number of terms:")
    val number = read.nextInt()

    var t1 = 0
    var t2 = 1

    println("\nFibonacci series of first $number terms: ")

    for (index in 1..number) {
        print("$t1  ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }

    println("\n\nThe End")
}