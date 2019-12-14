abstract class Ticket {
	private String veranstalungsort;
	private String veranstaungsname;
	private int basispreis;
	protected double ticketpreis;

	public Ticket(String ort, String name, int preis) {
		veranstalungsort=ort;
		veranstaungsname=name;
		basispreis=preis;
	}
	
	abstract double berechneTicketpreis();

	abstract void ausgabe();

	public int getBasispreis() {
		return basispreis;
	}
}
