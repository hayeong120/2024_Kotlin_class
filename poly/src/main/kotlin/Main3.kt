open class Person1 {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }
    constructor(firstName: String, age: Int) {
        println("[Person] firstName: $firstName, age : $age")
    }
}

class Developer: Person1 {
    constructor(firstName: String): this(firstName, 10) {
        println("[Developer] firstName: $firstName")
    }
    constructor(firstName: String, age: Int): super(firstName, age) {
        println("[Developer] firstName: $firstName, age : $age")
    }
}

fun main() {
    val sean = Developer("Sean")
    println("--------------------------------------")
    val sean1 = Developer("Sean", 20)
}