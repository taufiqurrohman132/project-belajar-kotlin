package target

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Anotation( val author: String)//anotation tidak bisa memiliki properti dan juga func
