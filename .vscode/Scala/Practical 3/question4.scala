object EvenSum {
    def sumEven(numbers: List[Int]): Int = {
        numbers.filter(_ % 2 == 0).sum
    }

    def main(args: Array[String]): Unit = {
        println("Enter Integers seperated by commas: ")
        val input = scala.io.StdIn.readLine()
        val numbers = input.split(",").map(_.trim.toInt).toList
        val evenSum = sumEven(numbers)
        println(s"The sum of even numbers are: $evenSum")
    }
}