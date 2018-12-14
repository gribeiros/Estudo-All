package listaFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import listaFuncionarios.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		Funcionario funcionario;

		System.out.println("Quantidade que quer registrar:");
		int q = sc.nextInt();

		for (int a = 0; a < q; a++) {
			System.out.println("ID:");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome:");
			String name = sc.nextLine();
			System.out.println("Salario:");
			Double salario = sc.nextDouble();
			list.add(new Funcionario(id, name, salario));

		}

		System.out.println();
		System.out.println("Id do funcionario do acrescimo:");
		int id = sc.nextInt();
		funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (funcionario == null) {
			System.out.println("Entre com um ID valido");
		} else {
			System.out.println("Porcentagem de acrescimo:");
			double porcentagem = sc.nextDouble();
			funcionario.aSalario(porcentagem);
		}
		System.out.println();

		for (Funcionario x : list) {
			System.out.println(x);
		}

		sc.close();
	}
}
