package exercicio18;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
	private boolean statusEmprestimo;
	private String localizacao, descricao;
	
	public LivroDeBiblioteca(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao,
			boolean _statusEmprestimo, String _localizacao, String _descricao) {
		super(_titulo, _autor, _numeroPaginas, _anoEdicao);
		this.setStatusEmprestimo(_statusEmprestimo);
		this.setLocalizacao(_localizacao);
		this.setDescricao(_descricao);
	}
	
	@Override
	public boolean isEmprestado() {
		return getStatusEmprestimo();
	}

	@Override
	public void empresta() {
		if(isEmprestado() == false) {
			this.setStatusEmprestimo(true); //BIBLIOTECA EMPRESTOU O LIVRO
		}
	}

	@Override
	public void devolve() {
		if(isEmprestado() == true) {
			this.setStatusEmprestimo(false); //BIBLIOTECA EMPRESTOU O LIVRO
		}
	}

	@Override
	public String localiza() {
		return this.getLocalizacao();
	}

	@Override
	public String apresentaDescricao() {
		return this.getDescricao();
	}
	
	
	public boolean getStatusEmprestimo() {
		return this.statusEmprestimo;
	}
	
	public String getLocalizacao() {
		return this.localizacao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setStatusEmprestimo(boolean _statusEmprestimo) {
		this.statusEmprestimo = _statusEmprestimo;
	}
	
	public void setLocalizacao(String _localizacao) {
		this.localizacao = _localizacao;
	}
	
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	
	public String toString() {
		return super.toString()+
				"\n"+
				this.getStatusEmprestimo() +
				"; "+
				this.getLocalizacao() +
				"; " +
				this.getDescricao();
	}

}
