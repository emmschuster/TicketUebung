public class SubKonzert extends Ticket{

	private final int ANZTICKETS = 1000;
	private final int KOSTENALGEMEIN = 1200;
	private final double MWST=0.2;
	private final double BANDKOSTEN=700;
	private String vort,vname;
	private int bp;

	public SubKonzert(String ort, String name, int preis) {
		super(ort, name, preis);
		vort=ort;
		vname=name;
		bp=preis;
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((getBasispreis()+KOSTENALGEMEIN+BANDKOSTEN+bp)/ANZTICKETS)*MWST; 		
		return ticketpreis;
	}

	public void ausgabe() {
		System.out.println("Name der Veranstaltung : " + vname);
		System.out.println("Ort : " + vort);
		System.out.println("Preis eines Tickets : " + this.ticketpreis);
	}
}
