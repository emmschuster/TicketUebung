public class SubKonzert extends Ticket{

	private final int ANZTICKETS = 1000;
	private int kostenallgemein;
	private final double MWST=0.2;
	private final double BANDKOSTEN=700;
	private int anzBands;


	public SubKonzert(String ort, String name, int preis, int bands) {
		super(ort, name, preis);
		kostenallgemein=preis;
		anzBands=bands;
		ausgabe();
		System.out.println("Es spielen "+anzBands+" Bands an diesem Abend");
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((kostenallgemein+BANDKOSTEN)/ANZTICKETS)*MWST; 		
		return ticketpreis;
	}
}
