package gestionEcoleFinalVersion;
import java.util.Scanner;

public abstract class Personne {
	
	//Variables
	protected int id;
	protected String nom;
	protected String prenom;
	protected Scanner sc = new Scanner(System.in);
	
	//Class properties
	public Personne(){
		this.id= 1 ;
		this.nom = "";
		this.prenom = "";
	}
	
	//Getters & setters
	public int getid(){
		 return this.id ;
	}
	public String getnom(){
		 return this.nom ;
	}
	public String getprenom(){
		 return this.prenom ;
	}
	public void setid(int pid){
		 this.id = pid ;
	}
	public void setnom(String pnom){
		 this.nom = pnom ;
	}
	public void setprenom(String pprenom){
		 this.prenom = pprenom ;
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
	public void saisirProfesseur(){
		System.out.println("Veuillez saisir l'id du professeur: ");
		this.id = this.sc.nextInt();
		this.sc.nextLine();
		System.out.println("Veuillez saisir le nom du professeur: ");
		this.nom = this.sc.nextLine();
		System.out.println("Veuillez saisir le prénom du professeur");
		this.prenom = this.sc.nextLine();
	}
	public void saisirEleve(){
		System.out.println("Veuillez saisir l'id de l'enfant: ");
		this.id = this.sc.nextInt();
		this.sc.nextLine();
		System.out.println("Veuillez saisir le nom de l'enfant: ");
		this.nom = this.sc.nextLine();
		System.out.println("Veuillez saisir le prénom de l'enfant: ");
		this.prenom = this.sc.nextLine();

	}	
	public void afficherProfesseur(){
		System.out.println("Id du professeur :"+this.id);
		System.out.println("Nom du professeur:"+this.nom);
		System.out.println("Prénom du professeur :"+this.prenom);
	}
	public void afficherEleve(){
			System.out.println("Id de l'élève :"+this.id);
			System.out.println("Nom de l'élève :"+this.nom);
			System.out.println("Prénom de l'élève:"+this.prenom);
		}

}