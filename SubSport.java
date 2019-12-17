public class SubSport extends Ticket{
	private final int ANZTICKETS = 1000;
	private final int KOSTENALGEMEIN = 1200;
	private final double MWST=0.2;
	private final double MANNSCHAFTKOSTEN=1000;
	public String team1, team2;

	public SubSport(String ort, String name, int preis, String mannsch1, String Mannsch2) {
		super(ort, name, preis);
		team1=mannsch1;
		team2=Mannsch2;
		System.out.println("Es spielen "+team1+" gegen "+team2+" !!!");
	}
	
	public double berechneTicketpreis() {
		this.ticketpreis=((getBasispreis()+KOSTENALGEMEIN+MANNSCHAFTKOSTEN)/ANZTICKETS)*MWST; 	
		return ticketpreis;
	}
	
}
