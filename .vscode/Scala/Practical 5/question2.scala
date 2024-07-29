import scala.io.StdIn._

object LibraryManagementSystem {


  case class Book(title: String, author: String, isbn: String)


  var library: Set[Book] = Set(
    Book("MadolDuwa", "Martin", "1234567890"),
    Book("Harry Potter","JK", "1234567891"),
    Book("Ape Gama", "Martin", "1234567892")
  )

  def main(args: Array[String]): Unit = {
    var continue = true

    while (continue) {
      println("Library Management System")
      println("1. Display Library")
      println("2. Add Book")
      println("3. Remove Book")
      println("4. Check Book by ISBN")
      println("5. Search Book by Title")
      println("6. Display Books by Author")
      println("7. Exit")
      print("Choose an option: ")

      readLine() match {
        case "1" => displayLibrary()
        case "2" => addBook()
        case "3" => removeBookByIsbn()
        case "4" => checkBookByIsbn()
        case "5" => searchBookByTitle()
        case "6" => displayBooksByAuthor()
        case "7" => continue = false
        case _ => println("Invalid option. Please try again.")
      }
    }
  }


  def addBook(): Unit = {
    println("Enter book title:")
    val title = readLine()
    println("Enter book author:")
    val author = readLine()
    println("Enter book ISBN:")
    val isbn = readLine()

    val newBook = Book(title, author, isbn)
    if (library.exists(_.isbn == isbn)) {
      println("A book with this ISBN already exists in the library.")
    } else {
      library += newBook
      println(s"Book '${title}' by ${author} added to the library.")
    }
  }


  def removeBookByIsbn(): Unit = {
    println("Enter book ISBN to remove:")
    val isbn = readLine()

    val bookToRemove = library.find(_.isbn == isbn)
    bookToRemove match {
      case Some(book) =>
        library -= book
        println(s"Book '${book.title}' by ${book.author} removed from the library.")
      case None => println("No book found with the given ISBN.")
    }
  }


  def checkBookByIsbn(): Unit = {
    println("Enter book ISBN to check:")
    val isbn = readLine()

    if (library.exists(_.isbn == isbn)) {
      println("The book is in the library.")
    } else {
      println("The book is not in the library.")
    }
  }


  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
    println()
  }


  def searchBookByTitle(): Unit = {
    println("Enter book title to search:")
    val title = readLine()

    val result = library.find(_.title == title)
    result match {
      case Some(book) => println(s"Book Found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None => println(s"No book found with title: $title")
    }
  }

  
  def displayBooksByAuthor(): Unit = {
    println("Enter author name to search:")
    val author = readLine()

    val booksByAuthor = library.filter(_.author == author)
    if (booksByAuthor.isEmpty) {
      println(s"No books found by author: $author")
    } else {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    }
  }
}
