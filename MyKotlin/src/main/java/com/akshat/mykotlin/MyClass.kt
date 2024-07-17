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
     * MAP
     * //Immutable Map
     *     val secretMap = mapOf("Up" to 1, "Down" to 2, "Right" to 3, "Down" to 4)
     *    // println(secretMap)
     *    // println(secretMap.keys)
     *     println(secretMap.values)
     *
     *
     *     val myMutableSecretMap = mutableMapOf(
     *         "1" to 1, "2" to 2, "3" to 3, "4" to 4
     *     )
     *     myMutableSecretMap["4"]=4
     *     println(myMutableSecretMap.values)
     *
     *
     *     val myList = mutableListOf<String>()
     *     myList.add("hey")
     *     for (i in 1..10){
     *         myList.add(i, "Hey $i")
     *     }
     *
     *     println(myList)
     *
     *
     *
     *  val listOfItem = listOf("Akshat", "Chandu", "Trish")
     *     val listOfNumber = listOf(23,54,67,89)
     *     val finder = Finder( list=listOfNumber )
     *     finder.findItem(element = 23){
     *         println("Found $it")
     *     }
     *  //Generics
     * class Finder<T>(private val list: List<T>){
     *     fun findItem(element: T, foundItem: (element: T?) -> Unit) {
     *         val itemFoundList = list.filter {
     *             it == element
     *         }
     *
     *         if(itemFoundList.isNullOrEmpty()) foundItem(null) else
     *             foundItem(itemFoundList.first())
     *     }
     * }
     *
     * fun createDataClass() {
     *     val person = Person(name = "Joe", lastName = "Ball", age = 23)
     *     val aroni =  Person(name = "Ruti",
     *         lastName = "Machava",
     *         age = 54)
     *     val ruti = Person(name = "Ruti",
     *         lastName = "Machava",
     *         age = 54)
     *     val listOfPeople = listOf(person, aroni, ruti)
     *     val listOfNumber = listOf(23,54,67,89)
     *     listOfPeople.forEach { item ->
     *         println(item.age)
     *     }
     * }
     * data class Person(val name: String, val lastName: String, val age: Int)
     *
     *  /*enum class Result {
     *     SUCCESS,
     *     ERROR,
     *     IDLE,
     *     LOADING
     * }*/
     *
     *
     *
     *
     * */

    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())

}

fun getResult(result: Result){
    return when (result){
        is Error -> {
            println(result.exception.toString())
        }

        is Success -> {
            println(result.dataFeteched?: "Start again")
        }

        is Loading -> {
            println("Loadinh")
        }

        is NotLoading -> {
            println("Idle")
        }

        else -> {
            println("Not Avaialble")
        }
    }
}

object Repository {
    private var loadState: Result = NotLoading
    private var dataFetched: String? = null
    fun startFetch(){
        loadState = Loading
        dataFetched = "data"
    }

    fun finishFetch(){
        loadState = Success(dataFetched)
        dataFetched = null
    }

    fun error(){
        loadState = Error(exception = Exception("Exception"))
        dataFetched = null
    }

    fun getCurrentState(): Result {
       return loadState
    }
}

abstract class Result

data class Success(val dataFeteched: String?): Result()

data class Error(val exception: Exception): Result()

object NotLoading: Result()

object Loading: Result()






