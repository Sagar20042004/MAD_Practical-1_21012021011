fun main(){
    var sagar = Student("sagar", "21012021011")
    println(sagar.name)
    println(sagar)
}

class Student(var name: String , var erNo : String){

    init {
        println("Name is $name")
        println("Enrollment is : $erNo")

    }

    override fun toString(): String {
        return super.toString()
    }
}

open class person(var fname : String , var lname : String){
    init{
        println("Name is $fname")
        println("Lname is $")
    }
}