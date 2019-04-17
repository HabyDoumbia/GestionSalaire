package salaire;


public class CalculSalaire implements Ivisiteur {
private double salaire;
	
	

	public CalculSalaire() {
		this.salaire = 0;
	}
	
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public void VisitDirecteur(Directeur dir) {
		// TODO Auto-generated method stub
		
		this.setSalaire(dir.getSalaireDirecteur());
		
	}

	@Override
	public void VisitManager(Manager man) {
		// TODO Auto-generated method stub
		this.setSalaire(man.getSalaireManager());
		
	}

	@Override
	public void VisitCommerciaux(Commerciaux com) {
		// TODO Auto-generated method stub
		this.setSalaire(com.getSalaireCommerciaux());
		
	}


	@Override
	public void VisitOuvriers(Ouvrier ouv) {
		// TODO Auto-generated method stub
		
		this.setSalaire(ouv.getSalaireOuvrier());
		
	}

}


