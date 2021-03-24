// Q8 - program to find leap years coming in next 100 years. 
import java.time.LocalDate ;
public class LeapYear {

	public static void main(String[] args) {
		String leapyears = " ";
		LocalDate date = LocalDate.now();
		// returns current year
		int year = date.getYear();
		for( int i = year ; i <= year+100 ; i++) {
			
			if( leap(i) ) {
				
				leapyears = leapyears + i + " ";
			}
			
		}
		System.out.println("Leap year in coming 100 years are " + leapyears);
	}
	
	static boolean leap( int leapyear ) {
		
		boolean  result = false ; // flag
		// leap year is every 4 year
		if(leapyear % 4 == 0 ) {
			
			// check for 00's year 
			
			if( leapyear % 100 == 0) {
				// 00 is leap if it's divisible by 400
				result = ( leapyear % 400 == 0 )? true : false ; 
			}else {
				// if it's not a 00 year and is divisible by 4
				result = true ; 
			}
			
		}
		
		return result;
	}

}
