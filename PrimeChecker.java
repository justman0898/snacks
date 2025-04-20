import java.util.Scanner; 
public class PrimeChecker {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");

int number = scanner.nextInt(); 
boolean isPrime = true ; 

if (number <= 1) {
isPrime = false ; 
}else {
int i = 2 ; 
while (i <= number / 2 ){
if (number % i == 0){
isPrime = false ;
break; 

}
i = i + 1 ; 

}

}

if (isPrime) {
System.out.println("This number is a prime number");
}else{
System.out.println();
System.out.println("This number is not a prime number");
}





}
}