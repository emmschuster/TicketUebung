public class TicketsMain {

	public static void main(String[] args) {
		SubKonzert k1=new SubKonzert("Muenchen", "PapaRoach ft BodyCout", 100);
		SubSport s1=new SubSport("Innsbruck", "Weltmeisterschaft", 150);
		SubTheater t1=new SubTheater("Kammerspiele", "Ritter der Kokosnuss",200);
		TicketShop shop= new TicketShop();
		shop.bestellen(k1);
		shop.bestellen(s1);
		shop.bestellen(t1);

		System.out.println("Anz Tickets zum auswählen "+shop.getAnz());
		System.out.println("guenstigstes ticket:"+shop.getGunstigstes());
		System.out.println("teuerstes ticket:"+shop.getTeuerstes());
	}
}