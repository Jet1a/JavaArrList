public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        Book book1 = new Book("Murder on the Orient Express","Agatha Christie","57924");
        Book book2 = new Book("Sherlock Holmes","Arthur Conan Doyle","84351");
        Book book3 = new Book("Halloween Party","Agatha Christie","22831");
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "73565");
        Book book5 = new Book("To Kill a Mockingbird", "Harper Lee", "12084");
        Book book6 = new Book("1984", "George Orwell", "52435");

        catalog.addBook(book1);
        catalog.addBook(book2);
        catalog.addBook(book3);
        catalog.addBook(book4);
        catalog.addBook(book5);
        catalog.addBook(book6);

        System.out.println("List of Book in the Catalog:" + "\n");
        catalog.listAllBooks();

        System.out.println("Search results for Sherlock Holmes:" + "\n");
        catalog.searchByTitle("Sherlock Holmes");

        System.out.println("Search results for Agatha Christie Book:" + "\n");
        catalog.searchByAuthor("Agatha Christie");
    }
}