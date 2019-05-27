package exercicio19;

public class Esfera implements ObjetoTridimensional{
	private Ponto3D p;
	private double raio;
	
	public Esfera(double _x, double _y, double _z, double _raio) throws Exception{
		this.p = new Ponto3D(_x, _y, _z);
		this.setRaio(_raio);
	}
	public double getRaio() {
		return this.raio;
	}
	public Ponto3D getPonto() {
		return this.p;
	}
	public void setRaio(double _raio) {
		this.raio = _raio;
	}
	@Override
	public Ponto3D centro() throws Exception {
		return this.getPonto();
	}
	@Override
	public double calculaSuperficie() {
		return (4 * Math.pow(Math.PI, 2));
	}
	@Override
	public double calculaVolume() {
		return ((4/3) * Math.pow(this.getRaio(), 3));
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.p.getX());
		dados.append(",");
		dados.append(this.p.getY());
		dados.append(",");
		dados.append(this.p.getZ());
		dados.append(")");
		dados.append(" - ");
		dados.append(this.getRaio());
		return dados.toString();
	}
}