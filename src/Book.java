public class Book {

    private String bookName;
    private String bookAuthor;
    private long bookISBN;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public long getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(long bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookISBN=" + bookISBN +
                '}';
    }
}