Instruction:

The topic for the assignments in CIS2232 will be to create an OJT reflection application.  This will allow you apply the concepts to a familiar business need.  The program should be submitted in your assignments Bitbucket repository in a folder called Assignment1.

Business Requirement 1 (Menu option A):

When the user selects ‘A’ (for Add) - allow the user to enter the student id, name, and reflection text.  No validation is required and the user can be expected to enter the right values.  An object oriented solution is expected.  An OjtReflection class should be used to contain the attributes.

When all the entries are added to an ArrayList<OjtReflection> the details should be written to a file (c:\cis2232\reflection.json).  This can happen when the user exits the program.  Each field should be separated by a comma and written to the file on a line per reflection.  (Note:  if you prefer to use json instead of comma separated...that's fine too!)

Business Requirement 2:

When the program starts, if the file created above exists it should be used to load the ArrayList<OjtReflection>.  This will eliminate the need for the program to prompt for the attributes each time the program is run.  

Business Requirement 3 (Menu option S):

Show all of the reflections details to the console.  As well at the top (before the list of reflections), it should show the total number of reflections (a count of all of the reflections).  

Business Requirement 4 (Menu option U):

Allow the user to update the reflection for a student in the ArrayList created above.  After updating, show all the reflections again to the user.
