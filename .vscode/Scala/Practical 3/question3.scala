object Mean {
    def calMean(num1: Int, num2: Int): Double = {
        val mean = (num1 + num2) / 2.0
        BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }

    def main(args: Array[String]): Unit = {
        println("Enter the first Number:")
        val num1 = scala.io.StdIn.readInt()
        println("Enter the Second number:")
        val num2 = scala.io.StdIn.readInt()
        val mean = calMean(num1, num2)
        println(f"The mean of $num1 and $num2 is: $mean%.2f")
    }

}