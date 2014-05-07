import java.util.Scanner;
import java.util.Random;

public class GuessBooleanWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	Scanner input = new Scanner(System.in);		
	
	int game = 0 + (int) (Math.random() * 10);
	
    boolean jorgeWin;    
    boolean luisWin;
    boolean catalan;
    
    //jorgeWin = true;
    //luisWin = true;
    //catalan = true;
    
    int count = 1; 
    while (count < 4)     
    {    
    	
		System.out.printf("Welcome to the guess a number game, please type in a number between 0 and 10 \n");	
		
		int user = input.nextInt();
		
		jorgeWin = user == game;
		luisWin =  user < game;
		catalan = user > game;		
		
		if (jorgeWin)
		{
			System.out.printf("Congratulations, the number %d is the correct choice. You have won the game.\n\n", user);
		}
		else if (luisWin)
		{
			System.out.printf("Sorry but the number %d is too low, the correct number is %d, please try again by restarting program\n\n", user , game);
		}
		else if (catalan)
		{
			System.out.printf("Sorry but the number %d is too high, the correct number is %d, please try again by restarting program\n\n", user , game);	
		}	
		
		count++; 		
    }
  }
}









