// 2. 주생성자 선언 - 생략된 표현법, 프로퍼티의 기본값 지정, init
class Bird6 (var name:String="NONAME", var wing:Int=2, var beak: String, var color: String) {
    // 초기화 블럭
    init {
        println("---------------- init ----------------")
        println("The name is $name, The beak id $beak")
        this.sing(3)
        println("------------- end of init -------------")
    }
    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}
fun main() {
    val coco1 = Bird6(beak="short", color="blue")
    println("name : ${coco1.name}")
    println("color : ${coco1.color}")
    println("beak : ${coco1.beak}")
    coco1.fly()
    coco1.sing(3)
}