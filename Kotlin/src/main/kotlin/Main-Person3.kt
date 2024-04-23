// 2. 주생성자 선언 - 생략된 표현법, 프로퍼티의 기본값 지정, init
class Person2 (var name:String, var age:Int=18, var address:String="서울시 관악구 미림마이스터고") {
    init {
        println("---------------- 자기소개 ----------------")
        println("이름 : $name")
        println("나이 : $age")
        println("주소 : $address")
        this.play()
        println("------------- end of init -------------")
    }
    fun play() = println("$name 가 좋아하는 노래부르기")
    fun sleeping(h:Int) = println("Sleep hour : $h")
}
fun main() {
    val hy = Person2("민들레", age = 20)
    hy.sleeping(3)
}