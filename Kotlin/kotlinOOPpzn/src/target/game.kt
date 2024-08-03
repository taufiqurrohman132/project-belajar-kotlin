package target


//ketika tidak pakai data class
class game (val name: String, val price: String) {
    operator fun component1() : String=name
    operator fun component2() : String=price
}

//keteika pakai data class
data class game3(val name: String, val price: String) {

}