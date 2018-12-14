package quartos;

public class Rent {
	private String name;
	private String email;
	private int quarto;
	
	public Rent(String name, String email,int quarto) {
		this.name = name;
		this.email = email;
		this.quarto = quarto;
	}

	public String getName() {
		return name;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String toString() {
		return String.format("Nome: %s %nE-mail: %s %nQuarto: %d%n",name,email,quarto);
	}

	
}
