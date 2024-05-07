open class Student (var name:String = "홍길동", var age:Int = 8, var school:String = "초등학생") {
    fun todo() = println("공부합니다.")
}
class middle (name: String, age: Int = 14, school: String = "중학생")
    :Student (name, age, school) {
        fun play() = println("게임을 합니다.")
}
class high :Student {
    constructor(name: String, age: Int = 17, school: String = "고등학생")
            :super(name, age, school) {}
    fun play() = println("k-pop을 듣습니다.")
}

fun main() {
    val Elementary = Student("민들레", 8, "초등학생")
    val Middle = middle("홍길동", 14, "중학생")
    val High = high("강바람", 17, "고등학생")

    println("Elementary : ${Elementary.name}, ${Elementary.age}, ${Elementary.school}")
    println("Middle : ${Middle.name}, ${Middle.age}, ${Middle.school}")
    println("High : ${High.name}, ${High.age}, ${High.school}")
    Elementary.todo()
    Middle.play()
    High.play()
}