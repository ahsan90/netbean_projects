------------:Problem Description:-----------------
--------------------------------------------------


Create a class named HotelRoom that includes an integer field for the room number and a double field for the nightly rental rate. Include get methods for these fields and a constructor that requires an integer argument representing the room number. The constructor sets the room rate based on the room number; rooms numbered 299 and below are $69.95 per night, and others are $89.95 per night.

Create an extended class named Suite which is derived from HotelRoom whose constructor requires a room number and uses inheritance to add a $40 surcharge to the regular hotel room rate, which again is based on the room number.

Modify the application named UseHotelRoom that provides a menu to allow the user to creates an object of each class. Each object that is created should be added to the ArrayList<HotelRoom> and the option C should be implemented to show all of the rooms created.