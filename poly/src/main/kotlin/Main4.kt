open class Base {
    open val x: Int=1
    open fun f() = println("Base Class f()")
}

class Child: Base() {
    override val x: Int = super.x +1
    override fun f() = println("Child Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        val x:Int = 3
        fun test() {
            f() // 1) 현재 이너 클래스의 f() 접근
            Child().f()     // 2) 바로 바깥 클래스 f()의 접근
            super@Child.f()     // 3) Child의 super인 Base클래스의 f()접근
            println("[Inside] super@Child.x 6: ${super@Child.x}")     // 4) Base의 x접근
            println("[Inside] Child().x : ${Child().x}")
            println("[Inside] x : ${x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()      // 이너 클래스 Inside의 메서드 test() 실행
}