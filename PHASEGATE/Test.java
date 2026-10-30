import java.util.*;
public class StudentsGrade{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number 0f students: ");
	int student = input.nextInt();
	
	
	System.out.print("Enter number of subject: ");
	int subject = input.nextInt();

	
	System.out.println("Student scores ");
	
	int [][] numberOfStudents = new int [student][subject];
	System.out.print("Enter student scores ");
	
	for (int vision = 0; vision < student; vision++){
	System.out.println("Student " + vision + 1);
	System.out.println();
	
	}
	
	for (int index = 0; index <= subject; index++){
		System.out.print("Enter scores of subject: ");
		int scores = input.nextInt();
		
		}
	
	
	
	
	
	int [][] result = numberOfStudents(student, subject);
	
		System.out.println(Arrays.deepToString(result));
		
		
		
}		
	public static int [][] numberOfStudents(int student, int subject){
	Scanner input = new Scanner(System.in);
	
	
//		int [][] scores = new int[][];
		for (int index = 0; index <= subject; index++){
		}
		
		return scores;
	}


}
