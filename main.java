
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {

class globalData {
	public static String[][] database = new String [30][8];
	public static int counter = 0;
}
	
static void Home() throws NumberFormatException, IOException {
	System.out.println("\t ||| Welcome to Hotel Trivaho ||| ");
	System.out.println("\t |||  Please enjoy your stay! ||| ");  
	
	// Menu
	System.out.println("[1] Dashboard ");
	System.out.println("[2] Client ");
	System.out.println("[3] Log ");
	System.out.println("[4] Reservations ");
	System.out.println("[5] Rooms ");
	System.out.println("[6] Exit");
	
	System.out.print("Enter choice: ");
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	  
	switch(reply){
		case 1:
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Dashboard();
			break;
		case 2:
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Client();
			break;
		case 3:
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Log();
			break;
		case 4:
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Reservation();
			break;
		case 5:
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			Rooms();
			break;
		case 6:
			System.out.println("@System Terminated");
			break;
		default:
			System.out.print("Invalid Input");
			Home();
			break;
	   }  
}
	
static void Dashboard() throws NumberFormatException, IOException {	
	System.out.println("Dashboard");
	System.out.println("Dashboard");
	System.out.println("Dashboard");
	System.out.println("Dashboard");
	System.out.println("Dashboard");
}

static void Client() throws NumberFormatException, IOException {	
	System.out.println("-----Client-----");
	System.out.println("[1] Add Reservation");
	System.out.println("[2] Cancel/Remove Reservation");
	System.out.println("[3] Go Back ");
	
	System.out.print("Enter choice: ");
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	switch(reply){
	case 1:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		AddReservation();
		break;
	case 2:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		CancelReservation();
		break;
	case 3:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Home();
		break;
	}
}

static void Log() throws NumberFormatException, IOException {	
	System.out.println("Log");
	System.out.println("Log");
	System.out.println("Log");
	System.out.println("Log");
	System.out.println("Log");
}

static void Reservation() throws NumberFormatException, IOException {	
	System.out.println("Reservation");
	System.out.println("Reservation");
	System.out.println("Reservation");
	System.out.println("Reservation");
	System.out.println("Reservation");
}

static void Rooms() throws NumberFormatException, IOException {	
	System.out.println("Rooms");
	System.out.println("Rooms");
	System.out.println("Rooms");
	System.out.println("Rooms");
	System.out.println("Rooms");
}

static void AddReservation() throws NumberFormatException, IOException{
	Scanner s = new Scanner(System.in);
	
	String Name, GuestNum, RoomNum, DateIn, Duration;
	
	
	boolean bool = true;
	while(bool == true) {
	System.out.print("Enter Name: ");
    Name = s.nextLine();	
	System.out.print("Enter Number of Guests: ");
	GuestNum = s.nextLine();	
	System.out.print("Enter Room No.: ");
	RoomNum = s.nextLine();	
	System.out.print("Enter Date In (MM/DD/YY): ");
	DateIn = s.nextLine();	
	System.out.print("Enter Duration (Days): ");
	Duration = s.nextLine();
	
	
	for(int i = 0; i < globalData.counter; i++) {
	if(RoomNum == globalData.database[i][2]) {
		System.out.print("Room Already Reserved!");
	}
	
	else {
		bool = false;
	}
	
	}
	
	
	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	System.out.println("-----Output-----");
	System.out.println("Name: "+ Name);
	System.out.println("No. of Guests: "+GuestNum);
	System.out.println("Room No.: "+RoomNum);
	System.out.println("Date In (MM/DD/YY): "+DateIn);
	System.out.println("Duration (Days): "+Duration);
	
	System.out.println("Submission: ");
	System.out.println("[1] Confirm");
	System.out.println("[2] Reset");
	System.out.println("[3] Cancel");
	
	System.out.print("Enter choice: ");
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	switch(reply){
	case 1:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Confirm(Name, GuestNum, RoomNum, DateIn, Duration);
		break;
	case 2:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		AddReservation();
		break;
	case 3:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Client();
		break;
	}

}

static void Confirm(String Name, String GuestNum, String RoomNum, String DateIn, String Duration) throws NumberFormatException, IOException{
	String Floor = "";
	String RoomType = "";
	String Cost = "";
	int RoomNumInt = Integer.parseInt(RoomNum);
	if (RoomNumInt >= 1 && RoomNumInt <= 10) {
		Floor = "1";
		RoomType = "Lower-Class";
		Cost = "5000";
	}
	else if (RoomNumInt >= 11 && RoomNumInt <= 20) {
		Floor = "2";
		RoomType = "Middle-Class";
		Cost = "7500";
	}
	else if (RoomNumInt >= 21 && RoomNumInt <= 30) {
		Floor = "3";
		RoomType = "Upper-Class";
		Cost = "10000";
	}
	
	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	System.out.println("-----Bill Information-----");
	System.out.println("Name: "+Name);
	System.out.println("No. of Guests: "+GuestNum);
	System.out.println("Room No.: "+RoomNum);
	System.out.println("Room Type: "+RoomType);
	System.out.println("Floor: "+Floor);
	System.out.println("Date In (MM/DD/YY): "+DateIn);
	System.out.println("Duration (Days): "+Duration);
	System.out.println("Amount: "+Cost);
	
	globalData.database[globalData.counter][0] = Name;
	globalData.database[globalData.counter][1] = GuestNum;
	globalData.database[globalData.counter][2] = RoomNum;
	globalData.database[globalData.counter][3] = RoomType;
	globalData.database[globalData.counter][4] = Floor;
	globalData.database[globalData.counter][5] = DateIn;
	globalData.database[globalData.counter][6] = Duration;
	globalData.database[globalData.counter][7] = Cost;
	
	System.out.println(globalData.database[globalData.counter][0]);
	
	try {
		System.out.print("Press Enter to continue...");
		BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
		int reply;
		reply = Integer.parseInt(input1.readLine());
	}
	catch(NumberFormatException e) {
		globalData.counter++;
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Client();
		
	}
	
	

}

static void CancelReservation() throws NumberFormatException, IOException{
	System.out.println("----- Cancel Reservation ----");
	System.out.println("Cancel Reservation");
	
	System.out.print("Enter choice: ");
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
	switch(reply){
	case 1:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		AddReservation();
		break;
	case 2:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		CancelReservation();
		break;
	case 3:
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
		Home();
		break;
	}
}

public static void main(String[] args) throws Exception {
	  Home();  
	  }
}

