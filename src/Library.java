import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> library = new ArrayList<>();

    public List<Book> getLibrary() {
        return library;
    }

    public void setLibrary(List<Book> library) {
        this.library = library;
    }

    // add/remove book from library
    public void addToLibrary(Book book) {

        library.add(book);
        System.out.println("Completed add book " + book.getBookName() + " to library.");
    }

    public void removeFromLibrary(int libraryIndex) {

        String nameTemp = library.get(libraryIndex).getBookName();
        library.remove(libraryIndex);
        System.out.println("Completed remove " + nameTemp + " from library.");
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
