package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from container
		Coach theCoach = context.getBean("boxingCoach", Coach.class);
		
		// close the context
		context.close();
	}

}
