import java.util.Scanner

fun main(){

    println("Bheda sagar / 21012021011")


    println("Enter num1 :")
    var num1 = readLine()!!.toDouble()

    println("Enter num2 :")
    var num2 = readLine()!!.toDouble()

    println("Bheda sagar / 2101201011")
    var sum = add(num1 , num2)
    var x = sub(num1, num2)
    var y = mul(num1, num2)
    var z = div(num1, num2)


    println("Sum is $sum")
    println("Sub is $x")
    println("Mul is $y")
    println("Div is $z")


}

fun add(num1 : Double , num2: Double) : Double {

    return num1 + num2
}

fun mul(num1 : Double , num2: Double) : Double{
    return num1*num2
}

fun div(num1: Double , num2: Double): Double{
    return num1/num2
}

fun sub(num1: Double , num2: Double):Double{
    return num1 - num2
}
