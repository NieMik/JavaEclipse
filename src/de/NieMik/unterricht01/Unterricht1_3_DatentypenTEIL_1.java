package de.NieMik.unterricht01;

public class Unterricht1_3_DatentypenTEIL_1 {
 public static String hallo = " Hallo ";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean a = true;
		boolean i = false;
		char b = 'b';
		byte c = 1;
		short d = 34;
		int e = 33;
		long f = 24;
		float g = 3463;
		double h = 55.43;
		System.out.println("boolean = " + a);
		System.out.println();
		System.out.println("char: " + b);
		System.out.println();
		System.out.println("byte: " + c);
		System.out.println();
		System.out.println("short: " + d);
		System.out.println();
		System.out.println("int: " + e);
		System.out.println();
		System.out.println("long: " + f);
		System.out.println();
		System.out.println("float: " + g);
		System.out.println();
		System.out.println("double: " + h);
		System.out.println();
		System.out.println("boolean = " + i);
		System.out.println();
		System.out.println("String: " + hallo);	
		System.out.println();
		System.out.println("Das HIER ist der SHORT addiert mit dem BYTE = " + c + d);
		System.out.println();
		System.out.println();
		System.out.println( "HIER der INTERGER addiert mit dem FLOAT und dem LONG = " + e + f + g);
		System.out.println();
		System.out.println("HIER wurde der BYTE mit dem LONG subtrahiert = " +(d - e));
	}

}
