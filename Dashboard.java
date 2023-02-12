package HotelManagement;

import java.io. *;

public class Dashboard {
  BufferedReader input = new BufferedReader   // Input Scanner
        (new InputStreamReader(System.in));
  
  char reply;
  
  System.out.println("\t ||| Welcome to Hotel Trivaho ||| ");
  System.out.println("\t        ||| DASHBOARD ||| ");  
    
  // Menu
  System.out.println("[1] Display Available Rooms ");
  System.out.println("[2] Display Reserved Rooms ");
  System.out.println("[3] Total Guests ");
  System.out.println("[4] Go Back ");
  System.out.println("[5] Exit ");
  
  System.out.println("Enter choice: ");
  reply = input.readLine();

  switch(reply) {
    case 1:
      Display_Avail_Rooms();
      break;
    case 2:
      Display_Reserved_Rooms();
      break;
    case 3:
      Total_Guests();
      break;
    case 4:
      // Go back (not sure code) (RETURN TO DASHBOARD)
      break;
    case 5:
      return(0);
      break;
  }
  
  
  void Display_Avail_Rooms() {
      // Display Available Room
  }
  
  void Display_Reserved_Rooms() {
      // Display Reserved Room
  }
  
  void Total_Guests() {
      // Display Available Room
  }
  
      
}

}
