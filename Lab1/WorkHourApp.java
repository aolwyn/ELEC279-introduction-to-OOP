
public class WorkHourApp {

	public static void main(String[] args) {

		//initialize variables 
		int hoursPerDay = 3; //hours per day the friend works 
	
		int numDays = 5; //total number of days a week the friend works
		
		int total = 0; //integer to be used later (for running total)
		
		int dayNumber = 0; //integer variable for counting which day of the week the friend is on
		
		for( dayNumber = 1; dayNumber <= numDays; dayNumber++) {
			System.out.print("at the end of day " +dayNumber); //print off what day # they're on (@ end of day)
			System.out.println(", your friend has worked this many hours so far: " +(dayNumber*hoursPerDay)); //print number of hours worked so far
			total = dayNumber * hoursPerDay; //running total of all the hours they've worked
		}
			System.out.print("in total, your friend worked "+total ); //at the end of the week, tell the friend how many hours they've worked
		    System.out.print(" this week.");
	}

}
