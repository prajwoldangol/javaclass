
public class ChildCall {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first child
		Inheritance1 i = new Child1(); //upcast
		Child1 c = (Child1) i ; // downcast
		c.single();
		c.married();
		c.firstChild();
		
		// seccond chld class
		i = new Child2();
		Child2 c2 = (Child2) i ;
		c2.SecondChild();
	}

}
