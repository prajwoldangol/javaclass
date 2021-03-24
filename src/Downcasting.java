
public class Downcasting extends Upcasting {

	public static void main(String[] args) {

		//upcasting
		Upcasting u = new Downcasting();
		u.runParent();
		u.runAgain();
		
		// trying to access child method like in line below gives error
		// u.childRun();
		
		
		// downcasting
		Downcasting d = (Downcasting) u ;
		d.childRun();
		d.runAgain();
		d.runParent();

	}

	void childRun() {

		System.out.println(" I am child run ") ;
	}
	void runAgain() {
		System.out.println(" I am running again from child ") ;
	}

}
