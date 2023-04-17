public abstract class LibraryItem
{
    private int id;
    private String title;
    private boolean isCheckedOut;

    public LibraryItem(int id, String title)
    {
        this.id = id;
        this.title = title;
        this.isCheckedOut = false;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isCheckedOut()
    {
        return isCheckedOut;
    }

    public void checkOut()
    {
        isCheckedOut = true;
    }

    public void checkIn()
    {
        isCheckedOut = false;
    }

    public abstract void getInfo();
}
