package part7.extractclass

class TelephoneNumber {
    private var areaCode: String = ""
    private var number: String = ""

    val phoneNumber: String
        get() = if (areaCode.isEmpty()) {
            number
        } else {
            "($areaCode)$number"
        }

    fun setNumber(number: String) {
        this@TelephoneNumber.number = number
    }

    fun setAreaCode(code: String) {
        areaCode = code
    }
}