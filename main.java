//
// Hotel Reservation Style : Java using method and parameters
//

// 	Made by:
// Mark Jeremiah Pabalan
// Jan Maverick Juat
// Mark Francis Masadre
// Dionmelle Pardilla


// Java imports and packages (scanner, user inputs and error handling)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Class main
public class main {

// Global Data Class
class globalData {
	public static String[][] database = new String [30][8];	// Database for the clients information
	public static int counter = 0;	// Guest counter
	public static int vacant = 30;	// Total of vacant rooms
	public static int reserved = 0;	// Total of reserved rooms
}

// Home Method
static void Home() throws NumberFormatException, IOException {
	// Displays Home Menu
	System.out.println(" ");
	System.out.println("=================================================== ");
	System.out.println("\t ||| Welcome to Hotel Trivaho ||| ");
	System.out.println("\t |||  Please enjoy your stay! ||| ");  
	System.out.println("=================================================== ");
	// Menu
	System.out.println(" ");
	System.out.println("[1] Dashboard ");
	System.out.println("[2] Client ");
	System.out.println("[3] Log");
	//Name Date In
	System.out.println("[4] Reservations");
	//Room No., Type, Floor, Price
	System.out.println("[5] Exit");
	
	System.out.println("__________________________________________________");
	System.out.print("Enter choice: ");
	
	// User input/reply
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	  
	switch(reply){
		case 1:	// Dashboard Menu
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Dashboard();
			break;
		case 2:	// Client Menu
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Client();
			break;
		case 3:	// Log Menu
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Log();
			break;
		case 4:	// Reservation Menu
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Reservation();
			break;
			
		case 5: // Exit Program
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			System.out.println("@System Terminated");
			break;
		default: // Check if the user inputs invalid parameter
			System.out.print("Invalid Input");
			Home();
			break;
	   }  
}

// Dashboard Method
static void Dashboard() throws NumberFormatException, IOException {	
	System.out.println("=================================================== ");
	System.out.println("\t\t||| Hotel Trivaho ||| ");
	System.out.println("\t\t|||  Dash Board   ||| ");  
	System.out.println("=================================================== ");
	
	int guest = 0;
	for(int i = 0; i < globalData.counter;i++) {
		guest += Integer.parseInt(globalData.database[i][1]);
	}
	
	// Displays Total Number of Guests,
	// Total Room Available and Total Room Reserved

	guest += globalData.reserved;
	System.out.println(" ");
	System.out.println("Total Number of Guests :  " + guest);
	System.out.println("Total Room Available   :  " + globalData.vacant);
	System.out.println("Total Room Reserved    :  " + globalData.reserved);
	System.out.println(" ");
	System.out.println("[0] Go Back");
	System.out.println("__________________________________________________");
	System.out.print("Enter Choice: ");
	// User input
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	switch(reply){
	case 0:	// Go back to Home Menu
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Home();
		break;
	}
}

// Client Method
static void Client() throws NumberFormatException, IOException {	
	System.out.println("=================================================== ");
	System.out.println("\t|||      Hotel Trivaho        ||| ");
	System.out.println("\t|||    Client Reservation     ||| ");  
	System.out.println("=================================================== ");
	System.out.println(" ");
	
	// Displays the admin to either:
	// Add reservation, Cancel a reservation or Go back
	
	System.out.println("[1] Add Reservation");
	System.out.println("[2] Cancel/Remove Reservation");
	System.out.println("[3] Go Back ");
	System.out.println("__________________________________________________");
	System.out.print("Enter choice: ");
	// user input
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	switch(reply){
	case 1: // Add Reservation
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		AddReservation();
		break;
	case 2: // Cancel Reservation
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		CancelReservation();
		break;
	case 3:	// Go back to Home Menu
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Home();
		break;
	}
}

// Log Method
static void Log() throws NumberFormatException, IOException {	
	System.out.println("=================================================== ");
	System.out.println("\t\t||| Hotel Trivaho ||| ");
	System.out.println("\t\t|||   Log Book    ||| ");  
	System.out.println("=================================================== ");
	System.out.println(" ");
	
	// Displays the Name of guest 
	// and their time in for their stay.
	
	System.out.println("Name \t\t\t Date In");
	for(int i = 0; i < globalData.counter;i++) {
		if(Integer.parseInt(globalData.database[i][2]) > 0) {
			System.out.println(globalData.database[i][0] +"\t\t\t" +globalData.database[i][5]);
		}
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("[0] Go Back");
	System.out.println("__________________________________________________");
	System.out.print("Enter Choice: ");
	// user input
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	switch(reply){
	case 0: // Go back to Home menu
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Home();
		break;
	}
	
}

// Reservation Method
static void Reservation() throws NumberFormatException, IOException {	
	System.out.println("========================================================================== ");
	System.out.println("\t\t\t |||     Hotel Trivaho    |||  \t\t\t");
	System.out.println("\t\t\t ||| List of Reservations |||  \t\t\t");  
	System.out.println("========================================================================== ");
	System.out.println(" ");
	// Displays Room No., Type, Floor, Price
	System.out.println("Room No. \t\t Room Type \t\t Floor \t\t Price");
	for(int i = 0; i < globalData.counter;i++) {
		// Displays List of Reservation
		if(Integer.parseInt(globalData.database[i][2]) > 0) {
			System.out.println(globalData.database[i][2] +"\t\t\t" + globalData.database[i][3] +" \t\t" + globalData.database[i][4] + " \t\t" + globalData.database[i][7]);
		}

	}
	
	System.out.println(" ");
	System.out.println("[0] Go Back");
	System.out.println("__________________________________________________________________________");
	System.out.print("Enter Choice: ");
	// user input
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	switch(reply){
	case 0: // Go back to Home Menu
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Home();
		break;
	}
}

// Add reservation -> Reservation method
static void AddReservation() throws NumberFormatException, IOException{
	
	// Variables -> Guest Information, Room Number and Time in and Out
	Scanner s = new Scanner(System.in);
	String Name, GuestNum, RoomNum, DateIn, Duration;
	System.out.println("=================================================== ");
	System.out.println("\t|||      Hotel Trivaho        ||| ");
	System.out.println("\t|||    Client Reservation     ||| ");  
	System.out.println("=================================================== ");
	System.out.println(" ");
	
	outerloop:	// Defined a loop point
	while(true) {
	// Guest information inputs
	System.out.print("Enter Name: ");
    	Name = s.nextLine();	
	System.out.print("Enter Number of Companion: ");
	GuestNum = s.nextLine();	
	System.out.print("Enter Room No.: ");
	RoomNum = s.nextLine();	
	System.out.print("Enter Date In (MM/DD/YY): ");
	DateIn = s.nextLine();	
	System.out.print("Enter Duration (Days): ");
	Duration = s.nextLine();
		
		// To check if the room is already reserved 
		// and proceed to choose another room
	for(int i = 0; i < globalData.counter; i++) {
		int temp1 = Integer.parseInt(RoomNum);
		int temp2 = Integer.parseInt(globalData.database[i][2]);
		if(temp1 == temp2) {
			System.out.print("Room Already Reserved!");
			System.out.println("");
			System.out.println("");
			continue outerloop;	// Reloop starting at the defined loop point
		}
	}
	break;
	}
	
	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	
	// Displays the information inputted for confirmation, reset or cancel 
	
	System.out.println("=================================================== ");
	System.out.println("\t|||      Hotel Trivaho        ||| ");
	System.out.println("\t|||    Client Reservation     ||| ");  
	System.out.println("=================================================== ");
	System.out.println(" ");
	System.out.println("Name               : "+ Name);
	System.out.println("No. of Companion   : "+GuestNum);
	System.out.println("Room No.           : "+RoomNum);
	System.out.println("Date In (MM/DD/YY) : "+DateIn);
	System.out.println("Duration (Days)    : "+Duration);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Submission: ");
	System.out.println("[1] Confirm");
	System.out.println("[2] Reset");
	System.out.println("[3] Cancel");
	System.out.println("__________________________________________________");
	System.out.print("Enter choice: ");
	// user input
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	switch(reply){
	case 1:	// Comfirmation of the Data Inputted
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Confirm(Name, GuestNum, RoomNum, DateIn, Duration);
		break;
	case 2: // Reset and input again
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		AddReservation();
		break;
	case 3:	// Go back to client method
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Client();
		break;
	}

}
// Confirm Method -> Add Reservation Method -> Reservation Method
static void Confirm(String Name, String GuestNum, String RoomNum, String DateIn, String Duration) throws NumberFormatException, IOException{
	String Floor = "";
	String RoomType = "";
	String Cost = "";
	int RoomNumInt = Integer.parseInt(RoomNum);
	if (RoomNumInt >= 1 && RoomNumInt <= 10) {	// Lower class suites with prices
		Floor = "1";
		RoomType = "Lower-Class";
		Cost = "₱5000";
	}
	else if (RoomNumInt >= 11 && RoomNumInt <= 20) {	// Middle Class suites with prices
		Floor = "2";
		RoomType = "Middle-Class";
		Cost = "₱7500";
	}
	else if (RoomNumInt >= 21 && RoomNumInt <= 30) {	// Upper Class Suites with prices
		Floor = "3";
		RoomType = "Upper-Class";
		Cost = "₱10000";
	}
	
	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	
	// Displays the Bill Receipt of the guest,
	// Plus the amount and balance of the guest
	
	System.out.println("=================================================== ");
	System.out.println("\t|||      Hotel Trivaho        ||| ");
	System.out.println("\t|||     Billing Receipt       ||| ");  
	System.out.println("=================================================== ");
	System.out.println(" ");
	System.out.println("Name                : "+Name);
	System.out.println("No. of Companion    : "+GuestNum);
	System.out.println("Room No.            : "+RoomNum);
	System.out.println("Room Type           : "+RoomType);
	System.out.println("Floor               : "+Floor);
	System.out.println("Date In (MM/DD/YY)  : "+DateIn);
	System.out.println("Duration (Days)     : "+Duration);
	System.out.println("---------------------------------------------------");
	System.out.println("Amount              : "+Cost);
	
	System.out.println(" ");
	System.out.println(" ");
	
	// Gets the data stored in the database
	globalData.database[globalData.counter][0] = Name;
	globalData.database[globalData.counter][1] = GuestNum;
	globalData.database[globalData.counter][2] = RoomNum;
	globalData.database[globalData.counter][3] = RoomType;
	globalData.database[globalData.counter][4] = Floor;
	globalData.database[globalData.counter][5] = DateIn;
	globalData.database[globalData.counter][6] = Duration;
	globalData.database[globalData.counter][7] = Cost;
	//System.out.println(globalData.database[globalData.counter][0]);
	globalData.counter++;
	globalData.vacant--;
	globalData.reserved++;
	
	if(globalData.counter > 30) {
		globalData.counter = 30;
	}
	
	try {	// Continue the Method
		System.out.print("Press Enter to continue...");
		BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
		int reply;
		reply = Integer.parseInt(input1.readLine());
	}
	catch(NumberFormatException e) { // Error Handling, Go back to Client method
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Client();
	}
	
	

}

// Cancel Reservation -> Client Method
static void CancelReservation() throws NumberFormatException, IOException{
	
	System.out.println("=================================================== ");
	System.out.println("\t|||      Hotel Trivaho        ||| ");
	System.out.println("\t|||    Cancel Reservation     ||| ");  
	System.out.println("=================================================== ");
	System.out.println("\tRoom\t\t\t Name");
	for(int i = 0; i < globalData.counter;i++) {
		if(Integer.parseInt(globalData.database[i][2]) > 0) {
			// Displays the Room number and Guest name
			System.out.println("\t " + globalData.database[i][2]+ "\t\t " +globalData.database[i][0]);
			System.out.println("");
		}

	}
	
	
	try {
		System.out.println("");
		System.out.print("Enter Room [Press Enter to Cancel]: ");
		// user input
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int reply;
		reply = Integer.parseInt(input.readLine());
		
		// Deletion of the data from database
		for(int i = 0; i < globalData.counter; i++) {
			int temp3 = Integer.parseInt(globalData.database[i][2]);
			if(reply == temp3) {
				for(int j = 0; j<8; j++) {
					globalData.database[i][j] = "0";
				}
			}
		}
		globalData.vacant++;
		globalData.reserved--;
	}
	catch(NumberFormatException e) { // Error handling, Go back to Client method
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Client();
	}
	// Go back to client method
	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	Client();
}

	// Main Code: Home()
public static void main(String[] args) throws Exception {
	  Home();  
	  }
}
