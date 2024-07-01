object TicketCalculator {
  def attendees(price: Int): Int = {
    120 + (15 - price) / 5 * 20
  }

  def revenue(price: Int): Int = {
    attendees(price) * price
  }

  def cost(attendees: Int): Int = {
    500 + 3 * attendees
  }

  def profit(price: Int): Int = {
    revenue(price) - cost(attendees(price))
  }

  def main(args: Array[String]): Unit = {
    var bestPrice = 0
    var maxProfit = Int.MinValue

    for (price <- 5 to 50 by 5) {
      val currentProfit = profit(price)
      println(s"Price: Rs $price, Profit: Rs $currentProfit")
      if (currentProfit > maxProfit) {
        maxProfit = currentProfit
        bestPrice = price
      }
    }

    println(s"The best ticket price is Rs $bestPrice with a profit of Rs $maxProfit")
  }
}