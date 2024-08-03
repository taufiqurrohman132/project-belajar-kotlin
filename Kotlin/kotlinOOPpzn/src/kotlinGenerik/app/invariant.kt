package kotlinGenerik.app

/**secara default, gnerik paramter type sifatnya adalah invariant
 * INVARIANT = tidak boleh di subtitusi dengan subtype(child)  atau supertype(parent)
 * artinya saat kita buat objek Contoh<String>, maka tidak sama denga Contoh<Any>, begitupun sebaliknya
 */

class Infariant<T> (val data: T)

fun main() {
    val infariant = Infariant<String>("dika")
//    val data: Infariant<Any> = infariant//error, ini namanya infariant,

}