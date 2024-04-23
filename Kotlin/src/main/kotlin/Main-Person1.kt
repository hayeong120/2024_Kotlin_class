// 부생성자 2개 - 매개변수를 통해 초기화 프로퍼트 지정
class Person {
    var name: String
    var age: Int
    var address: String

    constructor(name:String) {
        this.name = name
        this.age = 18
        this.address = "서울시 관악구 미림마이스터고"
    }

    constructor(name:String, age:Int, address:String) {
        this.name = name
        this.age = age
        this.address = address
    }

    fun play() = println("$name 가 좋아하는 노래부르기")
    fun sleeping(h:Int) = println("Sleep hour : $h")
}
fun main() {
    val hy = Person("민들레",17,"서울시 관악구 미림마이스터고")
    println("이름 : ${hy.name}")
    println("나이 : ${hy.age}")
    println("주소 : ${hy.address}")
    hy.play()
    hy.sleeping(3)
    val hy2 = Person("강바람")
    println("이름 : ${hy2.name}")
    println("나이 : ${hy2.age}")
    println("주소 : ${hy2.address}")
    hy2.play()
    hy2.sleeping(6)
}