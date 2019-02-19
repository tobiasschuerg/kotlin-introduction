import dataclasses.BarcodeFormat
import dataclasses.LoyalityCard

/**
 * - no new
 * - named args
 * - copy constructor
 *
 * - when
 */

fun main() {

    val card = LoyalityCard("1337", BarcodeFormat.EAN)

    println("This is my loyalty card: $card")



//    when (card.barcodeFormat) {
//
//    }

}
