package springdemo;

public class BoxingCoach implements Coach {
	
	private FortuneService fortuneService;
	
    // default no-arg constructor so class in MyApp doesn't break
	public BoxingCoach() {
		
	}

	public BoxingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 50 jabs";
	}

	@Override
	public String getDailyFortune() {
		return "Boxing coach says: " + fortuneService.getFortune();
	}
	
//	add init method
	public void doMyStartupStuff() {
		System.out.println("Boxing Coach: Doing start up stuff");
	}
	
//	add destroy method
	public void doMyDestroyStuff() {
		System.out.println("Boxing Coach: Doing clean up stuff");
	}

}
