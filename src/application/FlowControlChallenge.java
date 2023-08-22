package application;

import java.util.Scanner;

import exception.InvalidParametersException;

public class FlowControlChallenge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entre com o primeiro parâmetro:");
			int parameterOne = sc.nextInt();
			System.out.println("Entre com o segundo parâmetro (deve ser maior que o primeiro): ");
			int parameterTwo = sc.nextInt();

			count(parameterOne, parameterTwo);

		} catch (InvalidParametersException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		} finally {
			sc.close();
		}
	}

	public static void count(int numberOne, int numberTwo) throws InvalidParametersException {
		if (numberTwo <= numberOne) {
			throw new InvalidParametersException("O segundo parametro deve ser maior que o primeiro");
		}
		int score = numberTwo - numberOne;

		for (int i = 1; i <= score; i++) {
			System.out.println("Imprimindo números: " + i);
		}
	}
}
