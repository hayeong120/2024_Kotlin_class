// 주생성자를 포함한 클래스 사용하기
class Person1 (var name:String, var age:Int, var address:String) {

    fun play() = println("$name 가 좋아하는 노래부르기")
    fun sleeping(h:Int) = println("Sleep hour : $h")
}
fun main() {
    val hy = Person1("민들레",17,"서울시 관악구 미림마이스터고")
    println("이름 : ${hy.name}")
    println("나이 : ${hy.age}")
    println("주소 : ${hy.address}")
    hy.play()
    hy.sleeping(3)
}