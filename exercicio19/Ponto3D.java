package exercicio19;

public class Ponto3D extends Ponto {
	private double z;
	
	public Ponto3D(double _x, double _y, double _z) throws Exception {
		super(_x,_y);
		this.setZ(_z);
	}
	
	public Ponto3D() throws Exception {
		this(0,0,0);
	}
	
	public double getZ() {
		return this.z;
	}
	
	public void setZ(double _z) throws Exception {
		if(Ponto.isLimite(_z)) 	
			this.z = _z;
     	else
        	throw new Exception ("valor de Z fora dos limites");
	}
	
  	public Ponto clonar() throws Exception {
     	return new Ponto3D(super.getX(), super.getY(), this.getZ());
   	}
   	public Ponto criaSwap() throws Exception {
     	return new Ponto3D(super.getY(), super.getX(), this.getZ());
   	}
   	public boolean temEixoComum(Ponto3D _ponto){
     	return super.getX() == _ponto.getX() || super.getY() == _ponto.getY() || this.getZ() == _ponto.getZ();
   	}

   	public String toString(){
	 	StringBuilder dados = new StringBuilder();
	 	dados.append("(");
	 	dados.append(this.getX());
	 	dados.append(",");
	 	dados.append(this.getY());
	 	dados.append(",");
	 	dados.append(this.getZ());
	 	dados.append(")");
	 	return dados.toString();
   	}

}
