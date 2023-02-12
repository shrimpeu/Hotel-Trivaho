package HotelManagement;

import java.io. *;

public class Menu {
    
public static void main(String[] args) throws Exception {
  BufferedReader input = new BufferedReader   // Input Scanner
        (new InputStreamReader(System.in));
  
  char reply;
  
  // Menu
  System.out.println("[1] Book Reservation");
  System.out.println("[2] Cancel Reservation");
  System.out.println("[3] View Reservations");
  System.out.println("[4] View Available Rooms");
  System.out.println("[5] Exit");
  
  System.out.println("Enter choice: ");
  reply = input.readLine();
  
  switch(reply){
    case 1:
      bookreservation();
      break;
    case 2:
      cancelreservation();
      break:
    case 3:
      viewreservation();
      break:
    case 4:
      viewavailroom();
      break:
    case 5:
      exit();
      break:
  }
  
  
}
  
}
