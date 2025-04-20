import java.util.Scanner;
import java.util.Random;

public class WorkFour2 {
 public static void main(String[] args){

   Scanner prompt = new Scanner(System.in); 
   Random random1 = new Random(); 
	
	int computersChoice = random1.nextInt(10) + 1;

for(int counter = 1; counter > 0; counter ++){
	System.out.printf("Guess my number from 1 to 10 (Attempt %d ): ", counter);
		 int usersGuess = prompt.nextInt();

	if (usersGuess == computersChoice) { System.out.printf("Correct Guess. Computers Guess was %d", computersChoice);
        	break; }

	if (usersGuess < computersChoice && counter > 0) System.out.println ("Too low, Try again");
 
        if (usersGuess > computersChoice && counter > 0) System.out.println ("Too high, Try again");



}






}
}