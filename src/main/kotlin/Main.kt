fun start(){
    val list = arrayOf("dog", 1, "person", 3)
    for (item in list){
        if (item is String) {
            println("$item is a String")
        }else{
            println("$item is not a String")
        }
    }
}

fun main() {
    start()
}