import java.util.Scanner;
import java.util.Random;

public class WorkFour {
 public static void main(String[] args){

   Scanner prompt = new Scanner(System.in); 
   Random random1 = new Random(); 
	
	int computersChoice = 5;
        
		System.out.print("Guess my number from 1 to 10 (You have 3 attempts): ");
		 int usersGuess = prompt.nextInt();

for(int counter = 1; counter <= 3; counter ++){
	
	if(usersGuess == computersChoice) {
		System.out.println("Correct Guess!");
		   break; }else if (usersGuess < computersChoice) {
			       System.out.println("Too low, Try again");
				 System.out.print("Guess my number from 1 to 10 : ");
			            usersGuess = prompt.nextInt(); }
			   
	
			   else { System.out.println("Too high, Try again");  
				System.out.print("Guess my number from 1 to 10 : ");
		                    usersGuess = prompt.nextInt(); }

			  


}



// random1.next(11) + 1;









}

}