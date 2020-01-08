import java.util.ArrayList;

public class TicketShop {
	ArrayList<Ticket> meineListe = new ArrayList<Ticket>(); 

	public void bestellen (Ticket x) {
		meineListe.add(x);
	}
	public int getAnz() {
		return meineListe.size();
	}
	public double getGunstigstes() {
		double teuer=500;
		for (int i = 0; i<=getAnz(); i++) {
			if (meineListe.get(i).getPreis() < teuer) {
				teuer=meineListe.get(i).getPreis();
			}
		}
		return teuer;
	}
	public double getTeuerstes() {
		double billig=0;
		for (int i = 0; i<=getAnz(); i++) {
			if (meineListe.get(i).getPreis() > billig) {
				billig=meineListe.get(i).getPreis();
			}
		}
		return billig;
	}
}
