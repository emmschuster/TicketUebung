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

	public void ausgabe() {
		System.out.println("Name der Veranstaltung : " + veranstaungsname);
		System.out.println("Ort : " + veranstalungsort);
		System.out.println("Preis eines Tickets : " + ticketpreis);
	}
	
	public int getBasispreis() {
		return basispreis;
	}
}
