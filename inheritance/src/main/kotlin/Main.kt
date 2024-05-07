// 상속
open class Bird7 (var name:String, var wing:Int, var beak: String, var color: String, var age: Int) {

    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}
// 주생성자를 사용하는 상속
class Lark(name:String, wing:Int, beak:String, color:String, age: Int)
    :Bird7(name, wing, beak, color, age) {
    fun singHitone() = println("Happy Song")    // 자식이 새로 만든 것
}

fun main() {
    val lark1 = Lark("lark",2,"long","brown", 12)
    println("lark1.color : ${lark1.color}")
    lark1.fly()
    lark1.sing(3)
    lark1.singHitone()
}