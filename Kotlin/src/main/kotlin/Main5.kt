// 2. 주생성자 선언 - 생략된 표현법
class Bird5 (var name:String, var wing:Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}
fun main() {
    val coco1 = Bird5("mybird",2,"short","blue")
    coco1.color = "yellow"
    println("coco1.color : ${coco1.color}")
    coco1.fly()
    coco1.sing(3)
}