package app

import target.sayGoodBay
import target.sayHello
import target.validationException

/**eror di kotlin di representasikan dengan exception,dimana semua tipe data error pasti turunan dari throwable
 * untuk membuat error di kotlin, kita bisa menggunakan kata kunci throw, di ikuti denga objek errornya
 */

fun main() {
//    sayHello("sandika")
//    sayHello("")//blank, ketika ini true, maka yang dibawahnya tidak akan diekses


    //TRY CATCH
    /**di kotlin, kita bisa menangkap exception, lalu melakukan sesuatu jika error
     * try = mencoba melakkukan eksekusi ke program yang memungkinkan error
     * catch = menagkap error tergantung jenisnya
     */
    try {
        sayHello("sandika")
        sayHello("")//blank
        println("cek")//tidak akan di eksekusi karena sudah terhenti di blank
        sayGoodBay("SANDIKA")//tidak di eksekusi karena di blank sudah true
    }catch (error: validationException){//jenisnya
        println("terjadi error ${error.message}")
    }catch (error: Throwable){
        println("terjadi error ${error.message}")
    }finally {// ini akan di eksekusi baik error atau tidak
        println("finallu")
    }

}