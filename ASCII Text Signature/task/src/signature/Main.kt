package signature
import java.util.*
val scanner = Scanner(System.`in`)
fun main() {
    val name = scanner.nextLine()
    val size = name.length
    print("*".repeat(size + 4) + "\n")
    println("* " + name + " *")
    print("*".repeat(size + 4) + "\n")
}
