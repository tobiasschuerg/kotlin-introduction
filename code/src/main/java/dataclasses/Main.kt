import dataclasses.BarcodeFormat
import dataclasses.LoyalityCard

/**
 * - no new
 * - named args
 * - copy constructor
 *
 * - when
 */

fun main(args: Array<String>) {

    val card = LoyalityCard("3267418", BarcodeFormat.QR(128))

    println("This is my card: $card")

    val format: BarcodeFormat = card.barcodeFormat

    when (format) {
        is BarcodeFormat.QR -> print("qr")
        is BarcodeFormat.UPC -> {
            format.length
        }
        BarcodeFormat.EAN -> {
        }
        BarcodeFormat.PDF417 -> TODO()
    }

}
