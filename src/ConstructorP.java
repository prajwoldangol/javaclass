// Q3 - When a class inherits another class does the costructor of parent class gets called when we create object of child class.

// Yes parent constructor gets called when creating object of class. If we create child class and use child constructor we can still acccess 
//parent constructor using super keyword.

public class ConstructorP {
	//parent constructor
	ConstructorP(){
		
		System.out.println(" I am parent constructor ") ;
	}
}
