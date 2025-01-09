
fun getName(): String {
    return "Vasilica"
}

// Unit is the equivalent of void in Java
fun sayHello1(): Unit {
    println("Sarutmana ${getName()}!")
}

// single expression functions and params
fun getNameSingleExpression() = "Vasile"
fun sayHello2(name: String) = println("Salut $name!")


fun main() {
    sayHello1()
    sayHello2(getNameSingleExpression())
}
