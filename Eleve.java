package SchoolAppFinalVersion;

import java.util.Scanner;

public class Eleve extends Personne {
	
	//Variables
	private int age;
	private String tuteur;
	
	//Class properties
	public Eleve(){
		super();
		this.age= 10 ;
		this.tuteur = "";
	}
	
	//Getters & setters
	public int getage(){
		 return this.age ;
	}
	public String gettuteur(){
		 return this.tuteur ;
	}
	public void setage(int page){
		 this.age = page ;
	}
	public void settuteur(String ptuteur){
		 this.tuteur = ptuteur ;
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
		super.saisirEleve();
		System.out.println("Veuillez saisir votre âge :");
		this.age = this.sc.nextInt();
		this.sc.nextLine();
		System.out.println("Veuillez saisir votre tuteur :");
		this.tuteur = this.sc.nextLine();
		System.out.println("-----------------------");
		System.out.println(" ");
	}	
	public void afficher(){
		System.out.println(" ");
		System.out.println("-----------------------");
		super.afficherEleve();
		System.out.println("Âge de l'utilisateur :"+this.age);
		System.out.println("Tuteur de l'utilisateur :"+this.tuteur);
		System.out.println("-----------------------");
		System.out.println(" ");
	}

}