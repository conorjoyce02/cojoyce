/*
 * 4. Provide front interface enabling selection between the above features or an option to exit
the programme, and enabling required user input. It does not matter if this is command-line
or graphical UI, as long as functionality/error checking is provided.
You are required to provide error checking and show appropriate messages in the case of erroneous
inputs – eg bus stop doesn’t exist, wrong format for time for bus stop (eg letters instead of
numbers), no route possible etc. 
 */
public class FrontInterface {

	System.out.println("Welcome to the Vancouver Bus System. Please choose an option to proceed.");
	//make this into a joption pane
	System.out.println("Enter A if you would like for the system to search for the shortest path between 2 bus stops");
	System.out.println("Enter B if you would like for the system to search for a specific bus stop");
	System.out.println("Enter C if you would like for the system to search all trips in a given arrival time (given certain criteria)");
	System.out.println("Enter D if you do not want to continue");
	
	//read in input
	//loop based on initial input
	//different searches/objects to be built based on which option they care about
	
	//if(userinput = A)....
	
}
