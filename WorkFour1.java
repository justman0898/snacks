import java.util.Scanner;
import java.util.Random;

public class WorkFour1 {
 public static void main(String[] args){

   Scanner prompt = new Scanner(System.in); 
   Random random1 = new Random(); 
	
	int computersChoice = random1.nextInt(10) + 1;
            
for(int counter = 1; counter <= 3; counter ++){
	System.out.printf("Guess my number from 1 to 10 (Attempt %d ): ", counter);
		 int usersGuess = prompt.nextInt();

	if (usersGuess == computersChoice){
		 System.out.println("Correct Guess");
			break; 
           } else if (counter == 3) System.out.printf("Game over, CPU's guess was %d", computersChoice); 

	     else if (usersGuess < computersChoice) System.out.println("Too low, Try again");

	     else if (usersGuess > computersChoice) System.out.println("Too low, Try again");

	     



}













}

}