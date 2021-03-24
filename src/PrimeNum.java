// Q9 - Write a program to print first 1000 prime numbers.
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numCheck();
	}

	static void numCheck() {
		String prime = " " ;
		for(int j = 1 ; j<=1000; j++) {
			//check if j is prime
			boolean flag = true;
			if(j==1) {
				continue;
			}
			//enters when j = 4 since 2,3 are prime
			//check each j by increasing value of i until condition is met
			for(int i = 2 ; i <= j/2; i++) {
				//System.out.println(i + "  is to " + j);
				// if remainder is zero . j is not a prime number and break the inner for loop
				if( j % i == 0 ) {
					flag = false ; 
					break ; 
				}
			}
			
			if( flag ) {
				
				prime = prime + j + " ";
			}

		}
		System.out.println(prime);
	}

}
