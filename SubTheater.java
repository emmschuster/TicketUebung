public class SubTheater extends Ticket{
	private final int ANZTICKETS = 1000;
	private double kostenallgemein;
	private final double MWST=0.2;
	private final double ACTORKOSTEN=1500;
	public int vorstellungssaal;
	private double ticketpreis;


	public SubTheater(String ort, String name, double preis) {
		super(ort, name, preis);
		kostenallgemein=preis;
		System.out.println("Theater");
		System.out.println("=======");
		ausgabe();
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((kostenallgemein+ACTORKOSTEN)/ANZTICKETS)*MWST*100;
		return Math.round(ticketpreis);
	}
	
	public double getPreis() {
		return ticketpreis;
	}
}
