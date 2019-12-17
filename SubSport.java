public class SubSport extends Ticket{
	private final int ANZTICKETS = 1000;
	private int kostenallgemein;
	private final double MWST=0.2;
	private final double MANNSCHAFTKOSTEN=1000;
	public String team1, team2;

	public SubSport(String ort, String name, int preis, String mannsch1, String Mannsch2) {
		super(ort, name, preis);
		kostenallgemein=preis;
		team1=mannsch1;
		team2=Mannsch2;
		ausgabe();
		System.out.println("Es spielen "+team1+" gegen "+team2+" !!!");
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((kostenallgemein+MANNSCHAFTKOSTEN)/ANZTICKETS)*MWST*100; 	
		return Math.round(ticketpreis);
	}
	
}
