package de.NieMik.Tut01_Nils;

public class Arrays {
	public static void main (String[] arg){
		int[] a = new int[4];
		a[0] = 87;
		a[1] = 99;
		a[2] = 77;
		a[3] = 11;
		kassenzettel (a);
	}
	public static void kassenzettel (int[] a){
		int summe = 0;
		for(int b = 0; b < a.length; b++){
			summe += a[b];
			System.out.println(a[b]);
		}
		System.out.println("---");
		System.out.println(summe);
	}
}
