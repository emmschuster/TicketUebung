import java.util.Scanner;
public class TicketsMain {
	private static int x;
	public static void main(String[] args) {
		einlesen();
//		SubKonzert t=new SubKonzert("Prag","5FDP",4);
//		System.out.println(t);
	}
	private static void einlesen() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Für welche Veranstaltung entscheiden Sie sich?");
		System.out.println("1 : Konzert");
		System.out.println("2 : Sportveranstalung");
		System.out.println("3 : Theater");
		x=sc.nextInt();
		switch(x) {
		case 1: 
			break;
		case 2: break;
		case 3: break;
		}
		sc.close();		
	}

}
