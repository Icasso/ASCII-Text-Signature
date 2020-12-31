package signature

import java.util.*

val scanner = Scanner(System.`in`)
fun main() {
    print("Enter name and surname: ")
    var name = scanner.nextLine()
    print("Enter person's status: ")
    val status = scanner.nextLine()
    val statusSize = status.length
    name = name.toLowerCase()


    name.toCharArray()
    //Count
    var sum = 5
    for (char in name) {
        sum += returnFont(char)[0].length
        sum++
    }

    var isLonger = false
    var printLen: Int
    if (sum > statusSize + 6) {
        printLen = sum
        isLonger = false
    } else {
        printLen = statusSize + 6
        isLonger = true
    }
//    println("sum: $sum")
//    println("printLen: $printLen")
    print("*".repeat(printLen) + "\n")

    if (!isLonger) {
        for (i in 0..2) {
            print("*  ")
            for (char in name) {
                print(returnFont(char)[i] + " ")
            }
            println(" *")
        }
    } else {
        var letterLen = printLen - sum
//        println(letterLen)
        if (letterLen % 2 != 0) {
            val v1 = ((letterLen / 2.0) - 0.5).toInt()
            val v2 = ((letterLen / 2.0) + 0.5).toInt()
            for (i in 0..2) {
                print("*  " + " ".repeat(v1))
                for (char in name) {
                    print(returnFont(char)[i] + " ")
                }
                println(" ".repeat(v2) + " *")
            }
        } else {
            val v1 = letterLen / 2
            for (i in 0..2) {
                print("*  " + " ".repeat(v1))
                for (char in name) {
                    print(returnFont(char)[i] + " ")
                }
                println(" ".repeat(v1) + " *")
            }
        }

    }


    val test = (printLen - 6 - statusSize) / 2.0
    if (test * 2 % 2 != 0.0) {
        val r1 = (test - 0.5).toInt()
        val r2 = (test + 0.5).toInt()
        println("*  " + " ".repeat(r1) + status + " ".repeat(r2) + "  *")
    } else {
        println("*  " + " ".repeat(test.toInt()) + status + " ".repeat(test.toInt()) + "  *")
    }

    print("*".repeat(printLen) + "\n")

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
        ' ' -> (return arrayOf("    ", "    ", "    "))
        else -> return arrayOf("", "", "")
    }
}