package quartos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rent[] rent = new Rent[10];
		System.out.println("Quantidade de quartos:");
		int quantidaDeQ = sc.nextInt();

		for (int i = 1; i <= quantidaDeQ; i++) {
			System.out.println("Escolha o quarto:");
			int qn = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("E-mail:");
			String email = sc.next();
			rent[qn] = new Rent(nome, email, qn);

		}
		
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				System.out.printf("Registro %d:%n",i);
				System.out.println(rent[i]);
			}
		}

		sc.close();

	}
}