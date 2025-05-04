public class Kata{
	
	public static boolean isEven(int integer) {
		if(integer % 2 == 0) 
		  return true;
		else 
		  return false;
        
        }

	public static boolean isPrime(int integer) {
			
		/*boolean isPrime;
		int primeCheck = 0;
		isPrime = true;
		for(int count = 2; count <= integer / 2; count++ ){
			if ( (integer == 0) || (integer == 1) ) {
			   isPrime = false;
			   break;
			}
			
			else if (integer % count == 0) { 
			   isPrime = false;
			   break;
			}

		if (isPrime)
		    return true;
		else
		    return false;   */
		// Alternative method

		int primeCheck = 0;
		int primeCount = 0;

	
		for (primeCheck = 1; primeCheck <= integer; primeCheck++) { 
			if (integer % primeCheck == 0)
				primeCount++;

			}
				
		if(primeCount == 2) 
		   return true;
		else
		   return false;
			
	}


	public static int AbsoluteSub(int integer, int integer2){ 
		int total ;
		int absoluteValue = 0;
		
		total = integer - integer2;
		if (total < 0) 
		  absoluteValue = - total ;

		return absoluteValue;
	}

	public static float div(int integer, int integer2) {
		int division = 0;
		
		
		if(integer2 == 0) {
		   return 0;
		}else {
		  division = integer / integer2;
		  return division;
		}
	}



	public static int factors(int integer) {  
		int facCheck;
		int noFactors = 0;

		for (facCheck = 1; facCheck <= integer; facCheck++) { 
			if (integer % facCheck == 0)
				noFactors++;
		}
		
		return noFactors;
	}
	
	public static long factorial(int integer){ 
		long factorial = 1;
		int count;
		
		for(count = 1; count<= integer; count++){
			factorial = factorial * count;
		}
		return factorial;
	}

	public static long sqr(int integer) {
		long sqr = integer * integer;
		return sqr;
	}


	public static boolean sqrNumber(int integer) {
		double myDouble = Math.sqrt(integer);
		
		if (myDouble == (int) myDouble)
			return true;
		else 
			return false;

	}

	public static boolean palindrome(int integer) { 
		int original = integer;
		int number = original;
		int reversed = 0;
		while(number != 0) { 
			int digits = number % 10;
			reversed = reversed * 10 + digits;
			number = number / 10;

		}

		if (original == reversed)
			return true;
		else 
			return false;
	}



}