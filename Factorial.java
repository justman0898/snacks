import java.util.Scanner;
public class Factorial{
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number to find the factorial: ");
			int number = scanner.nextInt();

		if (number < 0){
			System.out.println("Factorial of negative numbers are undefined");
}else{
int counter = 1; 
long factorial = 1;
while (counter <= number){
factorial = factorial * counter; 
counter++;
}
System.out.printf("%nThe factorial of the number is %d", factorial );

}





}


}