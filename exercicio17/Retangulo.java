package exercicio17;

public class Retangulo extends Quadrado{
	private double largura;
	
	public Retangulo(Ponto _p, double _comprimento, double _largura, double _espessura, boolean _solido) {
		super.setPontoQuadrado(_p);
		super.setComprimento(_comprimento);
		super.setEspessura(_espessura);
		super.setSolido(_solido);
		this.setLargura(_largura);
	}
	
	public Retangulo(double _a1, double _a2, double comprimento, double _largura, double _espessura, boolean _solido) {
		this(new Ponto(new Coordenada(_a1), new Coordenada(_a2)), comprimento, _largura, _espessura, _solido);
	}
	
	public Retangulo(Coordenada _c1, Coordenada _c2, double comprimento, double _largura, double _espessura, boolean _solido) {
		this(new Ponto(_c1, _c2), comprimento, _largura, _espessura, _solido);
	}
	
	public Retangulo() {
		this(new Ponto(0,0),0,0,0,false);
	}
	
	public double getLargura() {
		return this.largura;
	}
	
	public void setLargura(double _largura) {
		this.largura = _largura;
	}

	public static double perimetroRetangulo(double _comprimento, double _largura) {
		return _largura*2 + _comprimento*2;
	}
	
	public double perimetroRetangulo() {
		return this.getLargura()*2 + super.getComprimento()*2 ;
	}
	
	public static double areaRetangulo(double _comprimento, double _largura) {
		return _largura * _comprimento;
	}
	
	public double areaRetangulo() {
		return this.getLargura() * super.getComprimento();
	}
	
	public boolean equals(Object objeto) {
		Retangulo aux = (Retangulo)objeto;
		if( this.getPontoQuadrado() == (aux.getPontoQuadrado())	&&
				super.getComprimento() == (aux.getComprimento())	&&
				this.getLargura() == (aux.getLargura())	&&
				super.getEspessura() == (aux.getEspessura())		&&
				super.getSolido() == (aux.getSolido()) ) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(super.getPontoQuadrado().getC1());
		dados.append(",");
		dados.append(super.getPontoQuadrado().getC2());
		dados.append(") - (");
		dados.append(super.getComprimento());
		dados.append(",");
		dados.append(this.getLargura());
		dados.append(")");
		return dados.toString();
	}
	
}
