class Calculator(name: String) {
    init {
        println("$name's Calculator")
    }
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }
    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }
    fun divide(num1: Int, num2: Int): Any {
        return if (num2 == 0) {
            "Error! Cannot divide by 0"
        } else {
            num1 / num2
        }
    }
    fun power(num1: Int, num2: Int): Int {
        var result = 1
        for (num in 1..num1) {
            result *= num2
        }
        return result
    }

}


fun main() {
    val calculate = Calculator("Codey")
    val adding = calculate.add(7, 15)
    println("$adding")
    val subtracting = calculate.subtract(78, 15)
    println("$subtracting")
    val multiplying = calculate.multiply(5, 7)
    println("$multiplying")
    val dividing = calculate.divide(35, 7)
    println("$dividing")
    val powers = calculate.power(2, 4)
    println("$powers")

}