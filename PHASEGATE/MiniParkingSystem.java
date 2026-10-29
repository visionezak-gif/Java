import java.util.*;
public class MiniParkingSystem{


	public static void main(String[] args){
	
	
	
	String formart = """
=====================================================
	  WELCOME TO EZAK AND SONS PARKING SLOT
=====================================================
FEEL FREE TO CHOOSE A SPOT FOR YOURSELF.

""";

	System.out.print(formart);
	

	
	int [] slots = new int[20];
	
	for(int slot = 0; slot < slots.length; slot++){
		
	}

	System.out.println();
	
	Scanner input = new Scanner(System.in);
	
	int [] result = getASlot(slots);
	System.out.println(Arrays.toString(result));
	System.out.println();
	
	while(true){
	System.out.print("choose a parking slot from 1 - 20: ");
	int slot = input.nextInt();
	
	System.out.println();
	slots[slot - 1] = 1;
	
	
	System.out.println(Arrays.toString(slots));
	System.out.println();
	
	System.out.println("You have successfully choose your spot at slot " + slot);
	System.out.println();
	if(slot <= 0){
		break;
	}
	
	}
  }


	public static int []getASlot(int [] slots){
	
		for(int slot = 0; slot < slots.length; slot++){
	
	}
		return slots;
	
	}



}

