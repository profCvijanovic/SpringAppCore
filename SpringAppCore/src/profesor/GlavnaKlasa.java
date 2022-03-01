package profesor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			
		Profesor profa = context.getBean("profaPython",Profesor.class);
		profa.pozdrav();
		profa.getPredmetKojiPredajem();
		
		
		 Profesor profDrugi = context.getBean("profaPython",Profesor.class);
		 profDrugi.pozdrav(); 
		 profDrugi.getPredmetKojiPredajem();
		 
		
		System.out.println("Profa: " + profa);
		System.out.println("Profa drugi: " + profDrugi);
		 
		context.close();

	}

}
