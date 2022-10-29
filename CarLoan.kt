fun main() {

    println("What is the amount of the loan?")
    val carLoan = Integer.valueOf(readLine())
    println("What is the length of the loan in years?")
    val loanLength = Integer.valueOf(readLine())
    println("What is the interest rate?")
    val interestRate = Integer.valueOf(readLine())
    println("What is the down payment?")
    val downPayment = Integer.valueOf(readLine())

    if (loanLength <= 0 || interestRate <= 0) {
        println("Error! You must take out a valid car loan.")
    } else if (downPayment >= carLoan) {
        println("The car can be paid in full.")
    } else {
        val remainingBalance = carLoan - downPayment
        val months = loanLength * 12
        val monthlyBalance = remainingBalance / months
        val interest = (monthlyBalance * interestRate) / 100
        val monthlyPayment = monthlyBalance + interest
        println("Your monthly payment will be $monthlyPayment.")
    }
}