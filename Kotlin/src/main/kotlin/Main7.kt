// 상속
open class Bird7 (var name:String, var wing:Int, var beak: String, var color: String) {

    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}
// 주생성자를 사용하는 상속
class Lark(name:String, wing:Int, beak:String, color:String)
        :Bird7(name, wing, beak, color) {
            fun singHitone() = println("Happy Song")
        }

fun main() {
    val coco1 = Bird7("mybird",2,"short","blue")
    val lark1 = Lark("lark",4,"long","brown")
    println("name : ${coco1.name}")
    println("color : ${coco1.color}")
    println("beak : ${coco1.beak}")
    coco1.fly()
    coco1.sing(3)
    println()

    println("lark1.name : ${lark1.name}")
    println("lark1.color : ${lark1.color}")
    println("lark1.beak : ${lark1.beak}")
    lark1.fly()
    lark1.sing(5)
}