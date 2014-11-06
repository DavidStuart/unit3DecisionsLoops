import java.lang.Math;
import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      double distance = Math.sqrt(Math.pow(xcenter1-xcenter2,2)+Math.pow(ycenter1-ycenter2,2)); 

      //find smae horiz
      if (ycenter1 == ycenter2)
      {
          System.out.println("The circles are on the same horiz line, yo");
          if ((xcenter1 == ycenter1)&&(radius2 == radius1))
          {
              System.out.println("they be the same circle");
          }
      }
      
      else
      {
          System.out.println("Not same horiz line, dawg");
          System.out.println("Also not mutally contained");
      }
     
      
      //find if they are touching
      
      if (distance < (radius1+ radius2))
        {
          System.out.println("get outa my zone");
        }
        else if (distance > (radius1 + radius2))
        {
            System.out.println("not touching");
        }
        else
        {
            System.out.println("they are touching");
        }
    }
}