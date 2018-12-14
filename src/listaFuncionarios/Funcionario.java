package listaFuncionarios;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salario;

	public Funcionario(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public double aSalario(double porcentagem) {
		return salario += salario * porcentagem / 100.00;
	}

	public String toString() {
		return String.format("Id:%d%nNome:%s%nSalario:%.2f%n", id, name, salario);
	}

}
