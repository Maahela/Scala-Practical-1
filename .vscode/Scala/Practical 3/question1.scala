import scala.io.StdIn.readLine

object StringReversal {
    def reverse(s: String): String = {
        if (s.isEmpty) ""
        else reverse(s.tail) + s.head
    }

    def main(args: Array[String]): Unit = {
        println("Enter a string to reverse:")
        val original = readLine()
        val reversed = reverse(original)
        println(s"Reversed String: $reversed")
    }
}