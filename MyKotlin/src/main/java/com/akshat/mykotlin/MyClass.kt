package com.akshat.mykotlin

fun main(){


    /**
     * Difference between var and val in Kotlin
     *  var name = "Kotlin" //mutable
     *  val name = "Akshat" // immutable
     * Best practice - In essence use val over var
     * */


    /**
     * Another way to initialize variables
     * val name: String
     * name = "James"
     * */

    /**
     * * Basic Types in Kotlin:
     * (Whole Numbers)
     *  - Int
     *  - Byte
     *  val myByte : Byte
     *  myByte = 127
     *  - Short
     *  val myShort : Short
     *  myShort = 12799
     *  Floating Points Types:
     *   (Decimal Numbers):
     *    - Double
     *    - Float
     *    Note: for precision, use Double.
     *    val e = 2.7182818284
     *    val eFloat = 2.7182818284f
     * */


    /**
     * Kotlin Operators
     * + (a+b)
     * - (a-b)
     * * (a*b)
     * / (a/b)
     * % (a%b)
     * */


    /**
     * Loops and Branching
     *
     * if(amount >= 1000){
     *         print("Wealthy")
     *     }
     *     else{
     *         print("Mot Wealthy")
     *     }
     *
     * when (amount){
     *        in 1..100 -> print(" NOt Wealthy")
     *         !in 10..90 -> print("Wealthy")
     *         else -> print("not reachable")
     *     }
     *
     * // Simple for loop
     *     for (i in 1..3){
     *         println(i)
     *     }
     *
     * // for loop divible by 3
     *     for (i in 1..1000){
     *         if(i%3 == 0) println("$i is mutiple of 3") else println ("---")
     *     }
     *
     *
     *     for (i in 1..55){
     *                if(i%3 == 0 && i%5 == 0)
     *                    println("$i is mutiple of 3 and 5")
     *                else if (i%5 == 0)
     *                    println ("$i is multiple of 5 only")
     *                 else if (i%3 == 0)
     *                     println("$i is muliple of 3 only")
     *                 else
     *                     println("---")
     *     }
     *
     *
     *
     *
     * //Collections - Introduction
     * LISTS
     * immutable
    * val myListOfNames = listOf("Aks", "Aks1", "Aks2", "Aks3")
    *
    *     // println(myListOfNames)
    *
    *     /*for (item in myListOfNames){
     *         println("Names: $item")
     *     }*/
    *     /*myListOfNames.forEach{
     *         println(it)
     *     }*/
    *
    *     //Mutable
    *     /*val myMutableList = mutableListOf(12, 4, 34, 124)
     *     myMutableList.add(213)
     *     myMutableList.removeAt(0)
     *     println(myMutableList)*/
     *
     *
     * SET
     *   // Immutable Set
     *     val mySet = setOf("US", "Canada", "Mexico")
     *     println(mySet)
     *
     *     // Mutable Set
     *     val myMutableSet = mutableSetOf(1,2,3,4,5)
     *     myMutableSet.add(3)
     *     println(myMutableSet)
     *
     *
     *
     *
     *
     * */






 //   print("Hello my name is $myShort")
}