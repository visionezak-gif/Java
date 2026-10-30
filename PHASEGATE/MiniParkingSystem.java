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
	
	
	if(slot < 1 || slot > 20){
	System.out.println("Invalid parking slot. try again.");
	System.out.println();
	continue;
	}
	
	System.out.println();
	if (slots[slot-1] ==1){
	System.out.println("This slot has already been taken, choose another one");
	System.out.println();
	continue;
	}
	
	slots[slot - 1] = 1;
	
	
	System.out.println(Arrays.toString(slots));
	System.out.println();
	
	System.out.println("You have successfully choose your spot at slot " + slot);
	System.out.println();
	
	
	System.out.println("Available slots " + showAvailableSlots(slots));
	System.out.println();
	
	
	System.out.println("Taken slots are " + slotTaken(slots));
	System.out.println();
	}
  }


	public static int []getASlot(int [] slots){
	
		for(int slot = 0; slot < slots.length; slot++){
	
	}
		return slots;
	
	}


	public static int showAvailableSlots(int[] slots){
	
	int count =  0;
	
	for (int slot = 0; slot < slots.length; slot++){
	
	  if(slots[slot] ==0){
	  count++;
	  }
	}
	
		return count;
	}


	public static int slotTaken(int[] slots){
	
	int count = 0;
	
	for (int slot = 0; slot < slots.length; slot++){
	
		if(slots[slot] == 1){
		count++;
		}
	  }
	
		  return count;
	}
	
	

}

