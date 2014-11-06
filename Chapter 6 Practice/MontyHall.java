import java.util.Random;
public class MontyHall
{
    public static void main()
    {
        Random generator = new Random();
        int prize;
        int strat1 = 0;
        int strat2 = 0;
        int playerPick;
        int reveal;
        int switchPick;
        for (int i=1; i<=1000000000; i++)
        {
            System.out.print("attempt #:" + i);
            prize = generator.nextInt(4)+1;
            playerPick = generator.nextInt(4)+1;
            do
            {
                reveal = generator.nextInt(4)+1;
            }while((reveal == playerPick) && (reveal == prize));
            do
            {
                switchPick = generator.nextInt(4)+1;
            }while((switchPick == playerPick) && (switchPick == reveal));
            if (playerPick == prize)
            {
                strat1 +=1;
                System.out.println(" lame win");
            }
            
            else if (switchPick == prize)
            {
                strat2+=1;
                System.out.println(" switch wins");
            }
            else
            {
               System.out.println(" everyone looses"); 
            }
          
           
        }
        System.out.println("the lame way won " + strat2 + " times");
        System.out.println("the cool way won " + strat1 + " times");
        
    }

}
