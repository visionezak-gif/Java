import java.util.Scanner;
public class ContactManagementSystem{

	public static void main(String[] args){
	
	
	String[][] contacts = new String[3][3];
	
	contacts[0][0] = "Ada Okafor";
	contacts[0][1] = "08031234567";
	contacts[0][2] = "ada@example.com";
	
	
	contacts[1][0] = "Chidi Eze";
	contacts[1][1] = "08059876543";
	contacts[1][2] = "chidi@example.com";
	
	
	
	contacts[2][0] = "Amaka Bello";
	contacts[2][1] = "08123456789";
	contacts[2][2] = "amaka@example.com";


	
	
String managementmenu = """
=========================================
       CONTACT MANAGEMENT
=========================================
""";
System.out.println(managementmenu);

for (int rows = 0; rows < contacts.length; rows++){
	
		System.out.println((rows + 1) +". "+ contacts[rows][0]);
		
		
	  }
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Select contact number to view details: ");
	  
	  int selectedOption = input.nextInt();
	  
	  String design = """
-----------------------------------------
        CONTACT DETAILS
-----------------------------------------
""";

System.out.println(design);

	
	
		switch(selectedOption){
		case 1: System.out.println();
		
	String selectedOptionList = """
Name: Ada Okafor 
	
Phone: 08031234567
 
Email: ada@example.com
----------------------------------------
""";
System.out.println(selectedOptionList);
break;


	

		case 2: System.out.println();

		String secondOptionList = """
		
Name: Chidi Eze

Phone: 08059876543

Email: chidi@example.com
-----------------------------------------
""";

System.out.println(secondOptionList);
break;




		case 3: System.out.println();
		String thirdOptionList = """
Name: Amaka Bello

Phone: 08123456789

Email: amaka@example.com
------------------------------------------ 
""";
System.out.println(thirdOptionList);

	}

		



	
	
	}

}
