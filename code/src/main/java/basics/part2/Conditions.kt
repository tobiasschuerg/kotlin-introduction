package basics.part2

import basics.part2.Conditions.Generation.*

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

    private fun determineGeneration(yearOfBirth: Int): Generation {
        if (yearOfBirth < 1883) {
            throw IllegalArgumentException("Day of year is too low")
        } else if (yearOfBirth <= 1900) {
            return LostGeneration
        } else if (yearOfBirth < 1924) {
            return GIGeneration
        } else if (yearOfBirth < 1942) {
            return SilentGeneration
        } else if (yearOfBirth < 1964) {
            return BabyBoomer
        } else if (yearOfBirth < 1980) {
            return GenerationX
        } else if (yearOfBirth < 2000) {
            return Millennial
        } else {
            return GenerationZ
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