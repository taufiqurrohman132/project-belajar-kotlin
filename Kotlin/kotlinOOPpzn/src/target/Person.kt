package target

interface Person {
    fun sayHello(nama: String)
    fun sayGoodBy(name: String)
}

class SubPerson : Person {
    override fun sayHello(name: String) {
        println("halo nama saya $name")
    }

    override fun sayGoodBy(name: String) {
        println("gud bay $name")
    }
}

class Delegate (person: Person) : Person by person {//jika tidak ingin di delegate bisa di override.
    override fun sayHello(nama: String) {
        println("tidak di delegate $nama")
    }
}