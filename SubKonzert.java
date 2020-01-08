public class SubKonzert extends Ticket{

	private final int ANZTICKETS = 1000;
	private double kostenallgemein;
	private final double MWST=0.2;
	private final double BANDKOSTEN=700; 

	public SubKonzert(String ort, String name, double preis) {
		super(ort, name, preis);
		kostenallgemein=preis;
		System.out.println("Konzert");
		System.out.println("=======");
		berechneTicketpreis();
		ausgabe();
	}
	
	public void berechneTicketpreis() {
		setTicketPrice(Math.round(((kostenallgemein+BANDKOSTEN)/ANZTICKETS)*MWST*100));
	}
}
