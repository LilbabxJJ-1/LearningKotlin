
fun input(prompt: String, type: Any): Any? {
    println(prompt)
    return if (type == String) {
        readln()
    }else if (type == Int) {
        readln().toIntOrNull()
    } else {
        readln().toDoubleOrNull()
    }
}
fun getInfo(): Array<Any> {
    val name = input("What is your name?", String)
    println("What's your age?")
    val orig = readln()
    val age = orig.toIntOrNull() ?: throw NumberFormatException("$orig is not a number")
    return arrayOf("$name is $age years old!", age)
}

fun main() {
    val info = getInfo()
    val sentence = info[0]
    val age = info[1].toString().toInt()
    println(sentence)
    println("You are a: ${checkValue(age)}")
}