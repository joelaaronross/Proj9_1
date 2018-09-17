
public class Sheep extends Animal implements Cloneable {

	// My Instance variable
	private String name;

	// My constructor
	public Sheep(String name) {
		this.name = name;
	}

	// My getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + "]";
	}

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
		return getCount() + " " + name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}