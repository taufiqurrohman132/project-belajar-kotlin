package target

class nullable {
}

data class Friend(val name: String)

//menggunakan cheking
fun sayHello(friend: Friend?){
    if (friend != null){
        println("hello ${friend.name}" )
    }
}

//menggunakan safeCall
fun sayHello2(friend: Friend?){
        println("hello ${friend?.name}" )
}

//menggunakan elvis operator. jika ingin memiliki default value jika null
fun sayHello3(friend: Friend?){
    val name = friend?.name ?: sayHello2(friend)//atau default nya bisa di isi tipe apapun
    println(name)
}
