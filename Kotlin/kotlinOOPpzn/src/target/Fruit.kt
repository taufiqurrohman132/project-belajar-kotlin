package target

data class Fruit (val quantity: Int){// jika di set data cllas juga bisa
    operator fun plus (fruit: Fruit) : Fruit{
        return Fruit(quantity + fruit.quantity)
    }

    operator fun minus (fruit: Fruit): Int {
        return quantity - fruit.quantity
    }
}