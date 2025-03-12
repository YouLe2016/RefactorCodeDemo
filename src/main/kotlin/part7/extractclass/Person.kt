package part7.extractclass

class Person(
    private val name: String,
) {
    private var officeAreaCode: String = ""
    private var officeNumber: String = ""

    val telephoneNumber: String
        get() = if (officeAreaCode.isEmpty()) {
            officeNumber
        } else {
            "($officeAreaCode)$officeNumber"
        }

    fun setOfficeNumber(number: String) {
        officeNumber = number
    }

    fun setOfficeAreaCode(code: String) {
        officeAreaCode = code
    }
}