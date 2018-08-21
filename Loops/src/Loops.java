public class Loops {
    public static void main(String[] args)
    {
        writeSquares();
        writeSquares2();
        writeSquares3();
        writeSquares4(1000);
        writeSquares5();
    }

    public static void writeSquares()
    {
        System.out.println("writeSquares...");
        System.out.println(1 + " squared = " + (1*1));
        System.out.println(2 + " squared = " + (2*2));
        System.out.println(3 + " squared = " + (3*3));
        System.out.println(4 + " squared = " + (4*4));
        System.out.println(5 + " squared = " + (5*5));
    }
    public static void writeSquares2()
    {
        System.out.println("writeSquares2...");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i + " squared = " + (i*i));
        }
    }
    public static void writeSquares3()
    {
        System.out.println("writeSquares3...");
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(i + " squared = " + (i*i));
        }
        writeSquares4(1000);
    }
    public static void writeSquares4(int stopVal)
    {
        System.out.println("writeSquares4...");
        System.out.println("stop value is " + stopVal);
        for (int i = 1; i <= stopVal; i++)
        {
            System.out.println(i + " squared = " + (i*i));
        }
    }
    public static void writeSquares5()
    {
        System.out.println("writeSquares5...");
        for (int c = ( 2+2); c <= (17*3); c++)
        {
            System.out.println(c + " squared = " + (c*c));
        }
    }
}
