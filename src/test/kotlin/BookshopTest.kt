import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

internal class BookshopTest {

    val bookshopUnderTest = Bookshop()
    @BeforeEach
    fun setup() {

        val bookList = listOf<Book>(
            Book("ExampleBook", 1980),
            Book("ExampleBook2", 1980),
            Book("ExampleBook3", 1990),
            Book("ExampleBook4", 2000),
        )

        bookshopUnderTest.addBooks(bookList)

        println("Bookshop Under Test: ${bookshopUnderTest.books}")

    }

    @Test
    fun `Bookshop has three books after calling addBooks() with length 3`() {
        val bookshop = bookshopUnderTest
        val bookShopListLength = bookshop.books.count()

        assertEquals(4, bookShopListLength)

    }

    @Test
    fun `getBooksYearPublished returns 2 Books published in year 1980`() {

        val bookshop = bookshopUnderTest
        val booksFrom1980 = bookshop.getBooksByYearPublished(1980)

        val booksFrom1980Length = booksFrom1980.count()

        assertEquals(2, booksFrom1980Length)

    }

    @Test
    fun `getBooksYearPublished returns Book named ExampleBook3 for year 1990`() {

        val booksFrom1990 = bookshopUnderTest.getBooksByYearPublished(1990)

        assertEquals("ExampleBook3", booksFrom1990.first().name)
    }

    @Test
    fun `Bookshop can remove books from year 2000`() {

        bookshopUnderTest.removeBooksByYear(2000)

        println(bookshopUnderTest.books)

        // Does our books list have any books from year 2000
        val year2000BookCheck = bookshopUnderTest.books.contains(Book("ExampleBook4", 2000))

        assertFalse(year2000BookCheck)


    }
}