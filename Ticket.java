abstract class Ticket {
	private String veranstalungsort;
	private String veranstaungsname;
	private double basispreis;
	private double ticketPreis;
	
	public Ticket(String ort, String name, double preis) {
		veranstalungsort=ort;
		veranstaungsname=name;
		basispreis=preis;
	}
	
	abstract void berechneTicketpreis();

	public void ausgabe() {
		System.out.println("Name der Veranstaltung : " + veranstaungsname);
		System.out.println("Ort : " + veranstalungsort);
		System.out.println("Preis eines Tickets : " + getTicketPrice() +"EUR\n");
	}
	
	public double getBasispreis() {
		return basispreis;
	}
	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPreis = ticketPrice;
	}
	public double getTicketPrice() {
		return ticketPreis;
	}
	
}
