package salaire;

public class Ouvrier implements IEntreprise {
	private double salairebase;
	private double NbHeure;	
	public Ouvrier(double salairebase, double nbheure) {

		this.salairebase = salairebase;
		this.NbHeure = nbheure;
	}

	public double getSalaireBase() {
		return salairebase;
	}

	public void setSalaireBase(double salairebase) {
		this.salairebase = salairebase;
	}

	public double getNbHeure() {
		return NbHeure;
	}

	public void setNbHeure(double nbHeure) {
		NbHeure = nbHeure;
	}

	public double getSalaireOuvrier(){
		return getSalaireBase()*getNbHeure()+5000;
	}

	public void accept(Ivisiteur vst) {
		// TODO Auto-generated method stub
		vst.VisitOuvriers(this);
		
	}


}
