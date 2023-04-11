public class Main
{
    public static void main(String[] args)
    {
        Baker confectioner = new Baker();
        Trader Fred = new Trader();
        Trader Alex = new Trader();

        Fred.sellOff(confectioner.bakeBred());
        Alex.selling(confectioner.bakeBred());
    }
}
