package profesor;

public class JavaProfesor implements Profesor{
	
	private String ime;
		
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
