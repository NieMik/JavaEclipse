package de.NieMik.unterricht01;

import java.util.Scanner;

public class Unterricht1_5_Array_map {

	public static void main(String[] args) {
	
		
		int x=1;
		int y=1;

		Scanner sc = new Scanner(System.in);
		String a ;
		
		int map [][] = {
				{2, 4, 4, 4, 4, 4, 4, 4, 4, 6},
				{1, 0, 0, 0, 0, 45, 2, 6, 0, 1},
				{1, 0, 2, 4, 4, 4, 3, 1, 0, 1},
				{1, 0, 5, 4, 4, 4, 4, 3, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
				{1, 0, 2, 4, 4, 6, 0, 0, 0, 1},
				{1, 0, 1, 0, 0, 1, 0, 0, 0, 1},
				{1, 0, 5, 4, 4, 3, 0, 0, 0, 1},
				{1, 0, 0, 0,45, 0, 0, 0, 0, 1},
				{5, 4, 4, 4, 4, 4, 4, 4, 4, 3}
		};
		
		
		do {
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
			
				if((j==y) && (i==x)){
					System.out.print("X");
				}
				else {
					switch (map[i][j]){
					case 0: System.out.print(" ");
							break;
					case 1: System.out.print("|");
							break;
					case 2: System.out.print("┌");
							break;
					case 3: System.out.print("┘");
							break;
					case 4: System.out.print("─");
							break;
					case 5: System.out.print("└");
							break;
					case 6: System.out.print("┐");
							break;
					case 7: System.out.print("");
							break;
					default: System.out.print("@");
					}	
				}
			}
			System.out.println();
		}
					
		a = sc.next();
		
		switch (a){	
			case "w": 
				  if (map[y][x-1]!=1) {
		                x--;
		            }
		            // Ansonsten vor die Wand rennen!
		            else {
		                System.out.println("AUA!");
		            }
				break;
			case "s":  if (map[y][x+1]!=1) {
                x++;
            }
            // Ansonsten vor die Wand rennen!
            else {
                System.out.println("AUA!");
            }
			 	break;
			case "a":
				  if (map[y-1][x]!=1) {
		                y--;
		            }
		            // Ansonsten vor die Wand rennen!
		            else {
		                System.out.println("AUA!");
		            }
			 	break;
			case "d":
				  if (map[y+1][x]!=1) {
		                y++;
		            }
		            // Ansonsten vor die Wand rennen!
		            else {
		                System.out.println("AUA!");
		            }
			 	break;
			default: System.out.println("Bitte drücke 'w,a,s,d' und ENTER !");
		}
	}while (a!="q");
	}
}