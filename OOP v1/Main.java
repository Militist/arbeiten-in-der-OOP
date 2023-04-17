public class Main
{
    public static void main(String[] args)
    {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 123);
        Pair<Double, String> pair2 = new Pair<Double,String>(3.14, "word");
        System.out.println(pair1);
        System.out.println(pair2);
    }
}
