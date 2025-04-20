public class ExponentialTable {
public static void main(String[] args){


	int counter ;
	int counter2 = 2;
		
		System.out.println("a     b     pow(a, b)");

for(counter = 1; counter <=5; counter++){
	double exponent = Math.pow(counter, counter2);
	int result = (int) exponent;
		
		System.out.printf("%d     %d     %d%n", counter, counter2, result);
		
			counter2++;



}













}
}