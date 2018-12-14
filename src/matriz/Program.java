package matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Linhas:");
		int i = sc.nextInt();
		System.out.println("Colunas:");
		int j = sc.nextInt();

		int matriz[][] = new int[i][j];

		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[a].length; b++) {
				System.out.println("Numeros da matriz:");
				matriz[a][b] = sc.nextInt();
			}
		}
		System.out.println("Numeor que deseja buscar:");
		int n = sc.nextInt();
		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[a].length; b++) {
				if (matriz[a][b] == n) {
					System.out.println("Posição " + a + "," + b + ": ");
					if (b > 0) {
						System.out.println("Esquerda: " + matriz[a][b- 1]);

					}
					if (a> 0) {
						System.out.println("Em cima:" + matriz[a - 1][b]);

					}
					if (b < matriz[a].length-1) {
						System.out.println("Direita: " + matriz[a][b + 1]);

					}
					if (a < matriz[a].length-1) {
						System.out.println("Em baixo: " + matriz[a + 1][b]);
					}
				}
			}
		}

		sc.close();
	}

}
