package app

import target.Fruit

/**artinya kita bisa membuat func dari operator seperti operator matematika, dll
 * sehingga kita bisa melakukan operasi apapun di objek seperti layaknya tipe data integer
 * kata kunci operator sebelum func nya
 */

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(400)
    val fruit3 = Fruit(300)
    val fruitResult = fruit1 + fruit2
    val fruitResult2 = fruit1 + fruit2 - fruit3

    println(fruitResult)
    println(fruitResult2)

    println(fruitResult - Fruit(80))

}