package kotlinGenerik.app

import kotlinGenerik.target.Func

//GENERIK FUNC
/**hanaya bisa di akses di func tersebut, tidak bisa digunakan di luar func
 * ini cocok ketika ingin membuat generik func, tanpa harus mengubah deklarasi claas
 */

fun main() {
    val function = Func("sandika")
    function.nama<Int>(87)

    function.nama("jayawardana")
}