
// Q4 - What are static variable and how they are different from instance variable .
// Static variable are created when class is loaded before creation of object. Can be accesed without creating object.
// Instance variable are created when a class is instantiated / objecct is created
public class StaticV {
	int num = 1;
	static int sNum = 9 ;
	public static void main(String[] args) {
		// creating objecct
		
		StaticV s = new StaticV();
		
		System.out.println(" I am Instance var " + s.num ) ;
		System.out.println(" I am Static Var " + StaticV.sNum) ;
		
	}

}
