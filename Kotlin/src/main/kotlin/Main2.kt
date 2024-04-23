// 부생성자 - 매개변수를 통해 초기화 프로퍼트 지정
class Bird2 {
    var name:String
    var wing:Int
    var beak:String
    var color:String

    constructor(name:String, wing:Int, beak:String, color:String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}
fun main() {
    val coco = Bird2("mybird",2,"short","blue")
    coco.color = "yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}