
const val NAME = "Ighor"

fun main() {
    println("kotlin file")
    println(PersonKotlin("Ivan"))
    println(KotlinObject.get())
    println(KotlinObject.inc())
    println(KotlinObject.inc())

    println(KotlinObject.get())


}
//val - value
class PersonKotlin {
    private var id: Int;
    private val name: String;

    init {
        println("Hello from PersonKotlin.init")
    }

    constructor(name: String) {
        println("constructor PersonKotlin")
        this.id = globalId++
        this.name = name
    }

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    override fun toString(): String {
        return "PersonKotlin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'
    }

    companion object {
        var globalId = 0
    }
}

object KotlinObject {
    private var counter = 0

    init {
        println("hello from KotlinObject")
    }

    fun inc() {
        counter++
    }

    fun get(): Int {
        return counter;
    }
}

class KotlinExample3 {
    private var name: String? = null
    private var age: Int = 0

    fun getName() = name
    fun getAge() = age

    companion object {
        const val SITE_URL = "https://google.ru"
    }
}