package exercicio14;

public class Email {
	private String descricaoEmail;
	
	public Email(String _descricaoEmail) throws Exception {
		this.setEmail(_descricaoEmail);
	}
	
	public Email() throws Exception {
		this("");
	}
	
	public String getEmail() {
		return this.descricaoEmail;
	}
	
	public void setEmail(String _descricaoEmail) throws Exception {
		if(Email.isEmailValido(_descricaoEmail) == true) {
			this.descricaoEmail = _descricaoEmail;
		}else {
			throw new Exception("Email inválido.");
		}
	}
	
	public static boolean isEmailValido(String _descricaoEmail) {
		int pos = _descricaoEmail.indexOf("@");
		if(pos != 0) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getEmail());
		return dados.toString();
	}
	
}
