package exercicio14;

public class Contato {
	private String nome;
	private Email email;

	
	public Contato(String _nome, String _email) throws Exception {
		this.setEmail(new Email(_email));
		this.setNome(_nome);
	}

	
	public Contato() throws Exception {
		this("","");
	}
	
	public Email getEmail() {
		return this.email;
	}
	
	public void setEmail(Email _email) {
		this.email = _email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getNome());
		dados.append("\n");
		dados.append(this.getEmail());
		return dados.toString();
	}
}
