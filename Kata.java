
public class Kata{

//	public static int maxNumber(int numberOne, int numberTwo){
//	if (numberOne > numberTwo){
//			return numberOne;
//		}
//		else {
//
//			return numberTwo;
//		}
//		
//	}
//

//	public static boolean isEven (int number){
//	if (number % 2 == 0){
//		return true;	
//	}else{
//		return false;
//	}
//	
//	
//	}
//
//
//	public static boolean isPrime(int number){
//	if (number < 2){
//		return false;
//	}else{
//		for (int count = 2; count < number; count++){
//		if (number % count ==0){
//			return false;
//			}
//		}
//	
//			return true;
//	
//	}
//	}
//		public static int subtraction (int numberOne, int numberTwo){
//			if (numberOne > numberTwo){
//				return numberOne - numberTwo;
//			}else{
//				return numberTwo - numberOne;
//			}
// 
//		}

//	public static float didvision(float numberOne, float numberTwo){
//	if (numberTwo == 0){
//		return numberTwo;
//	}else{
//		return numberOne / numberTwo;
//	}
//	
//	}

//		public static int factorOfNumber(int number){
//		 
//		int count = 0;
//		 for (int index = 1; index <= number; index++){
//		 	if (number % index == 0){
//		 	count++;
//			} 
//		 }
//		 return count;
//		 }
		
//		public static boolean isPerfectSquare(int number){
//		
//			 if(Math.sqrt(number) % 1 == 0){
//				 return true;
//			}
//			 else{
//				return false;
//		}
//		
//	}


//	public static boolean isPalindrome(int number){
//		int original = number;
//		int reverse = 0;
//		while(number != 0){
//			int lastDigit = number % 10;
//			reverse = (reverse * 10) + lastDigit;
//			number /= 10;
//		}
//		if(reverse == original){
//			return true;
//		}
//		else{
//			return false;
//		}
//	}


//	public static long factorialNumber(int number){
//		int factorial = 1;
//		
//	for(int count = 1; count <= number; count++){
//		factorial = factorial * count;
//	}
//		return factorial; 
//	}

	public static long squareOf(int number){
		int result = number * number;
		return result;
	}


	public static void main(String[] args){
	
		System.out.println(squareOf(10));
	}


}
