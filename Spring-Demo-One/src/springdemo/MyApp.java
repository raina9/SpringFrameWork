package springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the object
     /**
      * still our GDWkout() is available only for one class 
      */
		BaseBallCoach theCoach1 = new BaseBallCoach();
       // use the object
	/**
	 * interface required that contains GDWkout() method for every class 	
	 */
        Coach theCoach2 = new BaseBallCoach();
        Coach theCoach = new TrackCoach();
        System.out.println("for the class"+" "+theCoach1.getDailyWorkOut());
		System.out.println("Interface"+" "+theCoach2.getDailyWorkOut());
		System.out.println("for class baseball"+" "+theCoach.getDailyWorkOut());
	
	}

}
