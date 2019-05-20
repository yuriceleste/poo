package exercicio17;

public class Coordenada {
	private double a;
	
	public Coordenada() {
		this.setA(0);
	}
	public Coordenada(double a) {
		this.setA(a);
	}
	
	public double getA() {
		return this.a;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public boolean equals(Object objeto) {
		Coordenada aux = (Coordenada)objeto;
		if( this.getA() == (aux.getA()) &&
				this.getA() == (aux.getA())) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getA());
		return dados.toString();
	}
	
}
