
-----------:Problem Description:----------------
================================================

The developers of a free online game named Sugar Smash have asked you to develop
a class named SugarSmashPlayer that holds data about a single player. The class
contains the following fields: the player’s integer ID number, a String screen name,
and an array of integers that stores the highest score achieved in each of 10 game
levels. Include get and set methods for each field. The get and set methods for
the scores should each require two parameters—one that represents the score achieved 
and one that represents the game level to be retrieved or assigned. Display
an error message if the user attempts to assign or retrieve a score from a level that
is out of range for the array of scores. Additionally, no level except the first one
should be set unless the user has earned at least 100 points at each previous level.
If a user tries to set a score for a level that is not yet available, issue an error
message. Create a class named PremiumSugarSmashPlayer that descends from
SugarSmashPlayer. This class is instantiated when a user pays $2.99 to have access to
40 additional levels of play. As in the free version of the game, a user cannot set a score
for a level unless the user has earned at least 100 points at all previous levels. Create a
program that instantiates several objects of each type and demonstrates the methods.
Save the files as SugarSmashPlayer.java, PremiumSugarSmashPlayer.java, and
DemoSugarSmash.java.

Cuortesy: Java Programming,
Author: Joyce Farrell,
Ch#10 (Introduction to Inheritance), Ex no: 5