sealed class BarcodeFormat {

    data class UPC(val length: Int) : BarcodeFormat()

    object EAN : BarcodeFormat()

    object QR : BarcodeFormat()

    object PDF417 : BarcodeFormat()

}
