fun main(args: Array<String>) {

    val (number, name) = getCreditCard()
    println("The credit acrd of $name has number $number")

    val numbers: IntRange = 1..10

    val evenNumbers: List<Int> = numbers.filter { it -> it % 2 == 0 }

    val evenNumbersSquared = evenNumbers.map { it * it }

    evenNumbersSquared.forEach(::println)

}

fun getCreditCard(): CreditCard {
    return CreditCard("123", "Tobias")
}

data class CreditCard(val number: String, val name: String)