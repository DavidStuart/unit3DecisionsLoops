/**
 * 
 */
public class NestedLoops
{
    /** description of instance variable x (add comment for each instance variable) *
    /**
     * 
     */
    public static void main(String[] args)
    {
        int second = 0;
        for(int i = 0; 
            i <= 7;
            i++)
        {
            if(i <= 3)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("2");
            }
            if(i == 4)
            {
                second = 0;
            }
            second += 1;
            System.out.println(second);
        }

    }
}