
package info.hccis.room.util;
import info.hccis.room.bo.*;

import java.util.*;

/**
 * This class provides features for searching specific room and also room counts details
 * @since 20190326
 * @author Ahsanul Hoque
 */
public class RoomUtility {
    
    final static String HEADING = "Room Count Details Report:\n";
    public static void CountRoomsAndDisplayStat(ArrayList<Room> rooms){
        String outputCountDetails = "";
        String notFound = "No room found";
        int totalRooms = countTotalRooms(rooms);
        outputCountDetails = HEADING +"\n"
                +"Room\t"+totalRooms + "\n"
                +"Computer Room:\t"+(countComputerRoom(rooms)>0? countComputerRoom(rooms) : notFound)+"\n"
                +"Biology Lab:\t" +(countBiologyLab(rooms)>0? countBiologyLab(rooms) : notFound)+"\n"
                +"Board Room: \t" +(countBoardRoom(rooms)>0? countBoardRoom(rooms) : notFound) + "\n"
                +"Fancy Board Room: \t" +(countSpecialBoardRoom(rooms)>0? countSpecialBoardRoom(rooms) : notFound) + "\n";
        Util.display(outputCountDetails);
        trackLargestRoomAndDisplayInfo(rooms);
    }
    
    /**
    * This method provides searching for a specific room
    * @since 20190326
    * @author Ahsanul Hoque
    */
    public static void searchRoom(ArrayList<Room> rooms){
        //Scanner input = new Scanner(System.in);
        System.out.print("What type of room would you like:\n"
                        + "1) Room\n"
                        + "2) Computer Lab\n"
                        + "3) Board Room\n"
                        + "4) Biology lab\n"
                        + "5) Fancy Board Room");
        String choice = Util.getInputString("");
        
        int requiredSeatNumbers = 0;
        
        switch (choice) {
            case "1":
                requiredSeatNumbers = Util.getInputInt("How many seats do you need?");
                
                for(Room room: rooms){
                    if(!(room instanceof ComputerRoom) && 
                            !(room instanceof BoardRoom) &&
                            !(room instanceof BiologyLab)){
                        if(room.getNumberOfSeats()>=requiredSeatNumbers){
                            //flag = true;
                            if(!room.isReserved()){
                                Util.display("Room Number: #"+room.getRoomNumber()+"\n"+
                                        "Number of seats: "+room.getNumberOfSeats()+"Room type: A Room");
                            }
                        }
                    }
                }
                
                break;
            case "2":
                requiredSeatNumbers = Util.getInputInt("How many seats do you need?");
                for(Room room: rooms){
                    if(room instanceof ComputerRoom){
                        if(room.getNumberOfSeats()>=requiredSeatNumbers){
                            //flag = true;
                            if(!room.isReserved()){
                                Util.display("Room Number: #"+room.getRoomNumber()+"\n"+
                                        "Number of seats: "+room.getNumberOfSeats()+"Room type: Computer Room");
                            }
                        }else{
                            Util.display("There is no room available with this requirements");
                            break;
                        }
                    }
                }

                break;
            case "3":
               requiredSeatNumbers = Util.getInputInt("How many seats do you need?");
               for(Room room: rooms){
                    if(room instanceof BoardRoom && !(room instanceof SpecialBoardRoom)){
                        if(room.getNumberOfSeats()>=requiredSeatNumbers){
                            //flag = true;
                            if(!room.isReserved()){
                                Util.display("Room Number: #"+room.getRoomNumber()+"\n"+
                                        "Number of seats: "+room.getNumberOfSeats()+"Room type: Board Room");
                            }
                        }else{
                            Util.display("There is no room available with this requirements");
                            break;
                        }
                    }
                }
                break;
            case "4":
                requiredSeatNumbers = Util.getInputInt("How many seats do you need?");
                for(Room room: rooms){
                    if(room instanceof BiologyLab){
                        if(room.getNumberOfSeats()>=requiredSeatNumbers){
                            //flag = true;
                            if(!room.isReserved()){
                                Util.display("Room Number: #"+room.getRoomNumber()+"\n"+
                                        "Number of seats: "+room.getNumberOfSeats()+"Room type: Biology Lab");
                            }
                        }else{
                            Util.display("There is no room available with this requirements");
                            break;
                        }
                    }
                }
                break;
            case "5":
                requiredSeatNumbers = Util.getInputInt("How many seats do you need?");
                for(Room room: rooms){
                    if(room instanceof SpecialBoardRoom){
                        if(room.getNumberOfSeats()>=requiredSeatNumbers){
                            if(!room.isReserved()){
                                Util.display("Room Number: #"+room.getRoomNumber()+"\n"+
                                        "Number of seats: "+room.getNumberOfSeats()+" Room type: Fancy Board Room");
                            }
                        }else{
                            Util.display("There is no room available with this requirements");
                            break;
                        }
                    }
                }
                break;    
            default:
                System.out.println("Invalid option");

        }
    }
    
