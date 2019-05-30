-------------------Problem Description:------------------
---------------------------------------------------------

Arrays to create a bowling alley scorekeeping program


Background:    
You have been asked to create a program to score a bowling game.  Arrays are to be used. The program should use prompts as specified in these requirements.   System.in and System.out should be used (not gui JOptionPane).  An object oriented solution should be attempted.

Requirement 1:  
Using a one dimensional String array.  When the program starts is should prompt the user for the names of the players.  It should store the names in a one dimensional array.  There can be at most four players (should be stored in a constant).  The prompt should be:  “Enter player#1 name:” and then repeat with the correct player number until all four are entered.



Requirement 2:
Using a two dimensional int array.  Once the user has entered the four player names it should then start prompting for scores for the players.  There are 10 ends in a bowling game (should be stored in a constant).  The program should use the players name from requirement 1 to prompt for the next score (Text should read:  Enter score for John:).  The program should loop through each player for end 1, then end 2, continuing until end 10.  To be clear, the scores for all four players should be entered for end 1 before starting to prompt for end 2.  



Requirement 3:
After each player score is entered, the program should provide a summary of the current scores.  This should be accomplished by passing the array to a method and have the method display the results.  This should precede the prompt for the next score.  (note: if the array and the functionality is in the same class (by your design), you do not have to pass the array to the method).



Requirement 4:  
At the end of the scores (ie after all 40 scores are entered), the program should show all of the final scores and add an extra line declaring the winner.  The winner declaration should state:  “Congratulations John”  (if John was the winner).

Sample i/o to be used when getting scored from user:

Current Score

Joe         5  12  15                             |  32

Steve       8  17                                 |  25

Bob        15  12                                 |  27

Brian      11  12                                 |  23

Enter score for Steve -->