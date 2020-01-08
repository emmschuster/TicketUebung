public class SubKonzert extends Ticket{

	private final int ANZTICKETS = 1000;
	private double kostenallgemein;
	private final double MWST=0.2;
	private final double BANDKOSTEN=700;
	private double ticketpreis;
 

	public SubKonzert(String ort, String name, double preis) {
		super(ort, name, preis);
		kostenallgemein=preis;
		System.out.println("Konzert");
		System.out.println("=======");
		ausgabe();
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((kostenallgemein+BANDKOSTEN)/ANZTICKETS)*MWST*100; 		
		return Math.round(ticketpreis);
	}
	
	public double getPreisKonzert() {
		return ticketpreis;
	}
	
	public double getPreis() {
		return ticketpreis;
	}
}
