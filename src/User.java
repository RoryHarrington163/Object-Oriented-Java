
import java.util.Scanner;


public class User extends Accounts {

	 
	




	//---------------------------------------
    //	Constructor
    //---------------------------------------
//	1

	
	
public static  void newuserMenu(){

	System.out.print("------------------------------------\n");
	System.out.println("\n The sign up User Menu");
	System.out.print("------------------------------------\n");
	System.out.print("0. Exit Program\n");
	System.out.print("1. Create a broadband package\n");
	System.out.print("2. Create a Televison package\n");
//	System.out.print("3. Back to the main menu\n");
	System.out.println("\n\n");
	UserMenuOpt();
}






public static void UserMenuOpt() {
	   // Create a Scanner object
		Scanner Input = new Scanner(System.in);
	
	    System.out.println("Enter an integer from 0 to 2 ");
	    int usermenuValue = Input.nextInt();
	   
	   // Read user input
	    int option1 = 0;
	   option1 = usermenuValue;
	    switch (option1) {
	    case 0:{
	    	System.out.println (" Thanks for using the program, have a nice Day :)");
	    	break;
	    }
	    case 1:{
	    	User.createPincode();
	    	User.LoginPincode();
	    	User.broadband();
	    	
	    	
	    	User.printbroadbandAccountDetails();
	    	break;
	    }
	    case 2:{	
	    	User.createPincode();
	    	User.LoginPincode();
	    	User.televison();
	    
	    }
	   
	   
	    } 
	Input.close();
}









}
