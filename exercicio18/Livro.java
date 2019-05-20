package exercicio18;

public class Livro {
	private String titulo, autor;
	private int numeroPaginas, anoEdicao;
	
	public Livro(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao) {
		this.setTitulo(_titulo);
		this.setAutor(_autor);
		this.setNumeroPaginas(_numeroPaginas);
		this.setAnoEdicao(_anoEdicao);
	}
	
	public Livro() {
		this("","",0,0);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	public int getAnoEdicao() {
		return this.anoEdicao;
	}
	
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	
	public void setAutor(String _autor) {
		this.autor = _autor;
	}
	
	public void setNumeroPaginas(int _numeroPaginas) {
		this.numeroPaginas = _numeroPaginas;
	}
	
	public void setAnoEdicao(int _anoEdicao) {
		this.anoEdicao = _anoEdicao;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getTitulo());
		dados.append("; ");
		dados.append(this.getAutor());
		dados.append("; ");
		dados.append(this.getNumeroPaginas());
		dados.append("; ");
		dados.append(this.getAnoEdicao());
		dados.append(";");
		return dados.toString();
	}
	
}
