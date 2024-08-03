package kotlinGenerik.app

/**contravariant = bisa melakukan subtitute dari parent ke child
 * syarat = harus class generik yang menggunakan generika parameter type sebagai parameter func
 * keyword = in
 */

class contravariant<in T> {
    fun sayHello(name: T){
        println("hello $name")
    }
}

fun main() {
    val data1 = contravariant<Any>()
    val data2: contravariant<String> = data1

    data2.sayHello("sandika")
}