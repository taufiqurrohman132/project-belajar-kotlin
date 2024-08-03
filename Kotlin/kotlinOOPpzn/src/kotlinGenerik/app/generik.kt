package kotlinGenerik.app

import kotlinGenerik.target.Data
import kotlinGenerik.target.MyData
//GENERIK CLASS
/**generik type adalah class atau inteface yang memiliki parameter type
 * nama generik parameter type yang biasa digunakan adalah
 * - E = elemen (biasa di gunakan di colection/ struktur data)
 * - K = Key
 * - N = number
 * - T = type
 * - V = value
 * dll
 */
fun main() {
    val myDataInt = MyData<Int>(89)
    myDataInt.printData()
    println(myDataInt.getData())

    val myDataString = MyData("sandika") // untuk type nya bisa di inisialisasi bisa tidak
    myDataString.printData()
    println(myDataString.getData())


    val data = Data<String, Int, String>("pak dika", 78)
    data.printData()
    println(data.getData())
    println(data.getNumber())
}

