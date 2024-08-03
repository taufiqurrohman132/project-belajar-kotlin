package target

class exception {
}

class validationException(message: String) : Throwable(message)

fun sayHello(name: String){
    //hanya bisa satu pngecekan, jika lebih maka ketika cek an pertama error maka cek kedua tidak di cek
    if (name.isBlank()){
        throw validationException("name is blank")//untuk membuat dan menampilkan error
    }
    println("hello $name")
}

fun sayGoodBay(name: String){
    if (name == name.uppercase()){
        throw Throwable("name is upperCase")
    }
}


