import java.util.Scanner;
public class DiamondRedone
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("how long do you like it?\t:");
        int sideLength = in.nextInt();
        int stars;
        int spaces;
        int maxLength;
        
        //calculator:
        
        maxLength = (sideLength*2)-1;
        spaces = ((maxLength+1)/2)-1;
        stars = 1;
        
        
        for(int i=0;
            i <= sideLength;
            i++)
        {
            
            //star printer:
            
            for(i=0;
                i <= stars;
                i++)
            {
                System.out.print("*");
            }
            if (stars != maxLength) 
            {   
                stars++;
            }
            else if(stars != 0) //When the number of stars are at the max lenth:
            {
                stars--;
            }
            //space printer:
            
            for(i = 0;
                i <= spaces;
                i++)
            {
               System.out.print(" "); 
            }
            if(stars != maxLength)
            {
                spaces--;
            }
            else if(stars != 0) //When the number of stars are at the max lenth:
            {
                spaces++;
            }
        }
        
    }
}

// Five side length:
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

//Four side length:
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *

