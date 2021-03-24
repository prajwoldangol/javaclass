// Q5 - What is static method can we ccall static by ccreating objecct or by writing class name.

// Static method are defined using static keyword. Static method can be acccessed without creating objecct of a class.
public class StaticMethod {

	public static void main(String[] args) {
		// calling static method without creating object of class.
		staticTry();
	}
	
	static void staticTry() {
		
		System.out.println(" I am STatic Method ") ;
	}
}
