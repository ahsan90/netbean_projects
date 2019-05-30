--------------:Problem Description:---------------
--------------------------------------------------

Hockey Tracker Application:

Create a HockeyPlayer class.  This class must have an array which holds the goals that the player scored in each game.  It must also have an array which holds the opponent team name.  There is a ten game season.  The class should also have a name and player number attribute.  


* The default constructor should prompt for the name and player number.  The default constructor should initialize the number of goals to -1.  This is used to indicate that the number of goals has not been specified.  


* create an instance addGameDetails method which returns void.  This method should prompt for the game number, opponent name, and number of goals scored by the player.  Array should be updated appropriately.


* The toString method should return player details as shown in the table below.


Table:  Player details
#9 Will MacLean
Game details:
Game 1:  Morell 2 goals
Game 3:  Souris 0 goals
Game 4:  Montague  4 goal
Total games:  3
Total goals:  6
	

Suggest completing up to here first before moving on to the next part.  It is important to have up to here working before moving on.  The following code can be used to test the HockeyPlayer class functionality.


        
	HockeyPlayer p1 = new HockeyPlayer();
	p1.addGameDetails();
	System.out.println(p1.toString());
        


NEXT PART


Create a HockeyMain class which has a player array.  There are 12 players on the team.  Their numbers are from 1-12.  Provide a menu which continues until they enter x.


Hockey Tracker
A-Add player 
G-Add game details
S-Show players
X-Exit
	

* When A is chosen a new player should be added.  Remember their numbers are 1 to 12 and this should be used to determine their index in the array.Note that is good to create the hockey player instance and then use the player number from the object to determine where to put the player in the array.
* When G is chosen prompt the user for the player number to determine the correct index and then the addGameDetails from that instance should be invoked.  
* When S is chosen any players that have been added should be shown. 
