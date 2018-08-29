public class problem7 {
    public static void main(String[] args)
    {
        drawLine();
    }
    public static void drawLine()
    {
        for (int i=1; i<=5; i++)
        {
            for (int a=5; a>=i; a--)
            {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
