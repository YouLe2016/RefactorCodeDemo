package part7.hidedelegate

class Department() {
    var manager: Person? = null
}

open class Person(
    val name: String
) {
    var department: Department? = null

    val managerName: String
        get() = department?.manager?.name ?:""
}