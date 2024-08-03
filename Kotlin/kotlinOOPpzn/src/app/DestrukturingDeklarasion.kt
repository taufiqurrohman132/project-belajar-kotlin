package app

import target.game
import target.game3

//membuat multiple variable dari sebuah objek
//destrukturing tidak bisa di gunakan sebagai objek. hanya objek yang memiliki function componentX() yang bisa dilakukan destrukturing
//saat membuat data claas, secara otomatis akan di buatkan function componentX() sesuai dengan jumlah parameternya

fun main() {
    val game = game("game", "ml")
    val game3 = game3("game", "ml")

    val (name, price) = game
    val (nama, pric) = game3 //jadi nama variable nya tidak harus sesuai
    //tapi jumlah componen variable nya harus sesuai dengan objeknya

    println(name)
    println(nama)
    println(pric)
    println(price)

}
