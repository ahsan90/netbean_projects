--------------:Problem Description:---------------

You have been hired to create a program for Ham’s Blueberry Patch.  The business wants a program to help them with the tracking of their daily blueberry picking.  They have workers which pick blueberries in the morning and come with all of the boxes that they’ve picked for the day at the end of the day.  The program should run throughout the morning.  As each picker finished for the day, the program should provide the following functionality:

Part 1
Ensure that the user can continually enter new picker’s details.  They can enter an ‘X’ instead of the picker’s name to indicate that they would like to exit.  Prompt them for their name in a JOptionPane input dialog and then the number of boxes in a JOptionPane input dialog box.

Part 2
The number of boxes must be between 1 and 50 (inclusive).  If the user enters an invalid number of boxes, they should be re-prompted.

Part 3
Have the program pass the name and number of boxes to a method called processNewPicker.  This should have a void return type and accept the name and number of boxes as parameters.  The processNewPicker method should provide the following functionality:

3A) The program will track number of pickers for the day.

3B) The program will track the total number of boxes picked for the day.

3C) The program will track the picker that picks the most boxes for the day.

3D) The program will provide the average number of boxes for the day.

 

Part 4
The program should provide the following information to the user once “X” is entered.  

The total number of boxes picked that day

The name of the person that picked the most boxes that day (dont forget ties)

The average number of boxes picked that day.

NOTE:  this should be provided as a method called displayPickerReport which is invoked when “X” is entered as the name.  

 

Example of the results to be displayed:


Ham’s Blueberry Patch

Daily Summary


Number of pickers:  3

Total boxes:  32

Most productive picker:  John Smith and Bob Smith

Average boxes picked:  10

 

Note:  the average boxes picked can be integer or float

The name of the business should be contained in a constant which is used to create the output.  The name of the business is "Ham's Blueberry Patch".