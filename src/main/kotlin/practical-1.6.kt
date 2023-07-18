import java.util.Scanner

fun main(){

    println("Bheda sagar / 21012021011")
    var reader = Scanner(System.`in`)

    println("Enter num1 :")
    var num1 = reader.nextInt()

    println("Enter num2 :")
    var num2 = reader.nextInt()

//    var num1 : Int
//    var num2 : Int
    var sum = add(num1 , num2)
    println("Sum is $sum")
}

fun add(num1 : Int , num2: Int) : Int {

    return num1 + num2
}