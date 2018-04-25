package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;

public class CalculService {

	private static final Logger LOG = LoggerFactory.getLogger(CalculService.class);

	public int additionner(String expression) {

		LOG.debug("Evaluation de l'expression" + expression);

		String[] tab = expression.split("\\+");

		int somme = 0;
		for (int i = 0; i < tab.length; i++) {

			try {
				somme += Integer.parseInt(tab[i]);
			}

			catch (Exception e) {
				throw new CalculException();
			}
		}
		return somme;

	}

}
