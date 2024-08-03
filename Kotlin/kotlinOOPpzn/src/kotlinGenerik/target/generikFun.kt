package kotlinGenerik.target

class Func (val name: String){

    fun <T> nama(name: T){
        println("nama saya ${this.name} bersama $name")
    }

    fun <T, U, N> name2() = println()//tidak error meskipun generik type nya sama, karena scop nya hanya di funcnya. tapi di usakan jangan sama denngan generik type nya claas
}