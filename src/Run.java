// Q1 - Consider a scenario where bank is class that provides funcctionality to get rate of interest , however the rate of interest varies according 
// to bank .
class Bank {
	
	void getRateOfInterest() {
		
		System.out.println("Universal Interest rate is 5 % ") ; 
	}
}

class SBI extends Bank{
	
void getRateOfInterest() {
		
		System.out.println("Interest rate is 8 % ") ; 
	}
}

class ICICI extends Bank{
	
void getRateOfInterest() {
		
		System.out.println("Interest rate is 7 % ") ; 
	}
}

class AXIS extends Bank{
	
void getRateOfInterest() {
		
		System.out.println("Interest rate is 9% ") ; 
	}
}

public class Run{
	
	public static void main(String[] args) {
		SBI s = new SBI();
		s.getRateOfInterest();
		ICICI i = new ICICI();
		i.getRateOfInterest();
		AXIS a = new AXIS();
		a.getRateOfInterest();
	}
}
