
//top level variable = global variable
val globalName: String = "Vasilica"
var greeting: String = "Sarutmana"

// non-nullable type greeting
var nonNullableGreeting: String? = null

fun main() {
    println("Hello, World!")

//    Variables -> var vs val
//    var is mutable, val is immutable

    val name: String = "Vasilica"
//    name = "Vasile" -> Error: Val cannot be reassigned
    var mutableName: String = "Vasilica"
    mutableName = "Vasile"

    println(name)
    println(mutableName)
    println(globalName)

    println("$greeting $globalName")
    greeting = "Salut"
    println("$greeting $globalName")

//    Initially, greeting is a non-null type String
//    greeting = null -> Error: Null can not be a value of a non-null type String
//    println(nonNullableGreeting) -> this works because nonNullableGreeting is nullable

    if (nonNullableGreeting != null) {
        println(nonNullableGreeting)
    } else {
        println("nonNullableGreeting is null")
    }

    when (nonNullableGreeting) {
        null -> println("nonNullableGreeting is null")
        else -> println(nonNullableGreeting)
    }
}
