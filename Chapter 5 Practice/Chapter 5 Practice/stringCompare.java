
public class stringCompare
{
    public static void print(){
        String string1 = "catalog";
        String string2 = "cat";
        if (string1.compareTo("aaa")>1)
        {
            System.out.println("catalog is bigger than aaa, yo");
        }

        if (string1.equals(string2) == true )
        {
            System.out.println("the words, they be the same");
        }
        else
        {
            System.out.println("Nah, bro");

       }

       if (string1.compareTo(string2) < 0)
       {
           System.out.println("String1 be the lesser string");
        }
        else
        {
            System.out.println("wut?");
        }

        if (string1.substring(0,3).equals(string2.substring(0,3)))
        {
            System.out.println("merryt chriwstmas");
        }
        else
        {
            System.out.println(string1.substring(0,3));
        }
    }
}