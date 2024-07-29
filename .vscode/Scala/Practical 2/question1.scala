object ScalaExpressions {
    def main(args: Array[String]): Unit = {
        var i, j, k = 2
        var m, n = 5
        var f = 12.0f
        var g = 4.0f
        var c = 'X'

        val a = k + 12 * m
        val b = m / j
        val d = n % j
        val e = m / j * j
        val s = f + 10 * 5 + g
        i += 1
        val z = i * n

        println(s"$a")
        println(s"$b")
        println(s"$d")
        println(s"$e")
        println(s"$s")
        println(s"$z")
    }

}