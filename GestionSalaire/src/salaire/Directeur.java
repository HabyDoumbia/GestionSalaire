package salaire;


public class Directeur implements IEntreprise {
	private int  indice;
	private double salairebase;
	private double primeimpot;
	
	
	public Directeur(int indice, double salairebase, double primeimpot) {
		super();
		this.indice = indice;
		this.salairebase = salairebase;
		this.primeimpot = primeimpot;
	}
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public double getSalairebase() {
		return salairebase;
	}

	public void setSalaireBase(double salairebase) {
		this.salairebase = salairebase;
	}

	public double getprimeimpot() {
		return primeimpot;
	}




	public void setBonus(double primeimpot) {
		this.primeimpot = primeimpot;
	}

	
	public double getSalaireDirecteur(){
		return getIndice()*getSalairebase()+getprimeimpot();
	}


	public void accept(Ivisiteur v) {
		
		v.VisitDirecteur(this);
		// TODO Auto-generated method stub
		
	}

}
