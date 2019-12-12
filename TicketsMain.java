import java.util.Scanner;
public class TicketsMain {
	private static String x;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Für welche Veranstaltung entscheiden Sie sich?");
		System.out.println("k : Konzert");
		System.out.println("s : Sportveranstalung");
		System.out.println("t : Theater");
		x = sc.next();
		sc.close();
	}

}
