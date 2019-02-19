package dataclasses

sealed class BarcodeFormat {

    data class UPC(val length: Int) : BarcodeFormat()

    object EAN : BarcodeFormat()

    object PDF417 : BarcodeFormat()

    data class QR(val size: Int) : BarcodeFormat()

}
