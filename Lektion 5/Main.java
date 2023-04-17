public class Main
{
    public static void main(String[] args) {
        Library<Book> library = new Library<Book>();
        library.addItem(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 2018));
        library.addItem(new Book(2, "To Kill a Mockingbird", "Yarper Lee", 2018));

        library.printCatalog();

        Library<DVD> dvdLibrary = new Library<DVD>();
        dvdLibrary.addItem(new DVD(1, "The Godfather", 175));
        dvdLibrary.addItem(new DVD(2, "The Shawshank Redemption", 142));

        dvdLibrary.printCatalog();
    }
}
