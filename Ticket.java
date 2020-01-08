abstract class Ticket {
	private String veranstalungsort;
	private String veranstaungsname;
	private double basispreis;
	
	public Ticket(String ort, String name, double preis) {
		veranstalungsort=ort;
		veranstaungsname=name;
		basispreis=preis;
	}
	
	abstract double berechneTicketpreis();

	public void ausgabe() {
		System.out.println("Name der Veranstaltung : " + veranstaungsname);
		System.out.println("Ort : " + veranstalungsort);
		System.out.println("Preis eines Tickets : " + berechneTicketpreis() +"EUR\n");
	}
	
	public double getBasispreis() {
		return basispreis;
	}
	
	public double getPreis() {
		return berechneTicketpreis();
	}
}
