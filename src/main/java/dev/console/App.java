package dev.console;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.CalculService;

public class App {

	private Scanner scanner;

	private CalculService calculatrice;
	
	private static final Logger LOG = LoggerFactory.getLogger(App.class);


	public App(Scanner scanner, CalculService calculatrice) {

		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}

	protected void afficherTitre() {
		LOG.info("**** Application Calculatrice ****"); 

	}

	public void demarrer() {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			LOG.info("Veuillez saisir une expression;");
			String expression = scanner.next();
			if(expression.equals("fin"))
				LOG.info("Au revoir :-(");
			else evaluer(expression);
			
		}
		
	}

	protected void evaluer(String expression) {
				
		LOG.info(expression + "=" + calculatrice.additionner(expression));
		
		
	}

}