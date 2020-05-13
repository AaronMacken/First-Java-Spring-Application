package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		Coach alphaCoach = context.getBean("baseballCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object" + result);
		
		System.out.println("\nMemory location for theCoach" + theCoach);
		System.out.println("\nMemory location for theCoach" + alphaCoach);
		
		// close the context
		context.close();
	}

}
