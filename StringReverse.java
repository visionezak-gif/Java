import java.util.Scanner;
public class StringReverse{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		word = word.toLowerCase();
		
		String reverse = " ";
		
		String duplicate = " ";
		
		int counter = 0;
		
		char []vowels = {'a', 'e','i', 'o' ,'u'};
		
		for (int index = word.length() -1; index >=0; index--){
		
			for(int count = 0; count < vowels.length; count++){
			
				if(word.charAt(index) == vowels[count])counter++;
				

			}
			reverse = reverse + word.charAt(index);
			
		}
		
		
		
		System.out.println("The reverse is = " + reverse);
		
		System.out.println("The total count of vowel is = " + counter);
		
		
		for(int index = 0; index <word.length(); index++){
			for(int count = index + 1; count < word.length(); count++){
			
			if(word.charAt(index) == word.charAt(count)){
			
			if (duplicate.indexOf(word.charAt(index)) == -1){
				duplicate = duplicate + word.charAt(index);
			
				}
			   }
			
			}
			

	
		}
		
		System.out.println("The duplicate caracter is: " + duplicate);
		


	}

}
