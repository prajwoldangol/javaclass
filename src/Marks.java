import java.util.Scanner ;
import java.util.Arrays;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stdMarks = new int[50];
		int sorter = 1 ;
		//int[] sortedArray = new int[5];
		Scanner number = new Scanner(System.in);
		System.out.println("----- Enter Student Marks ---- " ) ;
		for( int i = 0 ; i < 50 ; i ++ ) {
			
			int num = number.nextInt();
			
			stdMarks[i] = num ; 
		}
		number.close();
		
		// loop through the array by checking two numbers
		for( int j = 0 ; j < 50 ; j++) {
			
			for( int n = j+1 ; n<50 ; n++) {
				// if stdMarks[0] < stdMarks[1]
				if( stdMarks[j] < stdMarks[n] ) {
					// set the sorter value with lower value
					sorter = stdMarks[j];
					// set the larger value to current value
					stdMarks[j] = stdMarks[n];
					// swap lower value to larger
					stdMarks[n] = sorter ; 
				}
			}
			
			
		}
		
		System.out.println(Arrays.toString(stdMarks)) ;
		
	}
	

}
