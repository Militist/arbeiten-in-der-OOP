public class DVD extends LibraryItem
{
    private int length;

    public DVD(int id, String title, int length)
    {
        super(id, title);
        this.length = length;
    }

    public int getLength()
    {
        return length;
    }

    public void getInfo()
    {
        System.out.println("DVD: " + getTitle() + ", length: " + getLength()
                + " minutes, id: " + getId() + ", checked out: " + isCheckedOut());
    }
}
