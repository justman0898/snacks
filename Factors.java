import java.util.Scanner;
public class Factors {
public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

    int counter;

	System.out.print("Enter a number: ");
		int userInput = scanner.nextInt();

    
for ( ; userInput <= 0; ) {
	System.out.print("Enter a non-negative whole number: ");
		userInput = scanner.nextInt();

  }
	      
for (counter = 1; counter <= userInput; counter++) {

	
	 if (userInput > 0) {
		if (userInput % counter == 0) {
			System.out.println(counter);
							   
		}
		
	}



  }













}
}