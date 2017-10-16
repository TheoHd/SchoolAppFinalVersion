package gestionEcoleFinalVersion;
import java.util.Scanner;

public class Ecole {
	
	//Variables
	private String nom;
	private String adresse;
	private String directeur;
	private Classe classe[] = new Classe[20];
	public int nombreClasse = 0;
	private Scanner sc = new Scanner(System.in);
	
	//Class properties
	public Ecole(){
		this.nom= "Aucun nom donné" ;
		this.adresse= "Aucune adresse donnée";
		this.directeur= "Aucun directeur assigné";
	}
	
	//Functions
	public int convertir(){
		Scanner scan = new Scanner(System.in);
	    String testi = scan.nextLine();
	    scan.close();
	    char[] ascii1 = testi.toCharArray();
	    for(char ch:ascii1){
	        return (int)ch;
	    }
	    return 0;		    
	}
	
	//Procedures
	public void saisir(){
		System.out.println(" ");
		System.out.println("------------------------");
		System.out.print("Veuillez saisir le nom de votre école: ");
		this.nom = this.sc.nextLine();
		System.out.print("Veuillez saisir l'adresse de votre école: ");
		this.adresse = this.sc.nextLine();
		System.out.print("Veuillez saisir la directrice de votre école: ");
		this.directeur = this.sc.nextLine();
		System.out.println("------------------------");
		System.out.println(" ");
	}
	public void afficher(){
		System.out.println(" ");
		System.out.println("--- INFOS DE L'ECOLE ---");
		System.out.println("Nom de l'école: "+this.nom);
		System.out.println("Adresse de l'école: "+this.adresse);
		System.out.println("Directeur de l'école: "+this.directeur);
		System.out.println("------------------------");
		System.out.println(" ");
		try{
			Thread.currentThread();
			Thread.sleep(2000);
		} 
		catch(Exception e){
			
		}		
		System.out.flush();
	}
	public void ajouter(){
		if (this.nombreClasse < 20){
			Classe classe = new Classe();
			classe.saisir();
			classe.menu();
			this.classe[this.nombreClasse] = classe;
			this.nombreClasse++;
			System.out.println("La classe a bien été ajouté");
		}
		else{
			System.out.println("La classe est pleine");
		}		
		try{
			Thread.currentThread();
			Thread.sleep(3000);
		} 
		catch(Exception e){}
	}	
	public void afficherTout(){
		this.afficher();
		System.out.println(" ");
		System.out.println("--- INFOS DES CLASSES ---");
		for (int i = 0 ; i < this.nombreClasse; i++){
			System.out.println("Numéro de la classe:"+(i+1));
			this.classe[i].afficher();
		}
		System.out.println("-------------------------");
		System.out.println(" ");
	}
	public void afficherToutEnseignant(){
		this.afficher();
		System.out.println(" ");
		System.out.println("--- INFOS DES PROFESSEURS ---");
		for (int i = 0 ; i < this.nombreClasse; i++){
			this.classe[i].afficherProfesseur();
		}
		System.out.println("-----------------------------");
		System.out.println(" ");
	}		
	public void effacer(){
			String nom = "";
			int i = 0;
			boolean trouve = false; 
			System.out.println("Saisir le nom de la classe à supprimer :");
			nom = this.sc.nextLine();
			this.sc.nextLine();
			while(i < this.nombreClasse && trouve == false){
				if(nom == this.classe[i].getNom())
					trouve = true; 
				else 
					i++;
			}
			if(trouve==true){
				System.out.println("La classe a ete supprimé");
				this.classe[i] = this.classe[this.nombreClasse-1];
				this.nombreClasse--;
			}
			else{
				System.out.println("Aucune classe ne correspond");
			}
	}
	public void menu(){
		//Procedure variables
		int select = 0;
		
		//Menu
		do{
			System.out.println("  ");
			System.out.println("------ MENU ECOLE ------");
			System.out.println("1: Afficher l'école");
			System.out.println("2: Mettre à jour les informations de l'école");
			System.out.println("3: Ajouter une classe");
			System.out.println("4: Supprimer une classe");
			System.out.println("5: Afficher toutes les classes de l'école");
			System.out.println("6: Afficher toutes les enseignants de l'école");
			System.out.println("0: Quitter");
			System.out.println("------------------------");
			System.out.println(" ");
			select = this.sc.nextInt();
			this.sc.nextLine();			
			switch(select)
			{
				case 1 : this.afficher(); break;
				case 2 : this.saisir(); break;
				case 3 : this.ajouter(); break;
				case 4 : this.effacer(); break;
				case 5:  this.afficherTout(); break;
				case 6:  this.afficherToutEnseignant(); break;
			}
		}while(select!=0);	
	}

}