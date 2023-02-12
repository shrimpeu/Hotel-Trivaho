package HotelManagement;

import java.io. *;

public class Menu {
  
  // Home Method
static void Home () throws IOException {
    BufferedReader input = new BufferedReader   // Input Scanner
        (new InputStreamReader(System.in));
  
  int reply;
  
  globalData.database [0][0] = "Dion";
  System.out.println(globalData.database[0][0]);
  
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
  reply = Integer.parseInt(input.readLine());
  
  switch(reply){
    case 1:
      // Dashboard();
      break;
    case 2:
     //  Client();
      break;
    case 3:
      // Log();
      break;
    case 4:
      // Reservation();
      break;
    case 5:
      // Rooms();
      break;
    case 6:
      // return 0;
      break;
   }
 }
      
}
  // Main Method
    public static void main(String[] args) throws IOException {
      
      class globalData {
      public static String[][] database = new String [30][7];
      }
        
        Home();
  
}
