import java.util.Scanner;
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("how long do you like it?\t:");
        int lenght = in.nextInt();
        int maxWidth = 2*lenght-1;
        int spacePrinter;
        int sentry = 0;
        for (int i=1; i< lenght; i++)
        {
            spacePrinter = (maxWidth- i)/2;
            sentry = 0;
            while (sentry < spacePrinter)
            {
                System.out.print(" ");
                sentry ++;
            }
            sentry = 0;
            while ( sentry < (2*i)-1)
            {
                System.out.print("*");
                sentry ++;
            }
            System.out.println();
        }
        for (int i = 1; i<=maxWidth; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int i=lenght-1; i >= 1; i--)
        {
            spacePrinter = (maxWidth- i)/2;
            sentry = 0;
            while (sentry < spacePrinter)
            {
                System.out.print(" ");
                sentry ++;
            }
            sentry = 0;
            while (sentry < 2*i-1)
            {
                System.out.print("*");
                sentry ++;
            }
            System.out.println();
        }
    }
}