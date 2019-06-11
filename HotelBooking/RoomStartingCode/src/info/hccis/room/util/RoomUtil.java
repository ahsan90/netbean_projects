package info.hccis.room.util;

import info.hccis.room.bo.BoardRoom;
import info.hccis.room.bo.ComputerRoom;
import info.hccis.room.bo.Room;
import java.util.ArrayList;

/**
 *
 * @author bjmaclean
 */
public class RoomUtil {
    public static void createTestRooms(ArrayList<Room> rooms){
        rooms.add(new ComputerRoom(20,107, 24, false, true));
        rooms.add(new ComputerRoom(18,110, 18, false, true));
        rooms.add(new ComputerRoom(20,205, 24, false, true));
        rooms.add(new BoardRoom(true,15, 10, false, false));
        rooms.add(new Room(118, 28, false, false));
        rooms.add(new Room(124, 40, false, false));
    }
}
