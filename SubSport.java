public class SubSport extends Ticket{
	private final int ANZTICKETS = 1000;
	private final int KOSTENALGEMEIN = 1200;
	private final double MWST=0.2;
	private final double MANNSCHAFTKOSTEN=1000;
	private String vort,vname;


	public SubSport(String ort, String name, int preis) {
		super(ort, name, preis);
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((getBasispreis()+KOSTENALGEMEIN+MANNSCHAFTKOSTEN)/ANZTICKETS)*MWST; 	
		return ticketpreis;
	}
	
	public void ausgabe() {
		System.out.println("Name der Veranstaltung : " + vname);
		System.out.println("Ort : " + vort);
		System.out.println("Preis eines Tickets : " + this.ticketpreis);
	}
}
