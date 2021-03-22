// Q1 What is the difference between overloading and overriding  with help of example

// Overloading is acccomplished by writing same method name multiple times with different parameter number and type of parameter. It's done 
// inside the same class . Consider the example below

// Oveririding is accomplished by re writing the same method from parent class in child class.
public class OverLoading {

	void load() {
		
		System.out.println(" I am Loading nothing just empty parameter") ;
	}
	
	void load(String name ) {
		
		System.out.println( "I am loading a parameter " + name ) ;
	}
	 // this method will be overwritten in child class OverRiding.java
	void overRide() {
		
		System.out.println(" I am parent method overRide") ;
	}
}
