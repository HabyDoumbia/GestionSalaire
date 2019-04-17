package salaire;

public class Manager implements IEntreprise {
	private double indice;
	private double salairebase;
	private double primeimpot;
	
	public Manager(double indice, double salairebase, double primeimpot) {
		super();
		this.indice = indice;
		this.salairebase = salairebase;
		this.primeimpot = primeimpot;
	}
	
	public double getIndice() {
		return indice;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}

	public double getSalairebase() {
		return salairebase;
	}

	public void setSalaireBase(double salairebase) {
		this.salairebase = salairebase;
	}

	public double getPrimeimpot() {
		return primeimpot;
	}

	public void setPrimeimpot(double primeimpot) {
		this.primeimpot = primeimpot;
	}


	public double getSalaireManager(){
		return getIndice()*getSalairebase()+getPrimeimpot();
	}
	
	public void accept(Ivisiteur v) {
		v.VisitManager(this);
		// TODO Auto-generated method stub
		
	}

}
