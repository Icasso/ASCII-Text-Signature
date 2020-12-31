package signature

import java.util.*

val scanner = Scanner(System.`in`)
fun main() {
    var name = scanner.nextLine()
    name = name.toLowerCase()
    val size = name.length
    print("*".repeat(size + 4) + "\n")
    println("* $name *")
    print("*".repeat(size + 4) + "\n")

    name.toCharArray()
    for (i in 0..2) {
        for (char in name) {
            print(returnFont(char)[i] + " ")
        }
        println()
    }
}

fun returnFont(letter: Char): Array<String> {
    when (letter) {
        'a' -> (return arrayOf("____", "|__|", "|  |"))
        'b' -> (return arrayOf("___ ", "|__]", "|__]"))
        'c' -> (return arrayOf("____", "|   ", "|___"))
        'd' -> (return arrayOf("___ ", "|  \\", "|__/"))
        'e' -> (return arrayOf("____", "|___", "|___"))
        'f' -> (return arrayOf("____", "|___", "|   "))
        'g' -> (return arrayOf("____", "| __", "|__]"))
        'h' -> (return arrayOf("_  _", "|__|", "|  |"))
        'i' -> (return arrayOf("_", "|", "|"))
        'j' -> (return arrayOf(" _", " |", "_|"))
        'k' -> (return arrayOf("_  _", "|_/ ", "| \\_"))
        'l' -> (return arrayOf("_   ", "|   ", "|___"))
        'm' -> (return arrayOf("_  _", "|\\/|", "|  |"))
        'n' -> (return arrayOf("_  _", "|\\ |", "| \\|"))
        'o' -> (return arrayOf("____", "|  |", "|__|"))
        'p' -> (return arrayOf("___ ", "|__]", "|   "))
        'q' -> (return arrayOf("____", "|  |", "|_\\|"))
        'r' -> (return arrayOf("____", "|__/", "|  \\"))
        's' -> (return arrayOf("____", "[__ ", "___]"))
        't' -> (return arrayOf("___", " | ", " | "))
        'u' -> (return arrayOf("_  _", "|  |", "|__|"))
        'v' -> (return arrayOf("_  _", "|  |", " \\/ "))
        'w' -> (return arrayOf("_ _ _", "| | |", "|_|_|"))
        'x' -> (return arrayOf("_  _", " \\/ ", "_/\\_"))
        'y' -> (return arrayOf("_   _", " \\_/ ", "  |  "))
        'z' -> (return arrayOf("___ ", "  / ", " /__"))
        ' ' -> (return arrayOf("      ", "      ", "      "))
        else -> return arrayOf("", "", "")
    }
}