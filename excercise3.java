public class excercise3 {
    public static void main(String[] args)
    {
        printPowersOfN(4, 3);
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);
    }
    public static void printPowersOfN(int base, int exponent)
    {
        int answer = 1;

        for (int i=0; i <= exponent; i++) {
            System.out.print(answer);
            System.out.print(" ");
            answer *= base;
        }
        System.out.println();
    }
}
