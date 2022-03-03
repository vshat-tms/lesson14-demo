fun main() {
    val p = Person("Ivan", 33)
    val p2 = Person("Ivan", 33)
    println(p)
    println(p2 == p) // .equals()
    println(p2 === p) // javascript, java's ==

}


data class Person(val name: String, val age: Int)


open class MyClass

open class My2 : MyClass()

class My3 : My2()