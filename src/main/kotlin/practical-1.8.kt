import java.util.Scanner

fun main(){

    println("Bheda sagar / 21012021011")
    var reader = Scanner(System.`in`)

    var a1 = Array<Int>(5){0}
    println("Created array with use of Array<> method")
    println(a1.contentToString())

    var a2 = Array<Int>(10){i : Int->i}
    println("Created array with use of Array<> and lambda function")
    println(a2.contentToString())


    var a3 = arrayOf(10,20,30,40,50)
    println("Created array with use if arrayOf() method and print with for loop")
    for (i in a3){
        print("$i ")
    }

    println()
    println("Created array with uae of IntArray() method")
    var a4 = IntArray(5){5}

    println("print the array with use of range in for loop")
    arrayRange(a2)


    println()
    println("print the array with use of until in for loop")
    arrayUntil(a4)



    println()

    var a5 = intArrayOf(1,2,3,4,5)
    println("Created array with use of intArrayOf() method and print with use of joinToString() method")
    println(a5.joinToString(" "))

    println("reverse array of a3 is :")
    arrayReverse(a3)


    println()
    println("2D array")


    var arr:Array<IntArray> = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6)
    )
    print(arr.contentDeepToString())

    println()
    println("Enter the array size : ")


    var size:Int = reader.nextInt()

    println("Enter the value of array")

    var a7 = Array<Int>(size) { readLine()!!.toInt()}
    println(a7.contentToString())

    println("Sorted array is :")
    a7 = a7.sortedArray()
    println(a7.contentToString())


    println("Sort the array without using built in function")
    println("Array without sorting : ")
    println(a7.contentToString())

    println("Sorted array :")
    sortArray(a7)


}

fun arrayRange(array: Array<Int>){
    for(j in 0..array.size-1){
        print("${array[j]}, ")
    }
}

fun arrayUntil(array:IntArray){
    for(j in 0 until array.size){
        print("${array[j]}, ")
    }
}

fun arrayReverse(array : Array<Int>){
    for (k in array.size-1 downTo 0){
        print("${array[k]} , ")
    }
}

fun sortArray(array : Array<Int>){
    var temp = 0
    for(g in 0..array.size-1){
        for (x in 0 until g){
            if (array[g] < array[x]){
                temp = array[g]
                array[g] = array[x]
                array[x] = temp
            }
        }
    }
    println(array.contentToString())
}