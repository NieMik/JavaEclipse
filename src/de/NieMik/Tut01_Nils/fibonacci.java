package de.NieMik.Tut01_Nils;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1;
		double b = 1;
		
		for(int c = 0; c < 100; c++){
			 a = a + b;
			 System.out.println(a);
			 b = b + a;
			 System.out.println(b);
		}
	}

}
