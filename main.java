import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
class globalData {
	public static String[][] database = new String [30][7];
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
	System.out.println("[2] Cancel Reservation");
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
	
	System.out.print("Enter Name: ");
	String Name = s.nextLine();	
	System.out.print("Enter Number of Guests: ");
	String GuestNum = s.nextLine();	
	System.out.print("Enter Room No.: ");
	String RoomNum = s.nextLine();	
	System.out.print("Enter Date In: ");
	String DateIn = s.nextLine();	
	System.out.print("Enter Duration: ");
	String Duration = s.nextLine();
	
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
	System.out.println("-----Information-----");
	System.out.println("Name: "+Name);
	System.out.println("No. of Guests: "+GuestNum);
	System.out.println("Room No.: "+RoomNum);
	System.out.println("Room Type: "+RoomType);
	System.out.println("Floor: "+Floor);
	System.out.println("Date In: "+DateIn);
	System.out.println("Duration (Days): "+Duration);
	
	System.out.println("Submission: ");
	System.out.println("[1] Confirm");
	System.out.println("[2] Clear");
	System.out.println("[3] Cancel");
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int reply;
	reply = Integer.parseInt(input.readLine());
}


static void CancelReservation() throws NumberFormatException, IOException{
	System.out.println("Cancel Reservation");
	System.out.println("Cancel Reservation");
	System.out.println("Cancel Reservation");
	System.out.println("Cancel Reservation");
	System.out.println("Cancel Reservation");
}

public static void main(String[] args) throws Exception {
	Home();
	}
}
