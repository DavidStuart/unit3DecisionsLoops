

/**
 * Write a description of class NestedDo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NestedDo
{
    public static void main(String[] args)
    {
        int counter = 1;
        int second = 0;
        do
        {
            System.out.print(1);
            
            do
            {
                second+= 1;
                System.out.println(second);
                break;
            }
            while(counter <=4);
            counter +=1;
        }
        while(counter <= 4);
        counter = 1;
        second = 0;
        do
        {
            System.out.print(2);
            
            do
            {
                second+= 1;
                System.out.println(second);
                break;
            }
            while(counter <=4);
            counter +=1;
        }
        while(counter <= 4);
    }
    
}