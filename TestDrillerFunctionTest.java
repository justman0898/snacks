import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.math.BigInteger;

public class TestDrillerFunction {

	public static BigInteger getTotalCost(int noOfCopies){
		BigInteger bigNoOfCopies = BigInteger.valueOf(noOfCopies);
		BigInteger pricePerCopy = null;
		BigInteger totalAmount = null ;
		
		
		if(noOfCopies >= 1 && noOfCopies <= 4) {
			pricePerCopy = BigInteger.valueOf(2_000);
			totalAmount = bigNoOfCopies.multiply(pricePerCopy);
		}
		else if(noOfCopies <= 9) {
			pricePerCopy = BigInteger.valueOf(1_800);
			totalAmount = bigNoOfCopies.multiply(pricePerCopy);
		}
		else if(noOfCopies <= 29) {
			pricePerCopy = BigInteger.valueOf(1_600);
			totalAmount = bigNoOfCopies.multiply(pricePerCopy);
		}
		else if(noOfCopies <= 49) {
			pricePerCopy = BigInteger.valueOf(1_500);
			totalAmount = bigNoOfCopies.multiply(pricePerCopy);
		}
		else if(noOfCopies <= 99) {
			pricePerCopy = BigInteger.valueOf(1_300);
			totalAmount = bigNoOfCopies.multiply(pricePerCopy);
		}
		else if(noOfCopies <= 199) {
			pricePerCopy = BigInteger.valueOf(1_200);
			totalAmount = bigNoOfCopies.multiply(pricePerCopy);
		}
		else if(noOfCopies <= 499) {
			pricePerCopy = BigInteger.valueOf(1_100);
			totalAmount = bigNoOfCopies.multiply(pricePerCopy);
		}
		else if(noOfCopies > 500) {
			pricePerCopy = BigInteger.valueOf(1_000);
			totalAmount = bigNoOfCopies.multiply(pricePerCopy);
		}		
		
		return totalAmount;
	}
}

public class TestDrillerFunctionTest{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter an integer: ");
		int userInput = input.nextInt();
		BigInteger totalCost = TestDrillerFunction.getTotalCost(userInput);
		Locale nigeria = Locale.of("en", "NG");
		NumberFormat formatter = NumberFormat.getNumberInstance(nigeria);
		String formattedAmount = formatter.format(totalCost);
		
		System.out.println("N" + formattedAmount);


	}
}
