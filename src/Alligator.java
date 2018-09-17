public class Alligator extends Animal {

	public Alligator() {

	}

	
	//Adds 1 to Alligator then getters/setters
	@Override
	public void incrementCount() {
		setCounter(getCount() + 1); 
	}

	@Override
	public void resetCount() {
		setCounter(0);

	}

	public int getCount() {
		return getCounter();
	}

	@Override
	public String getCountString() {
		return getCount() + "Alligator";
	}

}