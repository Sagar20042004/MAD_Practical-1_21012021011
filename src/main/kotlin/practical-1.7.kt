import java.util.Scanner

fun main(){

    println("Bheda sagar / 21012021011")
    println("Enter the number : ")
    var num = readLine()!!.toInt()

    var x = fect(num)
    println("factorial is :$x")

}

tailrec fun fect(num1 :Int , ans:Int=1):Long{

    return if (num1==1) ans.toLong()
    else fect(num1-1 , ans * num1)

}