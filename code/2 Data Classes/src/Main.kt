fun main(args: Array<String>) {

    val card = LoyalityCard("3267418", BarcodeFormat.QR)

    // val card2 = LoyalityCard(code = "3267418")
    // val otherCard = card.copy(code = "newCOde")

    println("This is my card: $card")
    
    val format: BarcodeFormat = card.barcodeFormat

    when (format) {
        BarcodeFormat.QR -> print("qr")
        is BarcodeFormat.UPC -> {
            format.length
        }
        BarcodeFormat.EAN -> {
        }
        BarcodeFormat.PDF417 -> TODO()
    }

}
