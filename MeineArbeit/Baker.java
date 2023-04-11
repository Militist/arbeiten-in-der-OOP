import java.util.Scanner;
public class Baker implements IBaker
{
    int numberOfProducts;

    public Baker()
    {
        numberOfProducts = 0;
    }

    Scanner input = new Scanner(System.in);

    public int bakeBred()
    {
        System.out.println("Укажите количество испечённых пекарем булок: ");
        int production = 0;
        production = input.nextInt();
        for (int i = 0; i < production; i++)
        {
            numberOfProducts += 1;
        }
        System.out.println("Я испёк " + numberOfProducts + " булок за рабочую смену.");
        return numberOfProducts;
    }
}
