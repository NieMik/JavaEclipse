package de.NieMik.unterricht01;

public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double groesse=1.84;
		double gewicht=95;
		double bmi = gewicht / (groesse*groesse);
		
		System.out.println(bmi);
		
		if((bmi >= 20 ) && (bmi <=25 )){
			System.out.println(" GEILE SAU !!!");
		}else if (bmi<= 20){
			System.out.println("DU BIST VIEL ZU DÜNN !!! ISS WAS !!!! ");
		}else{
			System.out.println(" DU FETTE SAU !!! ");
		}
	}

}
