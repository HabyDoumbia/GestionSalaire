package salaire;

public class Teste {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculSalaire salaire = new CalculSalaire();
		
		Directeur directeur = new Directeur(4,300000,150000);
		directeur.accept(salaire);
		
		Manager manager = new Manager(4,150000,150000);
		manager.accept(salaire);
		
		Commerciaux commerciaux = new Commerciaux(300000);
		commerciaux.accept(salaire);
		
		Ouvrier ouvrier = new Ouvrier(5000, 30);
		ouvrier.accept(salaire);
		
		System.out.println("Le salaire du Directeur est: "+directeur.getSalaireDirecteur());
		System.out.println("Le salaire du Manager est: "+manager.getSalaireManager());
		System.out.println("Le salaire du Commerciaux est: "+commerciaux.getSalaireCommerciaux());
		System.out.println("Le salaire du Ouvier est: "+ouvrier.getSalaireOuvrier());



	}

}
