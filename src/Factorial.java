
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findIt(10) ;
	}

	static void findIt( int n ) {
		int fact = 1 ;
		String f = " " ;
		int temp = n ;
		for( int j = 1; j<=n ; j++ ) {

			for( int i = 1 ; i<=temp ; i++) {

				fact*= i ;
			}
			temp-- ;
			f = f + " " + Integer.toString(fact);
			// reset to 1
			fact = 1 ;
			//System.out.println(n);
		}
		
		System.out.println(f);
	}

}
