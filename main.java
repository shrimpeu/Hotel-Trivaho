package HotelManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;




public class main {

class globalData {
        public static String[][] database = new String [30][7];
        public static int counter = 1;
        }  
	
	
static void Home() throws NumberFormatException, IOException {
	BufferedReader input = new BufferedReader   // Input Scanner
	        (new InputStreamReader(System.in));
	Scanner s = new Scanner(System.in);
	  
	  int reply;
	  	  
	  System.out.println("\t ||| Welcome to Hotel Trivaho ||| ");
	  System.out.println("\t |||  Please enjoy your stay! ||| ");  
	    
	  // Menu
	  System.out.println("[1] Dashboard ");
	  System.out.println("[2] Clieht ");
	  System.out.println("[3] Log ");
	  System.out.println("[4] Reservations ");
	  System.out.println("[5] Rooms ");
	  System.out.println("[6] Exit");
	  
	  System.out.print("Enter choice: ");
	  reply = Integer.parseInt(input.readLine());
 
	  
	  switch(reply){
	    case 1:
	    	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	    	Dashboard();
	      break;
	    case 2:
	    	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	     //  Client();
	      break;
	    case 3:
	    	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	      // Log();
	      break;
	    case 4:
	    	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	      // Reservation();
	      break;
	    case 5:
	    	System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	      // Rooms();
	      break;
	    case 6:
	    	cls();
	      break;
	      
	      default:
	    	  System.out.print("Invalid Input");
	    	  Home();
	    	  break;
	   }
		  
}


public static void cls() {
	try {
		new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
	}catch(Exception E) {
		System.out.print(E);
	}
}


public static void main(String[] args) throws Exception {
		  Home();  
		  }
	
static void Dashboard() {
	System.out.println("Dashboard");
	System.out.println("Dashboard");
	System.out.println("Dashboard");
	System.out.println("Dashboard");
	System.out.println("Dashboard");
	System.out.println("Dashboard");
	System.out.println("Dashboard");
}
}
