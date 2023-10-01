import java.util.Scanner

fun main() {

    println("Student Enrollment No. :")
    var a = readLine()

    println("student name : ")
    var b = readLine()

    println("Student Branch :")
    var c = readLine()

    println("Student class :")
    var d = readLine()

    println("Student Batch :")
    var e = readLine()

    println("Student college Name :")
    var f = readLine()

    println("Student university name :")
    var g = readLine()

    println("Student Age :")
    var h = readLine()

    println("STUDENT DATA")

    println("Enrollment no : ${a?.toString()}")
    println("Name : $b")
    println("Age : ${h?.toInt()}")
    println("branch : $c")
    println("Class : $d")
    println("Batch : $f")
    println("University name : $g")
}