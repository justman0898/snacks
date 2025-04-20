
import java.util.Scanner;
public class Largest {
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

		int smallest = 2_147_483_647; // Assign smallest the largest possible value an int can hold
		int largest = -2_147_483_648; // // Assign largest the smallest possible value an int can hold

		int userInput;

		   System.out.println("Enter List of numbers you want to compare (press -1 to quit); ");

while(true) {
		
			 userInput = scanner.nextInt();
	
		
		     if (userInput == -1)
			break; // sentinel value

		     else if (userInput != -1) {

		     if (userInput > largest)  
			 largest = userInput;
		     
		     if (userInput < smallest)  
			 smallest = userInput;
		}
		     

}
		System.out.println();
		System.out.printf("The largest number is %d and the smallest number is %d", largest, smallest);












}
}