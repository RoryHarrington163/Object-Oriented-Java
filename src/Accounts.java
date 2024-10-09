import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Accounts extends paymentpackages {
static // parent class
	
	String Username;
	static String name = "";
	//---------------------------------------
    //	Fields
    //---------------------------------------
	
	protected static int PIN;
	private static int samePIN;
	protected char confirmation;
	static ArrayList UsersList = new ArrayList<>(Arrays.asList("John","Chris","Mary","Luke","Nacho","Hamden"));
	//ArrayList<String> UsersName = new ArrayList<>(Arrays.asList("John","Chris","Mary","Luke","Nacho","Hamden"));
    //---------------------------------------1
	
    //	Constructor
    //---------------------------------------

	
	
	
	 //---------------------------------------
    //	Get Methods
    //---------------------------------------
public static int getPinCode() {
	// gets my pin 
	return PIN;
	
}
public final String getUsername(String name) {
	name = this.Username;
	
	return this.Username;
}


	
	
	
	//---------------------------------------
    //	Set Methods
    //---------------------------------------
	public static int setPinCode(int pincode) {
		PIN = pincode;
		
		
		return PIN;
	}
	
	//---------------------------------------
    //	Extra Methods
    //---------------------------------------
	
	public static boolean validPINHas4Digits(int pincheck) {
		// checks to see if the pin is valid ,
		//not   an exception but stops the user from entering a lower number
		
		if(pincheck < 1000 || pincheck > 9999) {
			return false;
		}
		else {
			return true;
		}
		
		
	}
	
	public  final static void createPincode() {
		
		int pin;
		// this is where the user creates a PIN 
		do {
			System.out.println("\nPlease enter a 4 digit passcode");
			Scanner inputPIN = new Scanner(System.in);

			 int createdPIN  = inputPIN.nextInt();
			 	 pin = createdPIN;
			 if(validPINHas4Digits(createdPIN)) {
				 setPinCode(createdPIN);
				 
			 }
			 else {
				 System.out.print("Please try again\n");
			 }
			
		
			 // Validated to see if it has 4 digits 
		} while (!validPINHas4Digits(pin));
			System.out.print("PIN successful\n");
		
	}
	
	
	
	public static void LoginPincode() {
		// takes the excsitng pins and comparesto see if they match 
		
		getPinCode();
		
		do
		{
			Scanner exsistingPIN = new Scanner(System.in);

			
			System.out.print("\n Enter PIN\n:");
			  samePIN  = exsistingPIN.nextInt();
			 
		
			if(validatePinsMatch(samePIN,PIN)){
			System.out.println("Login successful\n");
			
			}
		else {
			System.out.println("Pins do not match\n");
		} 
			
		
		}while(!validatePinsMatch(samePIN,PIN));{
			
		}

		
	}
	public void newUser() {
// creates a new user 
		System.out.print("Enter a username\n\n ");
		Scanner input = new Scanner(System.in);
		
		//edit fixed issue with names not displaying 
		String newName = input.nextLine();
		 this.name = newName ;
		 this.name = Username ;
		UsersList.add(newName);
		



		
	}

	private static boolean validatePinsMatch(int pass, int pIN2) {
		if (pass != pIN2) {
			return false;
		}
		else {
			
		}
		return true;
	
		
	}
	protected static void printUsersLists() {
		/// ArrayList<String> UsersName = new ArrayList<>(Arrays.asList("John","Chris","Mary","Luke","Nacho","Hamden"));
		 
		 System.out.println(UsersList);
	}
	
	
}
