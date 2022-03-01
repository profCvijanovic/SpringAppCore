package profesor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Predmet {
	
	@Value("Python")
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
