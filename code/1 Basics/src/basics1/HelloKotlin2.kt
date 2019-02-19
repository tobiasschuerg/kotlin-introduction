package basics1

/**
 * - defining variables
 * - functions
 * - (return) types
 *
 */
object HelloKotlin2 {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter your name")
        print("> ")
        val name = readLine()
        greet(name)
    }

    private fun greet(name: String?) {
        var message = "Hello"
        message += " $name"
        println(message)
    }

}
