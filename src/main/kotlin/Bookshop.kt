class Bookshop {

    val books = mutableListOf<Book>()

    fun getBooksByYearPublished(year: Int): List<Book> = books.filter { it.datePublished == year }

    fun removeBooksByYear(year: Int) {

        books.removeIf { it.datePublished == year }
    }

    fun addBooks(bookList: Collection<Book>) {

        books.addAll(bookList)
    }

}