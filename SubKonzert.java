public class SubKonzert extends Ticket{
	private final int ANZTICKETS = 1000;
	private final int KOSTENALGEMEIN = 1200;
	private final double MWST=0.2;
	private final double BANDKOSTEN=700;

	public void berechneTicketpreis() {
		ticketpreis=((getBasispreis()+KOSTENALGEMEIN+BANDKOSTEN)/ANZTICKETS)*MWST; 		
	}

}
