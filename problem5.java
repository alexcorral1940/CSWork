public class problem5 {
    public static void main(String[] args)
    {
        drawLine();
    }
    public static void drawLine()
    {
        for (int i=1; i <=5; i++)
        {
            for (int a=1; a<=i; a++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
