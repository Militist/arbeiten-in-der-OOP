public class Book extends LibraryItem
{
    private String author;
    private int pages;

    public Book(int id, String title, String author, int pages)
    {
        super(id, title);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthr()
    {
        return author;
    }

    public int getPages()
    {
        return pages;
    }

    public void getInfo()
    {
        System.out.println("Book: " + getTitle() + ", author: " + getAuthr() + ", pagess: " +
        getPages() + ", id: " + getId() + "checked out: ." + isCheckedOut());
    }
}
