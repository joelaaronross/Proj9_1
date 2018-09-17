public abstract class Animal implements Countable {

	// My Instance variable
	private int counter;

	// My getters and setters
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	
	@Override
	public String toString() {
		return "Animal [count=" + counter + "]";
	}
}