package chapter3;

public class Bird {
	public static int birdInstancesCount = 0;
	
	private String birdName;
	private String birdCountry;
	private boolean isFlying;
	
	public Bird() {
		Bird.birdInstancesCount++;
	}
	
	public Bird(String birdName, String birdCountry) {
		this.setBirdName(birdName);
		this.setBirdCountry(birdCountry);
		Bird.birdInstancesCount++;
	}
	
	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}
	
	public String getBirdName() {
		return this.birdName;
	}	
	
	public void setBirdCountry(String birdCountry) {
		this.birdCountry = birdCountry;
	}
	
	public String getBirdCountry() {
		return this.birdCountry;
	}	
	
	public void setIsFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}	
	
	public boolean getIsFlying() {
		return this.isFlying;
	}

	public void fly() {
		System.out.println("Bird name: " + this.getBirdName())	;
		System.out.println("Bird country: " + this.getBirdCountry());
		System.out.println("This bird fly?: " + this.getIsFlying());
		System.out.println(Bird.birdInstancesCount);
	}	
}