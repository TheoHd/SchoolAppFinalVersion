package gestionEcoleFinalVersion;

import java.util.Scanner;

public class Main{ 
	
	//Functions
	public static int convertir(){
		Scanner scan = new Scanner(System.in);
	    String testi = scan.nextLine();
	    scan.close();
	    char[] ascii1 = testi.toCharArray();
	    for(char ch:ascii1){
	        return (int)ch;
	    }
	    return 0;		    
	}
	
	//Launch
	public static void main(String[] args){	// TODO Auto-generated method stub		
		Ecole monEcole = new Ecole();
		monEcole.menu();
	}
	
}