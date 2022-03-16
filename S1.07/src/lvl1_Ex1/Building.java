package lvl1_Ex1;

public class Building {
	protected String name;
	protected int numFloors;
	protected int surface;

	public Building(String name, int numFloors, int surface) {
		this.name = name;
		this.numFloors = numFloors;
		this.surface = surface;
	}

	public String getNom() {
		return name;
	}

	public int getNumPlantas() {
		return numFloors;
	}

	public double getSuperficie() {
		return surface;
	}

	public String toString() {
		return "L'edifici " + name + " té una superficie de " + surface + "m2 i " + numFloors + " plantes";
	}

}
