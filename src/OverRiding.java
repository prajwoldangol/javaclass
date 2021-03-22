
public class OverRiding extends OverLoading {

	void overRide() {

		System.out.println(" I am Overriding From Child Class ") ;
	}
	void load() {

		System.out.println(" I am Loading nothing from child class ") ;
	}

	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		System.out.println(" --------------------------") ;
		System.out.println(" Method OverLoading") ;
		System.out.println(" --------------------------") ;
		ol.load();
		ol.overRide();
		ol.load("JAVA") ;
		//OverLoading o = new OverRiding();
		//OverRiding ov = (OverRiding) o ;
		System.out.println(" --------------------------") ;
		System.out.println(" Overriding load and overRide method") ;
		System.out.println(" --------------------------") ;
		OverRiding ov = new OverRiding();
		ov.load();
		ov.overRide();
		
	}

}
