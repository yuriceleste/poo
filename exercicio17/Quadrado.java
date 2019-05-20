package exercicio17;

public class Quadrado {
	private Ponto p;
	private double comprimento;
	private double espessura;
	private boolean solido;
	
	public Quadrado(Ponto _p, double _comprimento, double _espessura, boolean _solido) {
		this.setPontoQuadrado(_p);
		this.setComprimento(_comprimento);
		this.setEspessura(_espessura);
		this.setSolido(_solido);
	}
	
	public Quadrado(double _a1, double _a2, double comprimento, double _espessura, boolean _solido) {
		this(new Ponto(new Coordenada(_a1), new Coordenada(_a2)), comprimento, _espessura, _solido);
	}
	
	public Quadrado(Coordenada _c1, Coordenada _c2, double comprimento, double _espessura, boolean _solido) {
		this(new Ponto(_c1, _c2), comprimento, _espessura, _solido);
	}
	
	public Quadrado() {
		this(new Ponto(0,0),0,0,false);
	}
	
	public Ponto getPontoQuadrado() {
		return this.p;
	}
	
	public double getComprimento() {
		return this.comprimento;
	}
	
	public double getEspessura() {
		return this.espessura;
	}
	
	public boolean getSolido() {
		return this.solido;
	}
	
	public void setPontoQuadrado(Ponto _p) {
		this.p = _p;
	}
	
	public void setComprimento(double _comprimento) {
		this.comprimento = _comprimento;
	}
	
	public void setEspessura(double _espessura) {
		this.espessura = _espessura;
	}
	
	public void setSolido(boolean _solido) {
		this.solido = _solido;
	}
	
	public static double perimetroQuadrado(double _comprimento) {
		return _comprimento*4;
	}
	
	public double perimetroQuadrado() {
		return this.getComprimento()*4;
	}
	
	public static double areaQuadrado(double _comprimento) {
		return Math.pow(_comprimento, 2);
	}
	
	public double areaQuadrado() {
		return Math.pow(this.getComprimento(), 2);
	}
	
	public boolean equals(Object objeto) {
		Quadrado aux = (Quadrado)objeto;
		if( this.getPontoQuadrado() == (aux.getPontoQuadrado())	&&
				this.getComprimento() == (aux.getComprimento())	&&
				this.getEspessura() == (aux.getEspessura())		&&
				this.getSolido() == (aux.getSolido()) ) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.getPontoQuadrado().getC1());
		dados.append(",");
		dados.append(this.getPontoQuadrado().getC2());
		dados.append(",");
		dados.append(this.getComprimento());
		dados.append(")");
		return dados.toString();
	}
}
