package profesor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class PythonProfesor implements Profesor {
	
	private Predmet predmet;
	
	@Autowired
	public PythonProfesor(Predmet predmet) {
		this.predmet = predmet;
	}

	@Override
	public void pozdrav() {
		System.out.println("Pozdrav od profesora Pythona!");
	}

	@Override
	public void getPredmetKojiPredajem() {
		predmet.dajMiPredmet();
	}
	@PostConstruct
	public void initMetoda() {
		System.out.println("Preuzmi jezik...");
	}
	@PreDestroy
	public void destroyMetoda() {	
		System.out.println("Zatvaram sve konekcije...");
	}

}