    /**
    * This method counts the total room number
    * @since 20190326
    * @author Ahsanul Hoque
    */
    public static int countTotalRooms(ArrayList<Room> rooms){
        return rooms.size();
    }
    
    /**
    * This method counts total computer room
    * @since 20190326
    * @author Ahsanul Hoque
    */
    private static int countComputerRoom(ArrayList<Room> rooms){
        int count = 0;
        for(Room room: rooms){
            if(room instanceof ComputerRoom){
                count++;
            }
        }
        return count;
    }
    /**
    * This method counts the total biology lab
    * @since 20190326
    * @author Ahsanul Hoque
    */
    private static int countBiologyLab(ArrayList<Room> rooms){
        int count = 0;
        for(Room room: rooms){
            if(room instanceof BiologyLab){
                count++;
            }
        }
        return count;
    }
    
    /**
    * This method counts total board rooms
    * @since 20190326
    * @author Ahsanul Hoque
    */
    private static int countBoardRoom(ArrayList<Room> rooms){
        int count = 0;
        for(Room room: rooms){
            if(room instanceof BoardRoom && !(room instanceof SpecialBoardRoom)){
                count++;
            }
        }
        return count;
    }
    /**
    * This method counts special board rooms
    * @since 20190326
    * @author Ahsanul Hoque
    */
    private static int countSpecialBoardRoom(ArrayList<Room> rooms){
        int count = 0;
        for(Room room: rooms){
            if(room instanceof SpecialBoardRoom){
                count++;
            }
        }
        return count;
    }
    
    /**
    * This method tracks largest room and display to the user
    * @since 20190326
    * @author Ahsanul Hoque
    */
    private static void trackLargestRoomAndDisplayInfo(ArrayList<Room> rooms){
        int roomsWithHighestSeats = 0;
        for(Room currentRoom: rooms){
            if(roomsWithHighestSeats<currentRoom.getNumberOfSeats()){
                roomsWithHighestSeats = currentRoom.getNumberOfSeats();
            }
        }
        Util.display("Largest Room: Room#"+findRoomsOfHighestSeats(roomsWithHighestSeats,rooms)+ " with " + roomsWithHighestSeats + " seats.");
    }
    
    /**
    * This method finds the room with highest seats
    * @since 20190326
    * @author Ahsanul Hoque
    */
    private static String findRoomsOfHighestSeats(int highestSeats, ArrayList<Room> rooms){
        
        ArrayList<Integer> roomNumber = new ArrayList<>();
        String roomsWithHigestSeats = "";
        for(Room current: rooms){
            if(current.getNumberOfSeats()==highestSeats){
                roomNumber.add(current.getRoomNumber());
            }
        }
        if(roomNumber.size()>1){
           for(int i=0;i<roomNumber.size(); i++){
               if(i==(roomNumber.size()-1)){
                   roomsWithHigestSeats += roomNumber.get(i);
               }else{
                   roomsWithHigestSeats += roomNumber.get(i)+" and ";
               }
            } 
        }else{
            roomsWithHigestSeats = ""+roomNumber.get(roomNumber.size()-1);
        }
        return roomsWithHigestSeats;
    }
}