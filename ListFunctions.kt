fun getListOfNumbers(): List<Int> {
    val myList = mutableListOf<Int>()
    for (x in 1..7) {
        println("Enter a number: ")
        val number = Integer.valueOf(readLine())
        myList.add(number)
    }
    return myList
}

fun findMax(listName: List<Int>): Int {
    var largestNumber = listName[0]
    for (item in listName) {
        if (item > largestNumber) {
            largestNumber = item
        }
    }
    return largestNumber
}

fun findMin(listName: List<Int>): Int {
    var smallestNumber = listName[0]
    for (item in listName) {
        if (item < smallestNumber) {
            smallestNumber = item
        }
    }
    return smallestNumber
}

fun findAverage(listName: List<Int>): Int {
    var sum = 0
    for (item in listName) {
        sum += item
    }
    return sum / listName.size
}

fun checkIfListContains(listArg: List<Int>, intArg: Int): Boolean {
    for (item in listArg) {
        if (item == intArg) {
            return true
        }
    }
    return false
}


fun main() {
    val values = getListOfNumbers()
    println(values)
    val largestValue = findMax(values)
    println("The largest number is $largestValue.")
    val smallestValue = findMin(values)
    println("The smallest number is $smallestValue.")
    val average = findAverage(values)
    println("The average is $average.")
    println("Enter a number to check for: ")
    val numToFind = Integer.valueOf(readLine())
    val containsValue = checkIfListContains(values, numToFind)
    if (containsValue) {
        println("Value is in list.")
    } else {
        println("Value not in list.")
    }
}