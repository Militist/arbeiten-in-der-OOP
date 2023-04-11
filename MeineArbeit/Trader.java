public class Trader implements IBuying, ISelling
{
    Baker baker1 = new Baker();



    int money = 2;
    int product;

    public int sellOff(int value)
    {
        product = baker1.bakeBred();
        if (product > 0)
        {
            money *= product;
        }
        System.out.println("Я зароботал " + money + " монет.");
        return money;
    }

    public int selling(int value)
    {
        product = baker1.bakeBred();
        int res = 0;

        if (product > 20)
        {
            res = product - value;
            System.out.println("Я смог продать " + res + " булок");
        }
        else System.out.println("Совсем нечем торговать!");
        return res;
    }
}
