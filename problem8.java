public class problem8 {
    public static void main(String[] args)
    {
        drawLine();
    }
    public static void drawLine()
    {
        for(int i=1; i<=5; i++)
        {
            for(int a=5; a>=i; a--)
            {
                System.out.print(" ");
            }
            for (int b=1; b<= i; b++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
