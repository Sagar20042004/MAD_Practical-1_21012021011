import java.util.Scanner

fun main(){

    var reader = Scanner(System.`in`)

    println("Bhda sagar / 21012021011")
    println("Enter the number : ")
    var x = reader.nextInt()
    var evenOdd = if (x.toInt() % 2 == 0) "even" else "odd"
    println("$x is $evenOdd")
}