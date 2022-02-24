package profesor;

public class Predmet {
	
	private String nazivPredmeta;
	
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public void dajMiPredmet() {
		System.out.println("Predmet koji predajem je: " + getNazivPredmeta());
	}

}
