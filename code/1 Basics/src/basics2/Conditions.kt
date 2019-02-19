package basics2

/**
 * - when
 * - return
 * - safe calls
 * - elvis operator
 * - !! operator
 */
object Conditions {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter your year of birth: ")
        print("> ")
        val year = readLine()!!.toInt()
        val generation = determineGeneration(year)
        println("You are a $generation")
    }

    fun determineGeneration(yearOfBirth: Int): Generation {

        if (yearOfBirth < 1883) {
            throw IllegalArgumentException("Day of year is too low")
        } else if (yearOfBirth <= 1900) {
            return Generation.LostGeneration
        } else if (yearOfBirth < 1924) {
            return Generation.GIGeneration
        } else if (yearOfBirth < 1942) {
            return Generation.SilentGeneration
        } else if (yearOfBirth < 1964) {
            return Generation.BabyBoomer
        } else if (yearOfBirth < 1980) {
            return Generation.GenerationX
        } else if (yearOfBirth < 2000) {
            return Generation.Millennial
        } else {
            return Generation.GenerationZ
        }
    }

    enum class Generation {
        LostGeneration,
        GIGeneration,
        SilentGeneration,
        BabyBoomer,
        GenerationX,
        Millennial,
        GenerationZ
    }

}