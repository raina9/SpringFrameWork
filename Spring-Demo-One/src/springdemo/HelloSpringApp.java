package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load Spring Configurable File
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    
        //retrieve bean from Spring Container
	Coach theCoach = context.getBean("myCoach", Coach.class);
	    
	    //call method on the bean
	System.out.println(theCoach.getDailyWorkOut());
	    //close the context
	context.close();
	}

}
