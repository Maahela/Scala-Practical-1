import scala.compiletime.ops.double
object SalaryCal{
    val normalRate: Double = 250.0
    val otRate:  Double = 85.0
    val tax: Double = 0.12

    def takeHomeSalary(nH: Int,otH:Int): Double= {
        val grossSalary: Double = (nH*normalRate) + (otH * otRate)

        val taxAmount: Double = grossSalary * tax

        val takeHomeSalary: Double = grossSalary - taxAmount

        takeHomeSalary
    }

    def main(args: Array[String]): Unit = {
        val Salary = takeHomeSalary(40, 30)
        println(s"Total Salary taken: $Salary")
    }
}
