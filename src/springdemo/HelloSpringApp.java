package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theBaseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach theTrackCoach = context.getBean("trackCoach", Coach.class);
		Coach theMmaCoach = context.getBean("mmaCoach", Coach.class);
		Coach theBoxingCoach = context.getBean("boxingCoach", Coach.class);
		
		// call the methods on the bean
		System.out.println(theBaseballCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyWorkout());
		System.out.println(theMmaCoach.getDailyWorkout());
		System.out.println(theBoxingCoach.getDailyWorkout());
		// close the context
		context.close();
		
	}

}
