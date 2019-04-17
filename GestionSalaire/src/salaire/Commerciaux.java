package salaire;

public class Commerciaux implements IEntreprise {
private double primevente;
	
	public Commerciaux(double primevente) {
		super();
		this.primevente = primevente;
	}
	
	



	public double getPrimevente() {
		return primevente;
	}





	public void setPrimeVente(double primevente) {
		this.primevente = primevente;
	}

	public double getSalaireCommerciaux(){
		return getPrimevente()+10000;
	}



	public void accept(Ivisiteur v) {
		// TODO Auto-generated method stub
		
		v.VisitCommerciaux(this);
		
	}

}
