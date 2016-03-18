package de.NieMik.unterricht01;

public class Unterricht1_1_Fibonacci {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			double a = 1;
			double b = 1;
//			Wichtig ist, dass man sich merkt: a=b+a; b=b+a
			
			for(int c = 0; c < 100; c++){
				 a = a + b;
				 System.out.println(a);
				 b = b + a;
				 System.out.println(b);
			}
		}
}