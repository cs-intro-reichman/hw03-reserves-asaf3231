/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar{	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	 
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		int givenyear = Integer.parseInt(args[0]);
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
		int debugDaysCounter = 0 ; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition
		while (year < givenyear ) {
			//// Write the body of the while
			debugDaysCounter++; 
			advance();
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)	 			
		} 
		while ( year == givenyear ){
			
			debugDaysCounter++; 
			advance();
			if( year > givenyear){
				break ; 
			}
			if  ( dayOfWeek == 1){
				System.out.println(dayOfMonth + "/" + month + "/" + year + " sunday");
			} else {
				System.out.println(dayOfMonth + "/" + month + "/" + year) ; 
			}
			
		}
		dayOfWeek = 2 ; // set after 1 running
		//System.out.println(debugDaysCounter);
	}
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
			dayOfWeek++ ; 
			if ( dayOfWeek > 7){
				dayOfWeek = 1 ;
			}
			dayOfMonth++ ;	
			if (dayOfMonth > nDaysInMonth(month, year)){
				dayOfMonth =1 ; month ++ ;

				if (month == 13) {
					month = 1 ; year ++ ; 
				}
			}		
			if ( dayOfWeek > 8){
				dayOfWeek = 1 ;
			}
	} 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear = false ; 
		
		isLeapYear = ((year % 400) == 0);

		if ( isLeapYear)
			return isLeapYear; 

		else {
			isLeapYear = ((((year % 4) == 0) && ((year % 100) != 0)));
			return isLeapYear ; 
		}	
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int monthnumber = 0 ;
		
		// common year
		if (!isLeapYear(year)) {
			switch (month) {
				case 1:  monthnumber = 31 ;
						break;
				case 2:  monthnumber = 28 ;
						break;
				case 3:  monthnumber = 31 ; 
						break;
				case 4:  monthnumber = 30 ;
						break;
				case 5:  monthnumber = 31 ;
						break;
				case 6:  monthnumber = 30 ;
						break;
				case 7:  monthnumber = 31 ;
						break;
				case 8:  monthnumber = 31 ;
						break;
				case 9:  monthnumber = 30 ;
						break;
				case 10: monthnumber = 31 ;
						break;
				case 11: monthnumber = 30 ;
						break;
				case 12: monthnumber = 31 ;
						break;
			}
			
			return monthnumber ;

		} else { // leep year
			switch (month) {
				case 1:  monthnumber = 31 ;
						break;
				case 2:  monthnumber = 29 ;
						break;
				case 3:  monthnumber = 31 ; 
						break;
				case 4:  monthnumber = 30 ;
						break;
				case 5:  monthnumber = 31 ;
						break;
				case 6:  monthnumber = 30 ;
						break;
				case 7:  monthnumber = 31 ;
						break;
				case 8:  monthnumber = 31 ;
						break;
				case 9:  monthnumber = 30 ;
						break;
				case 10: monthnumber = 31 ;
						break;
				case 11: monthnumber = 30 ;
						break;
				case 12: monthnumber = 31 ;
						break;
			}

			return monthnumber ;
		}
	}	
}
