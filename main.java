package HotelManagement;

import java.io. *;

public class Menu {
    
public static void main(String[] args) throws Exception {
  BufferedReader input = new BufferedReader   // Input Scanner
        (new InputStreamReader(System.in));
  
  char reply;
  
  System.out.println("\t ||| Welcome to Hotel Trivaho ||| ");
  System.out.println("\t |||  Please enjoy your stay! ||| ");  
    
  // Menu
  System.out.println("[1] Dashboard ");
  System.out.println("[2] Clieht ");
  System.out.println("[3] Log ");
  System.out.println("[4] Reservations ");
  System.out.println("[5] Rooms ");
  System.out.println("[6] Exit");
  
  System.out.println("Enter choice: ");
  reply = input.readLine();
  
  switch(reply){
    case 1:
      Dashboard();
      break;
    case 2:
      Client();
      break:
    case 3:
      Log();
      break:
    case 4:
      Reservation();
      break:
    case 5:
      Rooms();
    case 6:
      exit(1);
      break:
  }
  
  
}
  
}
