import java.util.*;
public class StudentsGrade{

	public static void main(String[] args){
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your student number: ");
	 int student = input.nextInt();
	 
	 
	 System.out.print("Enter number of your students subject: ");
	 int subject = input.nextInt();
	
	
	System.out.print("student scores");
	
	int [][] studentScores = new int[student][subject];
	System.out.println("Enter student scores");
	
	
	for(int index = 0; index < student; index++){

	System.out.println("Student " + (index + 1));
	
	
	for(int count = 0; count < subject; count++){
	
	System.out.print("Enter subject score: ");
	int scores = input.nextInt();
	
	studentScores[index][count] = scores;
	
	
	}
	
	
	
	}


   }



}
