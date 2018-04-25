package dev.console;

import dev.service.CalculService;

import java.util.Scanner;

public class App {

	private Scanner scanner;

	private CalculService calculatrice;

	public App(Scanner scanner, CalculService calculatrice) {

		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}

	protected void afficherTitre() {
	}

	public void demarrer() {
		afficherTitre();
	}

	protected void evaluer(String expression) {

	}

}