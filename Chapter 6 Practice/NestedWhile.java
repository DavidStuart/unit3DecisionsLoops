
public class NestedWhile
{
    public static void main(String[] args)
    {
        int outer = 0;
        int inner = 0;
        while(outer<8)
        {
            outer+=1;
            inner +=1;
            if (outer<=4)
            {
                System.out.print(1);
            }
            else if (outer<=8)
            {
                System.out.print(2);
            }
            if (inner >4)
            {
                inner = 1;
            }
           // inner +=1;
            if (inner <=4)
            {
                System.out.println(inner);
            }
        }        
    }
    
}