
import scala.math.BigDecimal

object TheaterProfitCalculator {

  val initialPrice: Double = 15.0
  val initialAttendance: Int = 120
  val priceChange: Double = 5.0
  val attendanceChange: Int = 20
  val fixedCost: Double = 500.0
  val variableCostPerAttendee: Double = 3.0

  def calculateAttendance(price: Double): Int = {

    initialAttendance + ((initialPrice - price) / priceChange * attendanceChange).toInt
  }

  def calculateProfit(price: Double): Double = {
    val attendance = calculateAttendance(price)
    val revenue = price * attendance
    val totalCost = fixedCost + (variableCostPerAttendee * attendance)
    val profit = revenue - totalCost
    profit
  }

  def findBestTicketPrice(startPrice: Double, endPrice: Double, step: Double): (Double, Double) = {

    val prices = BigDecimal(startPrice) to BigDecimal(endPrice) by BigDecimal(step)
    val profits = prices.map(_.toDouble).map(price => (price, calculateProfit(price)))
    profits.maxBy(_._2)
  }

  def main(args: Array[String]): Unit = {
    val (bestPrice, maxProfit) = findBestTicketPrice(5.0, 25.0, 0.1)
    println(f"The best ticket price is Rs.$bestPrice%.2f with a maximum profit of Rs.$maxProfit%.2f")
  }
}
