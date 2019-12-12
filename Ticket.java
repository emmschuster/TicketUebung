abstract class Ticket {
	private String veranstalungsort;
	private String veranstaungsname;
	private int basispreis;
	protected double ticketpreis;

	abstract void berechneTicketpreis();

	public void ausgabe() {
		System.out.println("Name der Veranstaltung : " + veranstaungsname);
		System.out.println("Ort : " + veranstalungsort);
		System.out.println("Preis eines Tickets : " + ticketpreis);
	}

	public int getBasispreis() {
		return basispreis;
	}
}

//
//}
//public void setBasispreis(int x) {
//	basispreis=x;

//- Veranstaltungsort
//- Veranstaltungsname
//- Basispreis
//- Ticketpreis

//public class Sportticket extends Ticket{
//	
//}