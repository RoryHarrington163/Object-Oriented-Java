import java.util.Scanner;

public class Staff extends Accounts{
	//private fileds 
private static int ID = 112;
private static int inID;
	// shows sthe users in the list 
public static void ShowUsers(){
	System.out.print("the Current list"+ UsersList +"\n" );
	System.out.print("Press anything to continue\n");
	Scanner Input = new Scanner(System.in);
	Input.nextLine();
	StaffMenu();
	
}

public static  void StaffLogin() {
	
	
	
		System.out.println("Enter staff ID number: ");
		Scanner InputID = new Scanner(System.in);
		int Input = InputID.nextInt();
		
		if (Input != ID) {
			System.out.println("ID does not match");
			StaffLogin();
		}
		else {
			System.out.print("ID successful");
			StaffMenu();
		}
	
	
}
	private static void DeleteUser() {
		System.out.println("Current List:"+UsersList);
		
		System.out.println("please enter in an index to delete\n");
		Scanner intOP = new Scanner(System.in);
		
		int ans = intOP.nextInt();
		
		System.out.println("You have selected index: "+ ans + "\n");
		System.out.println("The name at location: "+UsersList.get(ans));
		System.out.println("Are you sure you want to delete: "+UsersList.get(ans)+ "From the Users List (Y/N)");
		Scanner choice = new Scanner(System.in);
		String output = choice.nextLine();
		
		switch(output) {
		case "Y":{
			System.out.print("Delete Successful\n");
			//System.out.print(UsersName.remove(ans));
			UsersList.remove(ans);
			System.out.print(UsersList);
			Staff.StaffMenu();
			break;
		}
		case "N":{
			System.out.println("Delete Unsuccesful\n");
			Staff.StaffMenu();
		}
			
			
		
		
	}
		
}
	public static  void StaffMenu(){

		System.out.print("\n------------------------------------\n");
		System.out.println("\n The Staff Menu");
		System.out.print("------------------------------------\n");
		System.out.print("0. Exit Program\n");
		System.out.print("1. Display Registered User Names\n");
		System.out.print("2. Delete User UserNames \n");
		System.out.println("\n\n");
		staffMenuOpt();
	}
	public static void staffMenuOpt() {
		Scanner Input = new Scanner(System.in);
		
	    System.out.println("Enter an integer from 0 to 2 ");
	    int StaffmenuValue = Input.nextInt();
	   
	  //  menuInput.nextInt();  // Read user input
	    int option1 = 0;
	   option1 = StaffmenuValue;
	    switch (option1) {
	    case 0:{
	    	System.out.println (" Thanks for using the program have a nice day :) ");
	    	break;
	    }
	    case 1:{

	    	Staff.ShowUsers();
	    	
	    	break;
	    }
	    case 2:{
	    	Staff.DeleteUser();
	    }
	  
	   
	    
	    
	    } 
	Input.close();
}
	

}
	
	
	
	

