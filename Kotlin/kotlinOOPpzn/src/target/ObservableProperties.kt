package target

import kotlin.properties.Delegates

class ObservableProperties(name: String = "") {
    //contoh mengecek pada perubahan
    var name: String by Delegates.observable(name) {
        property, oldValue, newValue ->
        println("${property.name} di ubah dari $oldValue ke $newValue")
    }
}