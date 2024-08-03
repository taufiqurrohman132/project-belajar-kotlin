package kotlinGenerik.app

/**covariant = bisa melakukan subtitute dari child ke parent
 * syarat = harus class generik yang menggunakan generik parameter type sebagai return type func
 * keyword = out
 */


class covariant<out T> (val data: T) {//properti juga harus val, agar tidak bisa di input dan diubah dari luar
    fun data() : T{
        return data
    }
}

fun main() {
    val data1 = covariant("sandika")
    val data2: covariant<Any> = data1 //tidak error, jika invariant maka error


    println(data2)
}