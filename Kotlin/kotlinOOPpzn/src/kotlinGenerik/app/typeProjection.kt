package kotlinGenerik.app

/** kadang agak sulit untuk membuat class generik type yang harus covariant dan contravarint
 * namun ketika kita membuat func untuk memanipulasi data invariant itu sangat sulit, karena generik parameter type nya harus sama
 * maka type projection = menambahkan informasi covariant atau contravariant di parameter func
 * jik covariant = kita tidak boleh mengubah data generik di objek
 * jika contravariant = kita tidak boleh mengambil data generik di objek
 */

class Countainer<T> (var data: T)

//contoh mengcopy
fun copy(from: Countainer<out Any>, to: Countainer<Any>) {//bisa di tambahkan in atau tidak
    to.data = from.data//ketika contravariant maka eror //invariant itu boleh menerima tapitidak boleh mengirimkan (subtitute)
    println(to.data)
//    from.data = to.data//ketika covariant maka error
}

fun main() {
    val countainer1 = Countainer("dika")
    val countainer2: Countainer<Any> = Countainer("ali")

    copy(countainer1, countainer2)
}