package lvl1_Ex1;

public class Hotel extends Building {

	private int room;

	public Hotel(String name, int numFloors, int surface, int room) {
		super(name, numFloors, surface);
		this.room = room;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	@Override
	public String toString() {

		return super.toString() + "\nTé un total de " + room + " habitacions.";
	}

}
