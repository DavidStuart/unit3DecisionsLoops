import java.util.Random;
import java.util.Scanner;
public class SwapLetters
{
    /**
     * 
     */
    public static void main(String[] args)
    {
           Random randnum = new Random();
           Scanner msg = new Scanner(System.in);
           
           System.out.print("Enter a word: ");
           String word = msg.next();
           
           int k; // this is i
           int l; //This is j
           
           for(int i = 0;
               i < word.length();
               i++)
           {
              System.out.println(word);
           }
           k = randnum.nextInt(word.length());
           l = randnum.nextInt(word.length());
           
           while((k >= l) || (k == 0) || (l == word.length()))
           {
               k = randnum.nextInt(word.length());
               l = randnum.nextInt(word.length());
           }
           
           String first = word.substring(0,k);
           String middle = word.substring(k+1,l);
           String last = word.substring(l+1,word.length());
           
           System.out.print("\n" +first);
           System.out.print(word.charAt(l));
           System.out.print(middle);
           System.out.print(word.charAt(k));
           System.out.println(last);
    }
}
