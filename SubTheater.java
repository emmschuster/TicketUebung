public class SubTheater extends Ticket{
	private final int ANZTICKETS = 1000;
	private double kostenallgemein;
	private final double MWST=0.2;
	private final double ACTORKOSTEN=1500;
	public int vorstellungssaal;


	public SubTheater(String ort, String name, double preis) {
		super(ort, name, preis);
		kostenallgemein=preis;
		System.out.println("Theater");
		System.out.println("=======");
		berechneTicketpreis();
		ausgabe();
	}
	
	public void berechneTicketpreis() {
		setTicketPrice(Math.round(((kostenallgemein+ACTORKOSTEN)/ANZTICKETS)*MWST*100));
	}
	
}
