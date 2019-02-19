fun main(args: Array<String>) {

    val addFun: (Age, Age) -> Age = { a, b -> a + b }


    val result = doSomethingWithTwoInts(addFun, Age(10), Age(21))

    print("result is $result")

}

fun doSomethingWithTwoInts(function: (Age, Age) -> Age, one: Age, two: Age): Age {
    return function.invoke(one, two)
}

data class Age(private val number: Int) {

    operator fun plus(other: Age) = this.copy(this.number + other.number)

}

