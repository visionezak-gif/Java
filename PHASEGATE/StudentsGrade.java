import java.util.*;
public class StudentsGrade{

	public static void main(String[] args){
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your student number: ");
	 int student = input.nextInt();
	 
	 
	 System.out.print("Enter number of your students subject: ");
	 int subject = input.nextInt();
	
	
//	System.out.print("student scores");
//	
	
	
	
	
	int [][] studentScores = new int[student][subject];
	System.out.println("Enter student scores");
	
	collectScores(studentScores, student, subject);
	
	}
	
	public static void collectScores(int [][]studentScores, int student, int subject){
	
	Scanner input = new Scanner(System.in);
	
	for(int index = 0; index < student; index++){

	System.out.println("Student " + (index + 1));
	
	
	for(int count = 0; count < subject; count++){
	
	System.out.print("Enter subject" + (count + 1) + " score: ");
	int scores = input.nextInt();
	
	studentScores[index][count] = scores;
	
	
	
	int result = collectTotal(studentScores, student);
	
	System.out.println("Total score is " + result);
	
	}
	
	
	
	}


   }
   
   public static int collectTotal(int [][]studentScores, int students){
   
   int total = 0;
   
   for (int index = 0; index < studentScores[students].length; index++){
   
      total += studentScores[students][index];
   }
   
   return total;
   
   
   
   
   
   
   
   
   }



}
