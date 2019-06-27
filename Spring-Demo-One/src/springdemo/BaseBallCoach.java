package springdemo;

//public class BaseBallCoach {
     /**
      * to use the method our class must implement the interface
      */
public class BaseBallCoach implements Coach{
/**
 * @override provide implementation
 */
	public String getDailyWorkOut()
   {
	   return "Spent 30 min on Batting";
   }
}
