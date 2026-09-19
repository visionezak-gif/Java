import java.util.Scanner;
public class NokiaApplication{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		String mainMenu = """

================Menu functions=================
Press

1. Phone book
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Music
9. Games
10. Calculator
11. Reminders
12. Clock
13. Profiles
14. Service
15. SIM service
""";

		System.out.println(mainMenu);
		int mainMenuChoice = input.nextInt();
		
		switch(mainMenuChoice){
			case 1: System.out.println("Phone book");
				String phoneBookMenu ="""
  
1. Search
2. Service Nos
3. Add name
4. Erase
5. Edit
6. Copy
7. Assign tone
8. Send b'card
9. Options
10. Speed dails
11. Voice tags
""";
		
				System.out.println(phoneBookMenu);
				int phoneBookMenuChoice = input.nextInt();
				
				switch(phoneBookMenuChoice){
					case 1: System.out.println("Search");break;
					case 2: System.out.println("Service Nos");break;
					case 3: System.out.println("Add name");break;
					case 4: System.out.println("Erase ");break;
					case 5: System.out.println("Edit"); break;
					case 6: System.out.println("Copy");break;
					case 7: System.out.println("Assign tone");break;
					case 8: System.out.println("Send b'card");break;	
					case 9: System.out.println("Options");
						String optionMenu ="""
				
1. Memory in use
2. Type of View
3. Memory status
""";

						System.out.println(optionMenu);
						int optionMenuChoice = input.nextInt();
				
						switch(optionMenuChoice){
							case 1: System.out.println("Memory in use");break;
							case 2: System.out.println("Type of view");break;
							case 3: System.out.println("Memory status");break;
							default: System.out.println("Invalid input");break;
						}
						break;
					case 10: System.out.println("Speed dails");break;
					case 11: System.out.println("Voice tags");break;
				      default: System.out.println("invalid operation");break;
		
				}
				 
				break;
			case 2: {System.out.println("Messages");
				String messageMenu = """
				
1. Write message
2. Inbox
3. Outbox
4. Picture Messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox number
10. Service command editor
""";				
			
	     System.out.println(messageMenu);
	     int messageMenuChoice = input.nextInt();
					   
	     switch(messageMenuChoice){
				     case 1: System.out.println("Write message"); break;
				     case 2: System.out.println("Inbox"); break;
				     case 3: System.out.println("Outbox"); break;
				     case 4: System.out.println("Picture message"); break;
				     case 5: System.out.println("Templates"); break;
				     case 6: System.out.println("Smileys"); break;
				     case 7: {System.out.println("message settings"); 
					      String messageSettingsMenu = """
					          	   
1. Set 1
2. Common 
""";
                                    System.out.println(messageSettingsMenu);
                                    int messageSettingMenuChoice = input.nextInt();
                                    
                                    switch(messageSettingMenuChoice){
                                          case 1: {System.out.println("Set 1");
                                          	String set1Menu = """
1. Message centre number
2. Message sent as
3. Message validity
"""; 
                                         		System.out.println(set1Menu);
                                         		int set1MenuChoice = input.nextInt();
                                         		
                                         		switch(set1MenuChoice){
                                         		       case 1: System.out.println("Message centre number"); break;
                                         		       case 2: System.out.println("Message sent as"); break;
                                         		       case 3: System.out.println("Message validity"); break;
  									 default: System.out.println("invalid input"); break;
 									 }
								          }
                                          	          break;
                                                    case 2: {System.out.println("Common");
                                                           String commonMenu = """
1. Delivery reports
2. Reply via same centre
3. Character support
""";
								System.out.println(commonMenu);
								int commonMenuChoice = input.nextInt();
								
								switch(commonMenuChoice){
								      case 1: System.out.println("Delivery reports"); break;
								      case 2: System.out.println("reply via same centre"); break;
								      case 3: System.out.println("Character support"); break;
								      }
								      
                        					  
                        					  }
                        					  
                        					  }
                        					  break;
                        					  }
                        					  
					                          
				     case 8: System.out.println("Info service"); break;
				     case 9: System.out.println("Voice mailbox number"); break;
				     case 10: System.out.println("Service command editor"); break;
				     default: System.out.println("invalid input"); break;          
					   
					   
					   }
					   break;
				}
			
			case 3: System.out.println("Chat"); break;
			case 4: System.out.println("Call register");
				String callRegisterMenu = """
1. Missed calls
2. Recieved calls
3. Dailled numbers
4. Erase recent calls
5. Show call duration
6. Show call cost
7. Call cost settings
8. Prepaid credit 
""";
				System.out.println(callRegisterMenu);
				int callRegisterMenuChoice = input.nextInt();
				
				switch(callRegisterMenuChoice){
				  	case 1: System.out.println("Missed calls"); break;
				  	case 2: System.out.println("Recieved calls"); break;
				  	case 3: System.out.println("Dailled number"); break;
				  	case 4: System.out.println("Erase recent calls");break;
				  	case 5: System.out.println("Show call duration"); 
				  		String showCallDurationMenu = """
1. Last call duration
2. All calls' duration
3. Recieved calls' duration
4. Dailled calls' duration
5. Clear timers
""";
						System.out.println(showCallDurationMenu);
						int showCallDurationMenuMenuChoice = input.nextInt();
						
						switch(callRegisterMenuChoice){
							case 1: System.out.println("Last calls' duration"); break;
							case 2: System.out.println("All calls' duration"); break;
							case 3: System.out.println("Recieved calls' duration"); break;
							case 4: System.out.println("Dailled calls' duration"); break;
							case 5: System.out.println("Clear timers"); break;
							default: System.out.println("Invalid input");
						
						}				  	

				  		break;
				  	case 6: System.out.println("Show call cost");
				  	       String showCallCostMenu = """
1.Last calls' cost
2. All calls' cost
3. Clear counters
""";				  	       
						System.out.println(showCallCostMenu);
						int showCallCostMenuChoice = input.nextInt();
						
						switch(showCallCostMenuChoice){
							case 1: System.out.println("Last calls' cost"); break;
							case 2: System.out.println("All calls' cost"); break;
							case 3: System.out.println("Clear counters"); break;
							default: System.out.println("Invalid input");

						}	  	

				  	      break;
				  	case 7: System.out.println("Call cost settings");
				  		String callCostSettings = """
1. Call cost limit
2. Show coat in				  		
""";				  		
						System.out.println(callCostSettings);
						int callCostSettingsChoice = input.nextInt();
						
						switch( callCostSettingsChoice){
							case 1: System.out.println("Call cost limit"); break;
							case 2: System.out.println("Show coat in	"); break;
							default: System.out.println("Invalid input");
				  		 }			
				  		 break;
				  	case 8: System.out.println("Prepaid credit"); break;
				  	
				
				
				}
				

			     break;
			case 5: System.out.println("Tones");
				String tones = """
1. Ringing tone
2. Ringing volume
3. Incoming alert
4. Message alert tone
5. Keypad tones
6. Warning K tones
7. Vibrating alert
8. Screen saver			
""";				
				System.out.println(tones);
				int toneChoice = input.nextInt();
				
				switch(toneChoice){
					case 1: System.out.println("Ringing tone"); break;
					case 2: System.out.println("Ringing volume"); break;
					case 3: System.out.println("Incoming alert"); break;
					case 4: System.out.println("Message alert tone"); break;
					case 5: System.out.println("Keypad tones"); break;
					case 6: System.out.println("Warning K tones"); break;
					case 7: System.out.println("Vibrating alert"); break;
					case 8: System.out.println("Screen saver"); break;
					default: System.out.println("invalid input"); break;
				}
			
			      break;
			case 6: {System.out.println("Settings");
				String settings = """
1. Call settings
2. Phone settings
3. Security settings
4. Restor factory settings				
""";
			  System.out.println(settings );
			  int settingsChoice = input.nextInt();
			  
			  switch(settingsChoice){
			  	  case 1: System.out.println("Call settings");
			  	        String callSettings = """
1. Call settings			  	        
""";		
	  	    			System.out.println(callSettings);
	  	    			int callSettingsChoice = input.nextInt();
	  	    			
	  	    			switch(callSettingsChoice ){
	  	    				case 1: System.out.println("Call settings"); 
	  	    					String callSettingsMenu = """
1. Automatic redial
2. Speed dailling
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer	  	    					
""";	  	    					
	  	    					System.out.println(callSettingsMenu);
	  	    					int callSettingsMenuChoice = input.nextInt();
	  	    					
	  	    					switch(callSettingsMenuChoice){
	  	    						case 1: System.out.println("Automatic redial");break;
	  	    						case 2: System.out.println("Speed dailling"); break;
	  	    						case 3: System.out.println("Call waiting options"); break;
	  	    						case 4: System.out.println("Own number sending"); break;
	  	    						case 5: System.out.println("Phone line in use"); break;
	  	    						case 6: System.out.println("Automatic answer"); break;
	  	    						default: System.out.println("invalid input"); break;
	  	    					
	  	    					
	  	    					}		
	  	    			       
	  	    			   }  
			  	  
			  	       
			  	  	   break;
			  	  case 2: System.out.println("Phone settings");
			  	  	   String phoneSettings = """
			  	  
1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Confirm SIM service action	  	    							
""";	  	    							
	  	    					 			
	  	    				System.out.println(phoneSettings);
	  	    				int PhoneSettingsMenu = input.nextInt();
	  	    						
	  	    				switch(PhoneSettingsMenu){
	  	    					case 1: System.out.println("Language"); break;
	  	    					case 2: System.out.println("Cell info display"); break;
	  	    					case 3: System.out.println("Welcome note"); break;
	  	    					case 4: System.out.println("Network selection"); break;
	  	    					case 5: System.out.println("Confirm SIM service action"); break;
							default: System.out.println("invalid input"); break;
	  	    			    }			  	  	    

			  	          break;
			  	  case 3: System.out.println("Security settings");
			  	          String securitySettings = """
1. PIN code request
2. Call barring service
3. Fixed dailling
4. Closed up group
5. Security level
6. Change acces codes			  	          
""";			  	          
			  	  
			               System.out.println(securitySettings);
			               int securitySettingsChoice = input.nextInt();
			               
			               switch(securitySettingsChoice){
			                     case 1: System.out.println("PIN code request"); break;
			                     case 2: System.out.println("Call barring service"); break;
			                     case 3: System.out.println("Fixed dailling"); break;
			                     case 4: System.out.println("Closed up group"); break;
			                     case 5: System.out.println("Security level"); break;
			                     case 6: System.out.println("Change acces codes"); break;
			                     default: System.out.println("invalid input"); break;
			               
			               
			               } 	  
			  	  
			  	         break;
			  	  case 4: System.out.println("Restor factory settings"); break;
			  	  default: System.out.println("Invalid input"); break;
			  			}
			      
				}
				   break;
			case 7: System.out.println("Call divert"); break;
			case 8: System.out.println("Music");
				 String music = """
1. Music player
2. Radio
3. Recorder
4. Track list				 
""";		
							 
				System.out.println(music);
				int musicMenu = input.nextInt();
				
				
				switch(musicMenu){
					case 1: System.out.println("Music player"); break;
					case 2: System.out.println("Radio"); break;
					case 3: System.out.println("Recorder"); break;
					case 4: System.out.println("Track list"); break;
					default: System.out.println("invalid input"); break;
				 }
				 break;
			case 9: System.out.println("Games"); break;
                  case 10: System.out.println("Calculator"); break;
			case 11: System.out.println("Reminders"); break;
			case 12: System.out.println("Clock");
				  String clock = """
1. Alarm clock
2. Clock settings			
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time				 
""";	
				 System.out.println(clock);
				 int clockMenu = input.nextInt();
				 
				 switch(clockMenu){
				 	 case 1: System.out.println("Alarm clock"); break;
				 	 case 2: System.out.println(" Clock settings	"); break;
				 	 case 3: System.out.println("Date setting"); break;
				 	 case 4: System.out.println("Stopwatch"); break;
				 	 case 5: System.out.println("Countdown timer"); break;
				 	 case 6: System.out.println("Auto update of date and time"); break;
				 
				 }

			       break;
			case 13: System.out.println("Profile"); break;
			case 14: System.out.println("Service"); break;
			case 15: System.out.println("SIM service"); break;
			default : System.out.println("Invalid input"); break;
		}
		
		
	}
	
}
