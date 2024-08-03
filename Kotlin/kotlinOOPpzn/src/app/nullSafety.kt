package app

import target.Friend
import target.sayHello
import target.sayHello2
import target.sayHello3

/**
 * fitur agar tidak terjadi nullPointterExeption
 */

fun main() {

    val friend = Friend("sandika")
    sayHello(null)
    sayHello(friend)

    sayHello2(null)
    sayHello2(friend)

    sayHello3(friend)
    sayHello3(null)
}