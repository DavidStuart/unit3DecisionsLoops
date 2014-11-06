import java.util.Scanner;
public class Substrings
{
    public static void main(String[] args)
    {
        Scanner msg = new Scanner(System.in);
        System.out.print("Enter a word: ");
        
        String word = msg.next();
        int length = word.length();
        
        int outerbound = 0;
        
        
        int sentry = 0;
        while(sentry == 0)
        {
            for(int i = outerbound + 1;
                i <= length;
                i++)
            {
                System.out.println(word.substring(outerbound,i));
            }
            outerbound++;
            if(outerbound == length)
            {
                sentry++;
            }
        }
    }
}
