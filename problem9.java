public class problem9 {
    public static void main(String[] args)
    {
        drawLine();
    }
    public static void drawLine()
    {
        for(int i=1; i<=5; i++)
        {
            for(int a=1; a<=8; a++)
            {
                System.out.print("-");
            }
        }
        System.out.println();
        for(int b=1; b<=10; b++)
        {
            System.out.print("_-^-");
        }
        System.out.println();
        for(int c=1; c<=2; c++)
        {
            for(int d=1; d<=9; d++)
            {
                for(int e=1; e<=2; e++)
                {
                    System.out.print(d);
                }
                if (d==9) {
                    System.out.print("00");
                }
            }
        }
        System.out.println();
        for(int f=1; f<=5; f++)
        {
            for(int g=1; g<=2; g++)
            {
                System.out.print("----");
            }
        }
    }
}
