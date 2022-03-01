package profesor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			
		Profesor profa = context.getBean("pythonProfesor",Profesor.class);
		profa.pozdrav();
		profa.getPredmetKojiPredajem();
		
		 
		context.close();

	}

}
