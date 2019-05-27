package exercicio19;

public class RetanguloEscalavel implements ObjetoGeometrico,Escalavel{
	private Ponto p_sup_esq;
	private Ponto p_inf_dir;
	
	public RetanguloEscalavel(Ponto p1, Ponto p2) throws Exception {
		this.setRetangulo(p1,p2);
	}
	
	public RetanguloEscalavel(double x1, double y1, double x2, double y2) throws Exception {
		Ponto p_sup_esq = new Ponto(x1,y1);
		Ponto p_inf_dir = new Ponto(x2,y2);
		this.setRetangulo(p_sup_esq,p_inf_dir);
	}
	
	public RetanguloEscalavel() throws Exception {
		Ponto p_sup_esq = new Ponto();
		Ponto p_inf_dir = new Ponto();
		this.setRetangulo(p_sup_esq, p_inf_dir);
	}
	
	// GET and SET
	public Ponto getPSupEsq() {
		return this.p_sup_esq;
	}
	
	public Ponto getPInfDir() {
		return this.p_inf_dir;
	}
	
	public void setRetangulo(Ponto p1, Ponto p2) throws Exception {
		this.p_sup_esq = p1;
		this.p_inf_dir = p2;
	}
	// FIM GET and SET
	
	public double comprimento() {
		return this.p_sup_esq.getY() - this.p_inf_dir.getY();
	}
	
	public double largura() {
		return this.p_inf_dir.getX() - this.p_sup_esq.getX();
	}
	@Override
	public void amplia(double _escala) throws Exception {
		this.p_sup_esq.setY(getPSupEsq().getY() * _escala);	//Alterando a altura do retangulo
		this.p_inf_dir.setY(getPInfDir().getX() * _escala);	//Alterando a largura do retangulo
	}

	@Override
	public void espelha() throws Exception {
		this.p_sup_esq.setX(this.p_sup_esq.getX()*(-1));
		this.p_inf_dir.setX(this.p_sup_esq.getX()*(-1));
	}

	@Override
	public Ponto centro() throws Exception {
		double x = (getPInfDir().getX() - getPSupEsq().getX()) / 2;
		double y = (getPSupEsq().getY() - getPInfDir().getY()) / 2;
		Ponto p_centro = new Ponto(x,y);
		return p_centro;
	}

	@Override
	public double calculaÁrea() {		
		return comprimento() * largura();
	}

	@Override
	public double calculaPerímetro() {
		return (2*comprimento())+(2*largura());
	}
	

	@Override
	public ObjetoGeometrico clona() throws Exception{
		RetanguloEscalavel raio = new RetanguloEscalavel(this.p_sup_esq.getX(), this.p_sup_esq.getY(), this.p_inf_dir.getX(), this.p_inf_dir.getY());
		return raio;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.p_sup_esq.getX());
		dados.append(",");
		dados.append(this.p_sup_esq.getY());
		dados.append(")");
		dados.append(" - ");
		dados.append("(");
		dados.append(this.p_inf_dir.getX());
		dados.append(",");
		dados.append(this.p_inf_dir.getY());
		dados.append(")");
	 	return dados.toString();
	}
}
