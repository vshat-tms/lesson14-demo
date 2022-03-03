

fun main() {
    val user = User5("Ivan", "Petrov")
    println(user.firstName)
    println(user.lastName)
    println(user.fullName)

    println("--------------")

    val userKt = User5Kt("Ivan2", "Petrov2")
    println(userKt.firstName)
    println(userKt.lastName)
    println(userKt.fullName)

}

class User4Kt {
    var name: String
        set(value) {
            require(value.length > 2) { "Name length should be at least 2 chars" }
            field = value
        }

    var age: Int = 0
        set(value) {
            require(value > 0) { "age can't be negative" }
            field = value
        }

    var salary: Int = 0
        set(value) {
            require(value > 0) { "age can't be negative" }
            field = value
        }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "User4Kt{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'
    }
}

fun ex132() {
    val x = XXX(
        a = 1,
        a2 = 2,
        a3Value = 3,
        a4 = 4
    )
}

class XXX(
    var a: Int,
    var a2: Int,
    a3Value: Int,
    var a4: Int
) {
    var a3: Int = a3Value
        set(value) {
            if (value > 0) field = 0
            else field = value
        }

    init {
        println(a3Value)
    }

}

class PointKotlin(
    val x: Int,
    val y: Int
)

class User5Kt(
    val firstName: String,
    val lastName: String
) {
    val fullName: String
        get() = "$firstName $lastName"
}


