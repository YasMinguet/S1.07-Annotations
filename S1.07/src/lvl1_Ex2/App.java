package lvl1_Ex2;

public class App {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Hotel h1=new Hotel("Melià",20,3310,545);
		Hospital hos1=new Hospital("Bellvitge",8,9054,1050);
		Cinema c1=new Cinema("Balanyà",1,4520,1600);
		System.out.println(h1.dameNom()+" "+hos1.dameNom()+" "+c1.dameNom());

	}

}
