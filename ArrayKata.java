public class ArrayKata {

	public static int maximumIn(int[] arrayOfIntegers) { 
		int max = -2_000_000_000;
		
		for(int counter = 0; counter < arrayOfIntegers.length; counter++) {
			if (arrayOfIntegers[counter] > max)
				 max = arrayOfIntegers[counter] ;
		}
	return max;
	}

	public static int minimumIn(int[] arrayOfIntegers) {
		int min = 2_000_000_000;
		for(int counter = 0; counter < arrayOfIntegers.length; counter++) {
			if (arrayOfIntegers[counter] < min)
				 min = arrayOfIntegers[counter] ;
		}
		return min;
	}

	public static int sumOf(int[] arrayOfIntegers) { 
		int sum = 0;
		for(int counter = 0; counter < arrayOfIntegers.length; counter++) {
			sum = sum + arrayOfIntegers[counter];
		}
		return sum;
	}

	public static int sumOfEven(int[] arrayOfIntegers) { 
		int sumOfEven = 0;
		int evenCounter = 0;
		for(int counter = 0; counter < arrayOfIntegers.length; counter++) {
			int[] myEven = new int[evenNumbersInCount(arrayOfIntegers)];
			if (arrayOfIntegers[counter] % 2 == 0) {
				myEven[evenCounter] = arrayOfIntegers[counter];
				sumOfEven = sumOfEven + myEven[evenCounter];
				evenCounter++;
			}

		}
		return sumOfEven;
	}

	public static int sumOfOdd(int[] arrayOfIntegers) { 
		int sumOfOdd = 0;
		int oddCounter = 0;
		for(int counter = 0; counter < arrayOfIntegers.length; counter++) {
			int[] myOdd = new int[noOfOddNumbersIn(arrayOfIntegers)];
			if (arrayOfIntegers[counter] % 2 != 0) {
				myOdd[oddCounter] = arrayOfIntegers[counter];
				sumOfOdd = sumOfOdd + myOdd[oddCounter];
				oddCounter++;
			}

		}
		return sumOfOdd;
	}



	public static int[] maximumandMinimumof (int[] arrayOfIntegers) {
		int max = -2_000_000_000;
		int min = 2_000_000_000;

		for(int counter = 0; counter < arrayOfIntegers.length; counter++) {
			if (arrayOfIntegers[counter] > max)
				 max = arrayOfIntegers[counter] ;

			if (arrayOfIntegers[counter] < min)
				 min = arrayOfIntegers[counter] ;


		}
	
		return new int[]{max, min};
	}


	public static int evenNumbersInCount(int[] arrayOfIntegers) {
		int evenCounter = 0;
		for(int counter = 0; counter < arrayOfIntegers.length; counter++) {
			if (arrayOfIntegers[counter] % 2 == 0)
				evenCounter++;
		}
		return evenCounter;
	}


	

	public static int[] evenNumbersIn(int[] arrayOfIntegers) {
		int[] even = new int[evenNumbersInCount(arrayOfIntegers)];
		int evenCounter = 0;
		for(int counter = 0; counter < arrayOfIntegers.length; counter++) {
			if (arrayOfIntegers[counter] % 2 == 0) {
				even[evenCounter] = arrayOfIntegers[counter];
				evenCounter++;
			}
		}
		return even;
	}
		 

	public static int noOfOddNumbersIn(int[] arrayOfIntegers) {
		
		int oddCounter = 0;
		for(int counter = 0; counter < arrayOfIntegers.length;  counter++) {
			if(arrayOfIntegers[counter] % 2 != 0) {
				oddCounter++;
			}
		}
		return oddCounter;
	}

	public static int[] oddNumbersIn(int[] arrayOfIntegers) {
		int oddCount = 0;
		int[] oddNumbers = new int[noOfOddNumbersIn(arrayOfIntegers)];
		for(int count = 0; count < arrayOfIntegers.length; count++) {
			if(arrayOfIntegers[count] % 2 != 0){
				oddNumbers[oddCount] = arrayOfIntegers[count];
				oddCount++;
			}
		}
		return oddNumbers;
	}

	public static int noOfSquareInArray(int[] arrayOfIntegers) {
		int squareNoCount = 0;
		double myDouble = 0;
		for(int count = 0; count < arrayOfIntegers.length; count++) {
			myDouble = Math.sqrt(arrayOfIntegers[count]);
			if(myDouble == (int)myDouble)
				squareNoCount++;
		}
	return squareNoCount;
	}

	public static int[] squareNumbersIn(int[] arrayOfIntegers) {
		int squareNoCount = 0;
		int[] squareNos = new int[noOfSquareInArray(arrayOfIntegers)];
		for(int count = 0; count < arrayOfIntegers.length; count++) {
			double myDouble = Math.sqrt(arrayOfIntegers[count]);
			if(myDouble == (int)myDouble){
				squareNos[squareNoCount] = arrayOfIntegers[count];
				squareNoCount++;
			}
		}
		return squareNos;
	}















}