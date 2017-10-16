package SchoolAppFinalVersion;
import java.util.Scanner;

public class Classe{
	
	//Variables
	private String nom;
	private int salle;
	private String niveau;
	private Eleve eleve[] = new Eleve[30];
	private Professeur professeur = new Professeur();
	private int nombreEleve = 0;
	private Scanner sc = new Scanner(System.in);

	//Class properties
	public Classe(){
		this.nom= "" ;
		this.salle= 0;
		this.niveau= "";
	}
	
	//Getters & setters
	public String getNom(){
		 return this.nom;
	}
	public int getSalle(){
		 return this.salle ;
	}
	public String getNiveau(){
		 return this.niveau ;
	}
	public void setNom(String nom){
		 this.nom = nom ;
	}
	public void setSalle(int salle){
		 this.salle = salle ;
	}
	public void setNiveau(String pNiveau){
		 this.niveau = pNiveau ;
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
		System.out.println("-----------------------");
		System.out.println("Veuillez saisir le nom de la classe :");
		this.nom = this.sc.nextLine();
		System.out.println("Veuillez saisir le numéro de la salle de la classe :");
		this.salle = this.sc.nextInt();
		this.sc.nextLine();
		System.out.println("Veuillez saisir le niveau scolaire de la classe :");
		this.niveau = this.sc.nextLine();
		this.professeur.saisir();
		System.out.println("-----------------------");
		System.out.println(" ");
	}	
	public void ajouter(){
		if (this.nombreEleve < 30){
			Eleve addEleve = new Eleve();
			addEleve.saisir();
			this.eleve[this.nombreEleve] = addEleve;
			this.nombreEleve++;
			System.out.println("L'enfant a bien été ajouté");
			System.out.println("-----------------------");
			System.out.println(" ");
		}
		else{			
			System.out.println("Impossible d'ajouter l'enfant, la classe est complète.");
			System.out.println("-----------------------");
			System.out.println(" ");
		}		
		try{
			Thread.currentThread();
			Thread.sleep(2000);
		} 
		catch(Exception e){
			
		}		
		System.out.flush();
	}		
	public void afficher(){
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println("Nom de la classe :"+this.nom);
		System.out.println("La salle est :"+this.salle);
		System.out.println("Votre niveau :"+this.niveau);
		System.out.println("Le professeur est :");
		this.professeur.afficher();
		System.out.println("Les élèves sont:");
		for (int i = 0 ; i < this.nombreEleve; i++){
			System.out.println("Numéro de la classe:"+(i+1));
			this.eleve[i].afficher();
		}
		System.out.println("-----------------------");
		System.out.println(" ");
	}
	public void afficherProfesseur(){
		this.professeur.afficher();
	}	
	public void afficherTout(){
		System.out.println(" ");
		System.out.println("-----------------------");
		this.afficher();
		System.out.println("La classe est composée de :");
		for (int i = 0 ; i < this.nombreEleve; i++){
			this.eleve[i].afficher();
		}
		System.out.println("-----------------------");
		System.out.println(" ");

	}		
	public void effacer(){
		int id;
		int i = 0;
		boolean trouve = false;
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println("Saisir l'id de l'enfant à supprimer :");
		id = this.sc.nextInt();
		this.sc.nextLine();
		while(i < this.nombreEleve && trouve == false){
			if(id == this.eleve[i].getid()){
				trouve = true; 
			}
			else{ 
				i++;
			}
		}
		if(trouve==true){
			System.out.println("L'enfant a ete supprimé");
			this.eleve[i] = this.eleve[this.nombreEleve-1];
			this.nombreEleve--;
			System.out.println("-----------------------");
			System.out.println(" ");
		}
		else{
			System.out.println("Personne ne correspond");
			System.out.println("-----------------------");
			System.out.println(" ");
		}
	}
	public void trouver(){
		int id;
		int i = 0;
		boolean trouve = false;
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println("Saisir l'id de l'enfant à trouver :");
		id = this.sc.nextInt();
		this.sc.nextLine();
		while(i < this.nombreEleve && trouve == false){
			if(id == this.eleve[i].getid()){
				trouve = true; 
			}
			else{
				i++;
			}
		}
		if(trouve == false){
			System.out.println("Aucun élève ne correspond");
			System.out.println("-----------------------");
			System.out.println(" ");
		}
		else{
			this.eleve[i].afficher();
			System.out.println("-----------------------");
			System.out.println(" ");
		}
	}
	public void menu(){
		//Procedure variables
		int select = 0; 
		//Menu
		do{
			System.out.println("----- MENU CLASSE -----");
			System.out.println("1: Ajouter un éleve");
			System.out.println("2: Rechercher un éleve");
			System.out.println("3: Saisir un éleve");
			System.out.println("4: Supprimer un éleve");
			System.out.println("0: Quitter");
			System.out.println("-----------------------");
			System.out.println(" ");
			select = this.sc.nextInt();
			this.sc.nextLine();			
			switch (select)
			{
				case 1 : this.ajouter(); break;
				case 2 : this.trouver(); break;
				case 3 : this.saisir(); break;
				case 4:  this.effacer(); break;
			}
		}while(select!=0);	
	}

}