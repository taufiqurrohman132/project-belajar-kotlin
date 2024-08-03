package app

//meneruskan properti atau function ke objek lain

import target.Delegate
import target.SubPerson

fun main() {
    val subPerson: SubPerson = SubPerson()
    val delegate: Delegate = Delegate(subPerson)

    delegate.sayHello("sandika")
    delegate.sayGoodBy("devi")
}

