package exercicio19;

public class CilindroEscalavel implements ObjetoTridimensional,Escalavel{
	private Ponto3D centro;
	private double raio;
	private double altura;
	
	public CilindroEscalavel(Ponto3D _centro, double _raio, double _altura) throws Exception {
		this.centro = _centro;
		this.raio = _raio;
		this.altura = _altura;		
	}
	
	public Ponto getCentro() {
		return this.centro;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public double getAltura() {
		return this.altura;
	}

	@Override
	public void amplia(double _escala) throws Exception {
		this.raio *= _escala;
		this.altura *= _escala;
	}

	@Override
	public void espelha() throws Exception {
		this.centro = new Ponto3D(this.centro.getX()*(-1), this.centro.getY(), this.centro.getZ());
	}

	@Override
	public Ponto3D centro() throws Exception {
		return this.centro;
	}

	@Override
	public double calculaSuperficie() {
		return 2 * Math.PI * this.getRaio() * this.getAltura();
	}

	@Override
	public double calculaVolume() {
		return Math.PI * Math.pow(this.getRaio(), 2) * this.getAltura();
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.centro.getX());
		dados.append(",");
		dados.append(this.centro.getY());
		dados.append(",");
		dados.append(this.centro.getZ());
		dados.append(")");
		dados.append(" - ");
		dados.append(this.getRaio());
		dados.append(" - ");
		dados.append(this.getAltura());
	 	return dados.toString();
	}


}
