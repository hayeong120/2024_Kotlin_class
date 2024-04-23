// 주생성자를 포함한 클래스 사용하기
class Bird4 constructor(name_:String, wing_:Int, beak_: String, color_: String) {
    var name:String = name_
    var wing:Int = wing_
    var beak:String = beak_
    var color:String = color_

    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}
fun main() {
    val coco1 = Bird4("mybird",2,"short","blue")
    coco1.color = "yellow"
    println("coco1.color : ${coco1.color}")
    coco1.fly()
    coco1.sing(3)
}