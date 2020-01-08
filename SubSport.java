public class SubSport extends Ticket {
	private final int ANZTICKETS = 1000;
	private double kostenallgemein;
	private final double MWST = 0.2;
	private final double MANNSCHAFTKOSTEN = 1000;

	public SubSport(String ort, String name, double preis) {
		super(ort, name, preis);
		kostenallgemein = preis;
		System.out.println("Sport");
		System.out.println("=====");
		berechneTicketpreis();
		ausgabe();
	}

	public void berechneTicketpreis() {
		setTicketPrice(Math.round(((kostenallgemein + MANNSCHAFTKOSTEN) / ANZTICKETS) * MWST * 100));
	}

}
