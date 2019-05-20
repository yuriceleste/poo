package exercicio17;

public class Circulo {
	private Ponto p;
	private double raio;
	private double espessura;
	private boolean solido;
	
	public Circulo(Ponto _p, double _r, double _espessura, boolean _solido) {
		this.setPontoCirculo(_p);
		this.setRaio(_r);
		this.setEspessura(_espessura);
		this.setSolido(_solido);
	}
	
	public Circulo(double _a1, double _a2, double _r, double _espessura, boolean _solido) {
		this(new Ponto(new Coordenada(_a1), new Coordenada(_a2)), _r, _espessura, _solido);
	}
	
	public Circulo(Coordenada _c1, Coordenada _c2, double _r, double _espessura, boolean _solido) {
		this(new Ponto(_c1, _c2), _r, _espessura, _solido);
	}
	
	public Circulo() {
		this(new Ponto(0,0),0,0,false);
	}
	
	public Ponto getPontoCirculo() {
		return this.p;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public double getEspessura() {
		return this.espessura;
	}
	
	public boolean getSolido() {
		return this.solido;
	}
	
	public void setPontoCirculo(Ponto _p) {
		this.p = _p;
	}
	
	public void setRaio(double _r) {
		this.raio = _r;
	}
	
	public void setEspessura(double _espessura) {
		this.espessura = _espessura;
	}
	
	public void setSolido(boolean _solido) {
		this.solido = _solido;
	}
	
	public static double perimetroCirculo(double _r) {
		return 2*Math.PI*_r;
	}
	
	public double perimetroCirculo() {
		return 2*Math.PI*this.getRaio();
	}
	
	public static double areaCirculo(double _r) {
		return Math.PI*Math.pow(_r,2);
	}
	
	public double areaCirculo() {
		return Math.PI*Math.pow(this.getRaio(),2);
	}
	
	public boolean equals(Object objeto) {
		Circulo aux = (Circulo)objeto;
		if( this.getPontoCirculo() == (aux.getPontoCirculo())	&&
				this.getRaio() == (aux.getRaio())				&&
				this.getEspessura() == (aux.getEspessura())		&&
				this.getSolido() == (aux.getSolido()) ) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.getPontoCirculo().getC1());
		dados.append(",");
		dados.append(this.getPontoCirculo().getC2());
		dados.append(",");
		dados.append(this.getRaio());
		dados.append(")");
		return dados.toString();
	}
}