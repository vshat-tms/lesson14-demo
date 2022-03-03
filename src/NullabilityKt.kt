fun main() {


    var x: String?

    x = "hello"

    printStringKt(x)


    x = "world"
    printStringKt(x)


//    x = numberToString(5)
//    printStringKt(null!!)

    var z: Any?
    z = "hey"

    if (z is String) {
        println(z.uppercase())
    }


    var zz: String? = "example1"

    if (zz != null) {
        printStringKt(zz)

    }
}

// null able
// watchable

fun printStringKt(x: String) {
    println(x.length.toString() + ": " + x)
}

fun numberToString(int: Int): String? {
    if (int > 0) {
        return int.toString()
    }
    return null
}


data class Person6(
    val id: ID
)

data class ID(
    val name: String,
    val partner: Person6?
)