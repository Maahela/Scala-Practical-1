import scala.io.StdIn.readLine

object ListFilter {
    def filterLists(strings: List[String]): List[String] = {
        strings.filter(_.length > 5)
    }

    def main(args: Array[String]): Unit = {
        println("Enter a string seperated by commas:")
        val input = readLine()
        val inputStrings = input.split(",").map(_.trim).toList
        val filteredList = filterLists(inputStrings)
        println(s"Filtered List is: $filteredList")
    }
}





