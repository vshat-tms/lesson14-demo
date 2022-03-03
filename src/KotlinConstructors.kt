class KotlinConstructors {
}

class User1K(
    private val name: String,
    private val age: Int
)

fun main() {
    Example3("hello, constructor")
}

class Example3 {
    constructor(string: String) {
        println("Example3.constructor: string = $string")
    }
}

class Example4(
    private val string: String,
    private val anotherString: String
) {
    val myString = "source string: $string"

    constructor() : this("default", "default2")

    init {
        println("Example3.constructor: string = $string")
    }

    fun main() {
        println("Hello: $string")
    }


}

fun wrapString(sourceString: String, wrapper: String = "|", ending: String = ">>>", noEnding: Boolean = false): String {
    if(noEnding) {

    }
    return wrapper + sourceString + wrapper  +ending;
}

fun wrapStringExample() {
    val text = "hello"
    val expected = "|hello|"
    val expected3 = "|hello|"
    val expected2 = "+hello+"

    wrapString(text, "=")
    wrapString(text)
    wrapString(
        sourceString = text,
        noEnding = true
    )

    ".".isBlank()

    ".".uppercase()

    //val person = PersonJava("Petr")
    //person.sayHi()
}