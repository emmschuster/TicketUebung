import java.util.Scanner;
public class TicketsMain {
	private static int x;
	private static Ticket[] TicketsKaufen=new Ticket[5];
	public static void main(String[] args) {
		einlesen();
	}
	private static void einlesen() {
//		TicketsKaufen[0] = new SubKonzert("Muenchen", "PapaRoach ft BodyCout", 100, 2);
//		TicketsKaufen[1] = new SubKonzert("Dornbirn", "Eluveitie mit LacunsCoil und InfectedRain", 70, 3);
//		TicketsKaufen[2] = new SubSport("Innsbruck", "Weltmeisterschaft", 150, "FC Wattens", "FC Barcelona");
//		TicketsKaufen[3] = new SubTheater("Landestheater", "Caberet", 50, 3);
//		TicketsKaufen[4] = new SubTheater("Kammerspiele", "Ritter der Kokosnuss", 20, 1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Für welche Veranstaltung entscheiden Sie sich?");
		System.out.println("1 : Konzert 1");
		System.out.println("2 : Konzert 2");
		System.out.println("3 : Sportveranstalung");
		System.out.println("4 : Theater 1");
		System.out.println("5 : Theater 2");

		x=sc.nextInt();
		switch(x) {
		case 1: TicketsKaufen[0] = new SubKonzert("Muenchen", "PapaRoach ft BodyCout", 100, 2);
			break;
		case 2: TicketsKaufen[1] = new SubKonzert("Dornbirn", "Eluveitie mit LacunsCoil und InfectedRain", 70, 3);
			break;
		case 3: TicketsKaufen[2] = new SubSport("Innsbruck", "Weltmeisterschaft", 150, "FC Wattens", "FC Barcelona");
			break;
		case 4 : TicketsKaufen[3] = new SubTheater("Landestheater", "Caberet", 50, 3);
			break;
		case 5 : TicketsKaufen[4] = new SubTheater("Kammerspiele", "Ritter der Kokosnuss", 20, 1);
			break;
		}
		sc.close();		
	}
}