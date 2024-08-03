package app

import target.ObservableProperties

//seperti delegation
/**dengan observable properties kita bisa properties atau value setelah diubah
 */

fun main() {
    val observable = ObservableProperties()
    observable.name = "sandika"
    observable.name = "dika"
    observable.name = "ali"

}