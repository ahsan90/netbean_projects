-----------------:Problem Description:------------------
--------------------------------------------------------

There is starting code required for this problem. This program provides an object oriented solution with inheritance for a college room booking system.  

Requirement#1:
--------------
Modify the classes so that a custom constructor that accepts only the room number as a parameter is used to create the Room class and any derived classes of Room.  This constructor should accept ONLY the room number as a parameter.  
The existing setter for the room number should be removed.
NOTE that the default constructors can also be deleted from all the classes as the constructor created above should now be used.


Requirement#2:
--------------
Create a class called RoomUtility.  Create a static method in this class which will provide the output in Figure 1.  This method should accept the rooms ArrayList from the main method when option 5 is chosen.  It should not access anything from outside the class and should only accept the ArrayList as a parameter!  The largest room can be any type of room, but the user of the report wants to see the largest room in terms of number of seats.  The exit option should always be the last option - so if you add an option the exit may have to be changed.  

Note:  The numbers below represent the number of rooms of each type.

Figure 1
Room Count Details Report

Room:                    5

Computer Room:    		 2

Biology Lab:           	 1

Board Room:          	 3


Largest Room:  Room#301 and 601 and 701 with 80 seats

Requirement#3:
--------------
For Option 6 in the menu:

In the RoomUtility class, create a method which will allow the user to search for a room that meets their needs.  The method should accept the rooms Arraylist as a parameter.  The user should be prompted for the room type and number of seats.  The method should then display all of the rooms that meet the criteria (Room type and at least the number of seats) and that are available

 

Requirement#4:
--------------
The college has indicated that they have a special type of boardroom.  This type of room has everything that a boardroom has but also could have a number of Lazy Boy Recliners and could have a coffee maker.  Make the program work with this type of room (without modifying the BoardRoom class). 
