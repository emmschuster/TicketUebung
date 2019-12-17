public class SubTheater extends Ticket{
	private final int ANZTICKETS = 1000;
	private int kostenallgemein;
	private final double MWST=0.2;
	private final double ACTORKOSTEN=1500;
	public int vorstellungssaal;


	public SubTheater(String ort, String name, int preis, int saal) {
		super(ort, name, preis);
		kostenallgemein=preis;
		vorstellungssaal=saal;
		ausgabe();
		System.out.println("Die Vorsteööung befindet sich im Saal "+saal);
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((kostenallgemein+ACTORKOSTEN)/ANZTICKETS)*MWST;
		return ticketpreis;
	}
}
