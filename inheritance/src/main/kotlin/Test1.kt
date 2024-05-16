open class Person(var name:String, var address:String, var age:Int, var food:String)
{
    fun eat() = println("Eating : $food")
    fun sleep(hour:Int) = println("Sleeping : $hour")
}

// 주생성자를 사용하는 상속
class Student1(name: String, address: String, age: Int, food: String, var school:String)
    : Person(name, address, age, food)
    {
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