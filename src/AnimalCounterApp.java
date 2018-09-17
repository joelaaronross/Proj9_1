
public class AnimalCounterApp {

	public static void main(String[] args) {

		//Counts the Alligators
		System.out.println("Counting Alligators...");
		Alligator a = new Alligator(); 
		count(a, 3); 		
		System.out.println();
		
		
		//Counts the Sheep
		System.out.println("Counting Sheep...");
		Sheep s1 = new Sheep("Blackie");
		count(s1, 2);

		
		
		System.out.println();
		// counting sheep
		Sheep s2 = null;
		try {
			s2 = (Sheep) s1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Error!");
		}
		s2.setName("Dolly");
		count(s2, 3);
		System.out.println();
		count(s1, 1);
	}

	
	
	public static void count(Countable c, int maxCount) { // method

		while (maxCount > 0) {
			maxCount -= 1;
			c.incrementCount();
			System.out.println(c.getCountString());
		}
		c.resetCount();
	}

	{
		System.out.println("Goodbye! Ya'll come back now!");
	}

}