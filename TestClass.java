package chapter3;

public class TestClass {
	
	private static Bird bird = new Bird("Tocoro", "Cuba");
	private Bird bird1 = new Bird();
	
	public static void main(String [] args) {
		TestClass testClass = new TestClass();
		/**
		System.out.println("Default static variables values of Bird's instance");
		System.out.println(Bird.birdInstancesCount)	;
		
		System.out.println("Default instance variables values of Bird's instance");
		System.out.println("Bird name: " + bird.getBirdName())	;
		System.out.println("Bird country: " + bird.getBirdCountry());
		System.out.println("This bird fly?: " + bird.getIsFlying());
		System.out.println("TestClass static variable value: " + TestClass.bird);
		System.out.println("");
		System.out.println("");		
		
		// Initializing the second bird
		testClass.bird1.setBirdName("Paloma");
		testClass.bird1.setBirdCountry("Cuba");
		testClass.bird1.setIsFlying(true);
		
		// Assigning values to the members of first Bird using the second bird
		bird.setBirdName(testClass.bird1.getBirdName());
		bird.setBirdCountry(testClass.bird1.getBirdCountry());
		bird.setIsFlying(testClass.bird1.getIsFlying());
		
		System.out.println("Displaying the values of the members of both the Bird objects:");
		System.out.println("static bird istance (bird):");
		System.out.println("Bird name: " + bird.getBirdName())	;
		System.out.println("Bird country: " + bird.getBirdCountry());
		System.out.println("This bird fly?: " + bird.getIsFlying());		
		System.out.println("");
		System.out.println("");
		System.out.println("instance bird istance (bird1):");
		System.out.println("Bird name: " + testClass.bird1.getBirdName())	;
		System.out.println("Bird country: " + testClass.bird1.getBirdCountry());
		System.out.println("This bird fly?: " + testClass.bird1.getIsFlying());		*/
				
		testClass.bird1.setBirdName("Paloma");
		testClass.bird1.setBirdCountry("Cuba");
		testClass.bird1.setIsFlying(true);
				
		bird.fly();
		testClass.bird1.fly();
	}
}