package lvl1_Ex2;

public class Hospital extends Building {
	
	private int bed;

	public Hospital (String name, int numFloors, int surface, int bed) {
		super(name, numFloors, surface);
		this.bed = bed;
	}
	
	@Deprecated
	public String dameNom() {
		
		return name;
	}

	public int getRoom() {
		return bed;
	}

	public void setRoom(int bed) {
		this.bed = bed;
	}

	@Override
	public String toString() {

		return "L'hospital " + name + " té una superficie de " + surface + "m2 i " + numFloors + " plantes" + "\nTé un total de " + bed + " llits.";
	}

}
