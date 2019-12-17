public class SubKonzert extends Ticket{

	private final int ANZTICKETS = 1000;
	private final int KOSTENALGEMEIN = 1200;
	private final double MWST=0.2;
	private final double BANDKOSTEN=700;
	private int anzBands;


	public SubKonzert(String ort, String name, int preis, int bands) {
		super(ort, name, preis);
		anzBands=bands;
		System.out.println("Es spielen "+anzBands+" Bands an diesem Abend");
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((getBasispreis()+KOSTENALGEMEIN+BANDKOSTEN)/ANZTICKETS)*MWST; 		
		return ticketpreis;
	}
}
