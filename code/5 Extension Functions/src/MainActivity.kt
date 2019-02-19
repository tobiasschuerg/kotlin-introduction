/**
 * extension function
 */
fun main(args: Array<String>) {
    "Carlos Stocard".greeting()
}


private fun String.greeting() {
    println("Hello $this")
}
