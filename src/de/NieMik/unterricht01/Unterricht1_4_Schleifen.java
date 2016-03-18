package de.NieMik.unterricht01;

public class Unterricht1_4_Schleifen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		YOLO
		
			for(int i = 0; i<=100; i++){
				System.out.println( i + ": ICH DARF NICHT LAUT SEIN ! ");
			}
			 int b = 0;
			while (b<10){
				System.out.println( b + ": ICH DARF NICHT LAUT SEIN ! ");
			b++;
			}
			
//			Immer "int" defienieren --> b=0;
//			
			
			int c=0;
			do{
				c++;
				System.out.println( c + ": ICH DARF NICHT LAUT SEIN ! ");
				
			}while(c<10);
	}

}
