class Bookshop {

    val books = mutableListOf<Book>()

    fun getBooksByYearPublished(year: Int): List<Book> = books.filter { it.datePublished == year }

    fun removeBooksByYear(year: Int) {

        books.removeIf { it.datePublished == year }
    }

    fun addBooks(bookList: Collection<Book>) {

        books.addAll(bookList)
    }

    fun sellBook(customer: Customer, book: Book) {

        if (!books.contains(book))
            throw BookNotFoundError("Book: $book not in this bookshop")

        customer.ownedBooks.add(book)
    }

    class BookNotFoundError(message: String) : Exception(message) {

    }


}
