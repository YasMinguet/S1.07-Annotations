package lvl1_Ex2;

public class Building {
	protected String name;
	protected int numFloors;
	protected int surface;

	public Building(String name, int numFloors, int surface) {
		this.name = name;
		this.numFloors = numFloors;
		this.surface = surface;
	}

	public String getName() {
		return name;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public double getSurface() {
		return surface;
	}

	public String toString() {
		return "L'edifici " + name + " té una superficie de " + surface + "m2 i " + numFloors + " plantes";
	}

}
