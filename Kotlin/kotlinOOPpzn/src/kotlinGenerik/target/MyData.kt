package kotlinGenerik.target

class MyData<T> (val firstData: T) {
    fun printData() = println("data is $firstData")

    fun getData(): T = firstData
}

//MULTIPLE PARAMETER TYPE
/**parameter type di generik boleh lebih dari satu
 * namun harus menggunakan nama type yang berbeda
 */

class Data<T, N, U> (val firstData: T, val daraNumber: N){//meskipun type nya tidak di pakai tidak masalah
    fun printData() = println("data is $firstData")

    fun getNumber(): N{
        return daraNumber
    }

    fun getData(): T = firstData
}
