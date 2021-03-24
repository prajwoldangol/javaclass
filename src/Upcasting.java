//Q6 - what is upccasting in context of upcasting can we access method whicch is only available in cchild class using reference to parent
// - upcasting is typeccasting of child objecct to parent object. We can access all parent class members but cannot acccess a child member which is 
// only available in child class. If child overrides a parent method , we can access updated method from child classs. 


//Q7 - what is downcasting why is it needed
// downcasting is typecasting parent object referencce to child class. Is is used to access new child methods not available in parent. 
public class Upcasting {
	
	void runParent() {
		
		System.out.println(" I am parent run ") ;
	}
	
	void runAgain() {
		System.out.println(" I am running again") ;
	}

}
