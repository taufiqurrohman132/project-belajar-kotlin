package target

class Account {
    val name: String by lazy {// akan di eksekusi satukali kemudian hanya return nya
        println("memanggil lazi")
        "sandika"//harus sesuai dengan tipe data variable nya// ini return value yang di kembalikan ke variable
    }
}