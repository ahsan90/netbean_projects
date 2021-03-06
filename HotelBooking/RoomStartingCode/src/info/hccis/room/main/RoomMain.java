package info.hccis.room.main;


import info.hccis.room.bo.ComputerRoom;
import info.hccis.room.bo.BiologyLab;
import info.hccis.room.bo.BoardRoom;
import info.hccis.room.bo.Room;
import info.hccis.room.util.RoomUtil;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This main method will invoke functionality for booking college rooms.
 *
 * Detailed description:
 * https://docs.google.com/document/d/1jyrvSJHXS6BZuXKVswYkmt2muBmPI71OxXTLQxerDVU/edit
 *
 * @author cis1232 (including Roger)
 */
public class RoomMain {

    private static final int ROOM_DOES_NOT_EXIST = -1;
    private static ArrayList<Room> rooms = new ArrayList();

    /**
     * Main method controls program and user interface.
     *
     * @param args the command line arguments
     * @since 20170314
     * @author CIS1232
     */
    public static void main(String[] args) {

        RoomUtil.createTestRooms(rooms);
        
        Scanner input = new Scanner(System.in);
        String menu = "------------------------\n- CIS Room Booking\n"
                + "------------------------\n"
                + "Choose an option:\n"
                + "1) Add Room\n"
                + "2) Reserve Room\n"
                + "3) Release Room\n"
                + "4) Show Rooms\n"
                + "5) Show Room Count Details\n"
                + "6) Search For Room\n"
                + "7) Exit";
        int selection = 0;


        while (selection != 7) {
            System.out.println(menu);
            selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 1:
                    addRoom();
                    break;
                case 2:
                    reserveRoom();
                    break;
                case 3:
                    releaseRoom();
                    break;
                case 4:
                    showRooms();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

    }

    /**
     * Loop through the rooms to check if the room already exists.
     *
     * @param roomNumber
     * @return the index of the room number
     * @since 20170314
     * @author CIS1232
     */
    public static int getRoomNumberIfExists(int roomNumber) {
        int index = -1;
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getRoomNumber() == roomNumber) {
                index = i;
            }
        }
        return index;
    }

    /**
     * This method will allow the user to add a new room to the collection of rooms.
     *
     */
    public static void addRoom() {

        //***********************************************************
        //Ask which room number the user wants to add
        //***********************************************************
        Room room = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter room number: ");
        int roomNumber = input.nextInt();
        input.nextLine();

        //***********************************************************
        //Check to see if the room already exists
        //***********************************************************

        int roomNumberIndex = getRoomNumberIfExists(roomNumber);

        //If the room does not already exist.
        if (roomNumberIndex == ROOM_DOES_NOT_EXIST) {
            roomNumberIndex = rooms.size();
            boolean finished = false;
            do {
                System.out.print("What type of room is this?\n" + "1) Add Room\n"
                        + "2) Computer Lab\n"
                        + "3) Board Room\n"
                        + "4) Biology lab\n");
                String choice = input.nextLine();


                //***********************************************************
                //Based on the user input, create the correct type of room.  
                //***********************************************************

                switch (choice) {
                    case "1":
                        room = new Room();
                        finished = true;
                        break;
                    case "2":
                        room = new ComputerRoom();
                        finished = true;
                        break;
                    case "3":
                        room = new BoardRoom();
                        finished = true;
                        break;
                    case "4":
                        room = new BiologyLab();
                        finished = true;
                        break;
                    default:
                        System.out.println("Invalid option");

                }
            } while (!finished);
            
            //Set the details for the room
            room.setRoomNumber(roomNumber);
            
            //Note the correct method will be invoked based on which type of room was created above.
            room.getRoomDetailsFromUser();
            
            //Add the room to the collection of rooms.  Note that as long as an object 'is a' Room 
            //(all of the types of rooms above are rooms), then it can be added to the collection of 
            //rooms.
            rooms.add(room);

        } else {
            String choice = "";
            System.out.println("Room already exists. Do you want to continue? (Y/N)");
            choice = input.nextLine();
            
            //If the user wants to continue, invoke the method to change the value of attributes in 
            //the room
            if (choice.equalsIgnoreCase("y")) {
                rooms.get(roomNumberIndex).getRoomDetailsFromUser();
            }
        }
    }

    
    
    /**
     * This method will allow the user to reserve a room.  
     */
    
    public static void reserveRoom() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the room number you would like to book");
        int roomNumber = input.nextInt();
        input.nextLine();
        
        //Check to see if the room exists.
        int roomNumberIndex = getRoomNumberIfExists(roomNumber);
        if (roomNumberIndex < 0) {
            System.out.println("This room does not exist");
        } else {
            //Put the room from the ArrayList into a local variable.
            Room room = rooms.get(roomNumberIndex);
            if (!room.isReserved()) {
                room.reserveThisRoom();
            } else {
                System.out.println("This room is already booked!");
            }
        }
    }

    public static void releaseRoom() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the room number you would like to release");
        int roomNumber = input.nextInt();
        input.nextLine();
        
        //Check if the room exists.  
        int roomNumberIndex = getRoomNumberIfExists(roomNumber);
        
        if (roomNumberIndex < 0) {
            System.out.println("This room does not exist");
        } else {
            //Put the room from the ArrayList into a local variable.
            Room room = rooms.get(roomNumberIndex);
            //If the room is reserved, allow them to release.
            if (room.isReserved()) {
                room.releaseThisRoom();
            } else {
                System.out.println("This room is not booked!");
            }
        }
    }

    /**
     * Show the details for each room
     */
    public static void showRooms() {
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("- Room List");
        System.out.println("------------------------");
        if(rooms.size() == 0){
            System.out.println("There are no rooms.");
        }
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i));
        }
        System.out.println("");
    }
}
