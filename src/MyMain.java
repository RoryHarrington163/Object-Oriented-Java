import java.util.Scanner;
public class MyMain {

	
	static Scanner Input = new Scanner(System.in);
	

public static void MenuOpt() {
	   // Create a Scanner object
	    System.out.println("Enter an integer from 0 to 2 ");
	    int menuValue = Input.nextInt();
	    
	  //  menuInput.nextInt();  // Read user input
	   
	    int option = 0;
	   option = menuValue;
	    switch (option) {
	    case 0:{
	    	System.out.println (" Thanks for using the program");
	    	break;
	    }
	    case 1:{
	    	User user = new User();
	    	user.newUser();
	    	User.newuserMenu();
	    	break;
	    }
	    case 2:{
	    	Staff.StaffLogin();
	    	break;
	    }
	    case 3:{
	    	MenuOpt();
	    	break;
	    }
	    }
	 Input.close();
}

public static void printMainMenu() {
	System.out.print("------------------------------------\n");
	System.out.print("MAIN  MENU			  \n");
	System.out.print("------------------------------------\n");
	System.out.print("0. Exit\n");
	System.out.print("1. Customer account\n");
	System.out.print("2. Staff account\n");
	
	System.out.println("\n\n");
	MenuOpt();
	
}
	
	public static void main(String[] args) {
	
	printMainMenu();

	

	}

}
