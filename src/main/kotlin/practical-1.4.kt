import java.util.Scanner

fun main(){ println("21012021011 || Sagar Bheda")
    println("Enter a Number: ");
    val n1 = readLine()?.toInt()

    if (n1 != null) {
        if(n1 % 2 == 0)
            println("$n1 is an Even Number") else
            println("$n1 is an Odd Number")
    }
}
