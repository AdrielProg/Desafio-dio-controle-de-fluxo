package application;

import java.util.Scanner;

import exeception.InvalidParametersException;

public class FlowControlChallenge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();

		try {
			count(parametroUm, parametroDois);
		} catch (InvalidParametersException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

	public static void count(int numberOne, int numberTwo) throws InvalidParametersException {

		int score = numberTwo - numberOne;
		if (numberTwo > numberOne) {
			for (int i = 1; i <= score; i++) {
				System.out.println("Imprimindo o número: " + i);
			}
		} else {
			throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro");

		}
	}

}
