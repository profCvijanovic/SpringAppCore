package profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class JavaProfesor implements Profesor{
	@Value("Perica")
	private String ime;
	@Autowired	
	private Predmet predmet;
	
	public Predmet getPredmet() {
		return predmet;
	}
	
	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	@Override
	public void pozdrav() {
		System.out.println("Pozdrav od profesora " + getIme());
	}

	@Override
	public void getPredmetKojiPredajem() {
		predmet.dajMiPredmet();	
	}

}
