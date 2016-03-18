package de.NieMik.Tut01_Nils;

public class Methods {
	
	public static void main(String[] args) {
		cowsay ( "Nils ist ein Schinken" );
	}
	public static void cowsay (String s){
		System.out.print("  ");
		for(int i = 0; i < s.length(); i++ ){
			System.out.print("-");
			
		}
		 System.out.println("\n< " + s + " >");
		 System.out.print("  ");
			for(int i = 0; i < s.length(); i++ ){
				System.out.print("-");
				
			}
	}
	
}
