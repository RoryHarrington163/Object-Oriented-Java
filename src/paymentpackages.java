import java.util.Scanner;
public class paymentpackages {

	// internet  fields
	 private static boolean membershiptype;
	private static float downloadSpeed,
	 uploadSpeed,
	 monthlyCost;
	// televison fields
	private static int numChannels;
	private static boolean ppv;

	
	
;
	 
	 
	 
	public static void broadband() {
		Scanner Input = new Scanner(System.in);
		System.out.print("Please choose a subscription option for Broadband\n");
		System.out.print("1.Regular membership\n");
		System.out.print("2.Premium membership\n");
		int menuBroad = Input.nextInt();
		
		switch(menuBroad) {
		case 1:{
			System.out.print("A regular membership");
			membershiptype = false;
			downloadSpeed = 15.6f;
			uploadSpeed = 2.97f;
			monthlyCost =35;
			BroadbandMenu();
			break;
		}
		case 2:{
			System.out.print("Premium membership");
			membershiptype = true;
			downloadSpeed = 23.9f;
			uploadSpeed = 4.97f;
			monthlyCost = 50;
			BroadbandMenu();
			break;
		}
			
		}
		}
	public static  void BroadbandMenu(){

		System.out.print("------------------------------------\n");
		System.out.println("\n The  BroadBand  Menu");
		System.out.print("------------------------------------\n");
		System.out.print("0. Exit Program\n");
		System.out.print("1. print account details\n");
		System.out.print("2. upgrade account\n");
		System.out.print("3. Exit to Staff account\n");
		System.out.println("\n\n");
		broadbandOpt();
	}
	public static void broadbandOpt() {
		   // Create a Scanner object
			Scanner Input = new Scanner(System.in);
		
		    System.out.println("Enter an integer from 0 to 3 ");
		    int broadbandmenuValue = Input.nextInt();
		   
		  //  menuInput.nextInt();  // Read user input
		    int option1 = 0;
		   option1 = broadbandmenuValue;
		    switch (option1) {
		    case 0:{
		    	System.out.println (" Thanks for using the program");
		    	break;
		    }
		    case 1:{
		    	User.printbroadbandAccountDetails();
		    	User.BroadbandMenu();
		    	break;
		    }
		    case 2:{
		    	User.LoginPincode();
		    	upgradeBroadband();
		    	break;
		    }
		    case 3:{
		    	Staff.StaffLogin();
		    	break;
		    }
		    } 
		Input.close();
	}
		
	
	public static void printbroadbandAccountDetails() {
		if (membershiptype == true){
			System.out.print("Membership subscription: Premium\n ");
		
		}
		else {
			membershiptype = false;
			System.out.print("Membership subscription: Regular\n ");
		}
		System.out.print("DownloadSpeed:"+downloadSpeed+"mb"+ "\n");
		System.out.print("UploadSpeed:"+uploadSpeed+"mb"+"\n");
		System.out.print("MonthlyCost: "+"€"+monthlyCost+ "\n");
		
	}
	
	public static void upgradeBroadband() {
		System.out.print("Do you want to upgrade your account(9(yes)/8(no))\n");
		Scanner inputmember = new Scanner(System.in);
		int confirmation = inputmember.nextInt();
		if (confirmation == 9) {
			
		
			if (membershiptype == true) {
				System.out.print("You already have a premium membership\n");
				BroadbandMenu();
				}
			else if (membershiptype == false) {
			membershiptype = true;
			downloadSpeed = 23.9f;
			uploadSpeed = 4.97f;
			monthlyCost = 50;
			System.out.print("You have successfully upgraded to  a premium membership\n");
			User.BroadbandMenu();
		}
		
		}
		else {
			confirmation = 8;
			User.BroadbandMenu();
		}	
			}
	
	public static void televison() {
		 Scanner InputTV = new Scanner(System.in);
		System.out.print("Please choose a subscription option for Televison \n");
		System.out.print("1.Regular TV membership\n");
		System.out.print("2.Premium TV membership\n");
		int TelevisionValue = InputTV.nextInt();
		
		switch(TelevisionValue) {
		case 1:{
			System.out.print("Regular TV membership\n");
			membershiptype = false;
			numChannels = 100;
			ppv = false;
			monthlyCost = 40;
			User.TelevisionMenu();
			break;
		}
		case 2:{
			System.out.print("Premium TV membership\n");
			membershiptype = true;
			numChannels = 250;
			ppv = true;
			monthlyCost = 100;
			User.TelevisionMenu();
			break;
		}
			
		}
		}
	
	
	
	
	public static void upgradeTelevision() {
		
		System.out.print("Do you want to upgrade television your account(9(yes)/8(no))\n");
		Scanner inputmember = new Scanner(System.in);
		int confirmation = inputmember.nextInt();
		if (confirmation == 9 ) {
			
		
			if (membershiptype == true) {
				System.out.print("You already have a premium Televison membership\n");
				User.TelevisionMenu();
				}
			
		else if (membershiptype == false) {
			membershiptype = true;
			numChannels = 250;
			ppv = true;
			monthlyCost = 100;
			System.out.print("You have successfully upgraded to  a premium Televison  membership\n");
			User.printTVAccountDetails();
			User.TelevisionMenu();
			}
		}
		else {
			confirmation = 8;
			User.TelevisionMenu();
		}
	}
	public static void printTVAccountDetails() {
		if (membershiptype == true){
			System.out.print("Membership subscription: Premium\n ");
		}
		else {
			membershiptype = false;
			System.out.print("Membership subscription: Regular\n ");
		}
		System.out.print("number of channels :"+numChannels+" channels"+ "\n");
		if (ppv == true ) {
			System.out.print("PPV is on\n");
		}
		else {
			ppv = false;
			System.out.print("PPV is off\n");
		}
		System.out.print("MonthlyCost: "+"€"+monthlyCost+ "\n");
	}
	public static  void TelevisionMenu(){

		System.out.print("------------------------------------\n");
		System.out.println("\n The  TV  Menu");
		System.out.print("------------------------------------\n");
		System.out.print("0. Exit Program\n");
		System.out.print("1. print TV account details\n");
		System.out.print("2. upgrade TV account\n");
		System.out.print("3. Exit to the staff menu\n");
		System.out.println("\n\n");
		TelevisonOpt();
	}
	public static void TelevisonOpt() {
		   // Create a Scanner object
			Scanner Input = new Scanner(System.in);
		
		    System.out.println("Enter an integer from 0 to 3 ");
		    int TVmenuValue = Input.nextInt();
		   
		  //  menuInput.nextInt();  // Read user input
		    int option1 = 0;
		   option1 = TVmenuValue;
		    switch (option1) {
		    case 0:{
		    	System.out.println (" Thanks for using the program");
		    	break;
		    }
		    case 1:{

		    	User.printTVAccountDetails();
		    	User.TelevisionMenu();
		    	break;
		    }
		    case 2:{
		    	System.out.println("To upgrade the account you must use your pin\n");
		    	User.LoginPincode();
		    	User.upgradeTelevision();
		    	User.printTVAccountDetails();
		    	User.TelevisionMenu();
		    	break;
		    }
		    case 3:{
		    	
		    	Staff.StaffLogin();
		    	
		    	break;
		    }
		    } 
		Input.close();
	}
	
	
	
	
			
	
	
	
	
	
	
}
