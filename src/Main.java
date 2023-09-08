public class Main {

    public static void main(String[] args) {
	// write your code here
        BookRequest request1 = new BookRequest();
        request1.setBookName("Hairy Potter");
        request1.setBookAuthor("K.K. Column-ing");
        request1.setBookISBN(169752314631L);

        BookRequest request2 = new BookRequest();
        request2.setBookName("The CALL of Octopus");
        request2.setBookAuthor("G.G. Hugcraft");
        request2.setBookISBN(543478531235L);

        Book book1 = bookValidation(request1);
        Book book2 = bookValidation(request2);

        Library lib1 = new Library();
        lib1.addToLibrary(book1);
        lib1.addToLibrary(book2);

        lib1.removeFromLibrary(0);

    }

    public static Book bookValidation(BookRequest request) {

        if (request.getBookName() == null) {

            System.out.println("Book's name can't be null");
            return null;
        }

        if (request.getBookAuthor() == null) {

            System.out.println("Book's author can't be null");
            return null;
        }

        if (request.getBookISBN() == 0) {

            System.out.println("Please enter a proper ISBN serial number");
            return null;
        }

        Book book = new Book();
        book.setBookName(request.getBookName());
        book.setBookAuthor(request.getBookAuthor());
        book.setBookISBN(request.getBookISBN());

        return book;

    }
}
