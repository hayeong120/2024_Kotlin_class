open class Person1(var name:String, var address:String, var age:Int, var food:String)
{
    fun eat() = println("Eating : $food")
    fun sleep(hour:Int) = println("Sleeping : $hour")
}

// 부생성자를 사용하는 상속
class Student2 :Person1 {
    val school:String
    constructor(name: String, address: String, age: Int, food: String, school: String)
    :super(name, address, age, food) {
        this.school = school
    }
    fun study(subject: String) = println("Study : $subject in : $school")
}

fun main()
{
    val str1 = Student1("kim", "신림동", 18, "오므라이스", "미림마고")
    str1.name
    str1.address
    str1.eat()
    str1.sleep(5)
    str1.study("java")
}