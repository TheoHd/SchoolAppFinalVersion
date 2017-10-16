package SchoolAppFinalVersion;

import java.util.Scanner;

public class Professeur extends Personne {
	
	//Variables
	private String diplome;
	private String matiere;
	
	//Class properties
	public Professeur(){
		super();
		this.diplome= "" ;
		this.matiere= "";
	}
	
	//Getters & setters
	public String getDiplome(){
		 return this.diplome;
	}
	public String getFonction(){
		 return this.matiere ;
	}
	public void setAge(String pDiplome){
		 this.diplome = pDiplome ;
	}
	public void setFonction(String pFonction){
		 this.matiere = pFonction ;
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
		super.saisirProfesseur();
		System.out.println("Veuillez saisir le diplôme du professeur :");
		this.diplome = this.sc.nextLine();
		System.out.println("Veuillez saisir les matières de maîtrise du professeur :");
		this.matiere = this.sc.nextLine();
		System.out.println("-----------------------");
		System.out.println(" ");
	}	
	public void afficher(){
		System.out.println(" ");
		System.out.println("-----------------------");
		super.afficherProfesseur();
		System.out.println("Diplôme du professeur :"+this.diplome);
		System.out.println("Matières du professeur :"+this.matiere);
		System.out.println("-----------------------");
		System.out.println(" ");
	}

}