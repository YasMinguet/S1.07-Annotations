package lvl1_Ex2;

public class Cinema extends Building {

	private int capacity;

	public Cinema(String name, int numFloors, int surface, int capacity) {
		super(name, numFloors, surface);
		this.capacity = capacity;
	}

	@Deprecated
	public String dameNom() {
		
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {

		return super.toString() + "\nEl seu aforament es de " + capacity + "m2.";
	}

}
