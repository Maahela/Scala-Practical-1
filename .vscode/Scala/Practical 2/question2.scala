object ScalaExpressions {
    def main(args: Array[String]): Unit = {
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var k = 4.3f
        var g = 4.0f

        b -= 1
        var x = (b * a + c*d)
        d -= 1
        println(s"println( - -b * a + c *d - -); $x")

        println(s"println(a++); $a")
        a += 1

        var y = -2 *(g - k) + c
        println(f"println(-2 *(g - k) + c); $y%.1f")

        println(s"println(c = c++); $c")
        c +=1

        c +=1
        val n = c * a
        println(s"println (c=++c*a++); $n")
       
        a +=1
    }
}
