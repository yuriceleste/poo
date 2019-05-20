package exercicio14;

public class Cliente {
	private Contato contato;
	private String celular;
	private String endereco;
	private Double rendaFamiliar;
	private static final double VALORCLASSIFICACAO = 2000.00;
	private static double valorClassificacao = VALORCLASSIFICACAO;
	
	public Cliente(Contato _contato, String _celular, String _endereco, Double _rendaFamiliar) throws Exception {
		this.setContato(_contato);
		this.setCelular(_celular);
		this.setEndereco(_endereco);
		this.setRendaFamiliar(_rendaFamiliar);
	}
	
	public Cliente(String _email, String _nome, String _celular, String _endereco, Double _rendaFamiliar) throws Exception {
		this(new Contato(_email, _nome), _celular, _endereco, _rendaFamiliar);
	}
	
	public Cliente() throws Exception {
		this("","","","",0.0);
	}
	
	public Contato getContato() {
		return this.contato;
	}
	
	public void setContato(Contato _contato) {
		this.contato = _contato;
	}
	
	public String getCelular() {
		return this.celular;
	}
	
	public void setCelular(String _celular) {
		this.celular = _celular;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String _endereco) {
		this.endereco = _endereco;
	}
	
	public Double getRendaFamiliar() {
		return this.rendaFamiliar;
	}
	
	public void setRendaFamiliar(Double _rendaFamiliar) {
		this.rendaFamiliar = _rendaFamiliar;
	}
	
	public static double getValorClassificacao() {
		return Cliente.valorClassificacao;
	}
	
	public static void setValorClassificacao(double _valor) {
		Cliente.valorClassificacao = _valor;
	}
	
	public String categoriaCliente() {
		if(this.getRendaFamiliar() > Cliente.valorClassificacao) {
			return "Top";
		}
		return "Usual";
	}
	
	public static String categoriaCliente(Cliente cliente) {
		if(cliente.getRendaFamiliar() > Cliente.valorClassificacao) {
			return "Top";
		}
		return "Usual";
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getContato().getNome());
		dados.append("\n");
		dados.append(this.getContato().getEmail());
		dados.append("\n");
		dados.append(this.getCelular());
		dados.append("\n");
		dados.append(this.getEndereco());
		dados.append("\n");
		dados.append(this.getRendaFamiliar());
		dados.append("\n");
		dados.append(this.categoriaCliente());
		return dados.toString();
	}
	
}
