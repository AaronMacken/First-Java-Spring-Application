package springdemo;

public class PowerCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;

	// default no arg constructor
	public PowerCoach() {
		System.out.println("Power Coach - default constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Power Coach - setter");
		this.fortuneService = fortuneService;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Power Coach - setting email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Power Coach - setting team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "5x5 Good buddy!";
	}

	@Override
	public String getDailyFortune() {
		return "Power Coach says: " + fortuneService.getFortune();
	}

}
