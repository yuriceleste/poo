package exercicio17;

public class Ponto {
	private Coordenada c1, c2;
	
	public Ponto(Coordenada _c1, Coordenada _c2) {
		this.setPonto(_c1,_c2);
	}
	
	public Ponto(double a1, double a2) {
		this(new Coordenada(a1),new Coordenada(a2));
	}

	public Ponto() {
		this(0,0);
	}
	
	public Coordenada getC1() {
		return this.c1;
	}
	
	public Coordenada getC2() { 
		return this.c2;
	}
	
	public void setPonto(Coordenada _c1, Coordenada _c2) {
		this.c1 = _c1;
		this.c2 = _c2;
	}
	
	public boolean equals(Object objeto) {
		Ponto aux = (Ponto)objeto;
		if( this.getC1() == (aux.getC1()) &&
				this.getC2() == (aux.getC2())) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.getC1());
		dados.append(",");
		dados.append(this.getC2());
		dados.append(")");
		return dados.toString();
	}
}
