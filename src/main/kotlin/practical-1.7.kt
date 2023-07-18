import java.util.Scanner

fun main(){
    var reader = Scanner(System.`in`)

    println("Enter the number : ")
    var num = reader.nextLong()

    var x = fect(num)
    println("factorial is :$x")

}

fun fect(num1 :Long):Long{
    var temp = 0
    return temp * fect(num1-1)
}