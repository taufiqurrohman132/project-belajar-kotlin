package kotlinGenerik.app

/** yaitu membatasi data yang boleh di gunakan di gnerik parameter type
 * dengan menyebutkna type data yang diperbolehkan
 */

interface data

open class Employe : data

class Manager : Employe()

//jika banyak yang inging di sebutkan
class VicePresident<E> (val name: E) where E: Employe, E: data//hanya boleh satu class, tapi boleh banyak interface, dan abstrak

class Company<T: Employe> (val employe: T)



fun main() {
    val company =  Company(Employe())
    val company2 =  VicePresident(Employe())//jadi harus nyambung ke interface
    val company3 =  Company(Manager())
}