import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void listAllBooks() {
        for (Book book : books) {
            System.out.println("Title : " + book.getTitle());
            System.out.println("Author : " + book.getAuthor());
            System.out.println("ISBN : " + book.getIsbn());
            System.out.println();
        }
    }


    public List<Book> searchByTitle(String title) {
        List<Book> resultTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                resultTitle.add(book);
            }
        }
        if (resultTitle.isEmpty()) {
            System.out.println("No books with the title found.");
        } else {
            for (Book book : resultTitle) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println();
            }
        }
        return resultTitle;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> resultAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                resultAuthor.add(book);
            }
        }
        if (resultAuthor.isEmpty()) {
            System.out.println("No books with the title found.");
        } else {
            for (Book book : resultAuthor) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println();
            }
        }
        return resultAuthor;
    }
}