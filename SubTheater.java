public class SubTheater extends Ticket{
	private final int ANZTICKETS = 1000;
	private final int KOSTENALGEMEIN = 1200;
	private final double MWST=0.2;
	private final double ACTORKOSTEN=1500;
	public int vorstellungssaal;


	public SubTheater(String ort, String name, int preis, int saal) {
		super(ort, name, preis);
		vorstellungssaal=saal;
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((getBasispreis()+KOSTENALGEMEIN+ACTORKOSTEN)/ANZTICKETS)*MWST;
		return ticketpreis;
	}
}
