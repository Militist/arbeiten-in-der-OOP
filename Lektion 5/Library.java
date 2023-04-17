import java.util.ArrayList;


public class Library<T extends LibraryItem>
{
    private ArrayList<T> items;

    public Library()
    {
        items = new ArrayList<T>();
    }

    public void addItem(T item)
    {
        items.add(item);
    }

    public void removeItem(T item)
    {
        items.remove(item);
    }

    public void printCatalog()
    {
        System.out.println("Catalog:");
        for(T item : items)
        {
            item.getInfo();
        }
        System.out.println();
    }
}
