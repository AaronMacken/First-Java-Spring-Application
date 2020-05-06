package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
//		load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrieve bean from spring container
		PowerCoach thePowerCoach = context.getBean("powerCoach", PowerCoach.class);
		
//		call methods
		System.out.println(thePowerCoach.getDailyWorkout());
		System.out.println(thePowerCoach.getDailyFortune());
		
//		methods for literals
		System.out.println(thePowerCoach.getEmail());
		System.out.println(thePowerCoach.getTeam());
//		close the context
		context.close();
	}

}
