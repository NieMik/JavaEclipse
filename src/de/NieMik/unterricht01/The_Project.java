package de.NieMik.unterricht01;
import java.util.Scanner;

public class The_Project {

    public static void main(String[] args) {

        // Scanner zum Auslesen der Eingabe (in Textform)
        Scanner sc = new Scanner(System.in);
        // Variable eingabe zum "Speichern" der Texteingabe
        String eingabe;

        // Position des Spielers
        int x=2;
        int y=2;
       
        // Lebensenergie des Spieler
        int lebensenergie=3;
       
        boolean schadenerlitten=false;
       
        // Abbruchmöglichkeiten
        boolean schleife=true;
        boolean zielerreicht=false;
        boolean tot=false;
        // Karte
        // Erste eckige Klammer für die Zeilen Y
        // Zweite eckige Klammer für die Zeilen X
        int map[][]  = {
                {1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,2,0,1,0,0,1,0,0,0,0,0,1},
                {1,0,0,1,0,5,0,0,1,1,1,0,1},
                {1,0,1,0,0,1,0,0,1,0,0,0,1},
                {1,4,0,0,3,1,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1}
                };

        do {
          
        System.out.println("--------------------------------");
        System.out.println("Lebensenergie: "+lebensenergie);
        System.out.println("--------------------------------");
           
        // Schleife in Schleife für die ganze Karte zum Ausgeben
        // i entspricht Y
        for (int i=0;i<map.length;i++) {
            // X
            for (int j=0;j<map[i].length;j++) {

                // Wenn der Spieler an der aktuellen Position
                // ist wird ein @ ausgegeben (als Spieler)
                if ((y==i) && (x==j)) {
                    System.out.print("☺");
                    
                    
                   
                    // Wenn ich auf E stehe (Also Ende!)
                    if (map[i][j]==3) {
                        schleife=false;
                        zielerreicht=true;
                    }
                   
                    // Wenn ich auf eine Falltür trete
                    if (map[i][j]==4) {
                        schadenerlitten=true;
                        lebensenergie--;
                        if (lebensenergie<1) {
                            schleife=false;
                            tot=true;
                        }
                        
                    }  
                    
                    if(map[i][j]==5){
                    	schadenerlitten=true;
                    	lebensenergie--;
                    	if (lebensenergie<1){
                    		schleife=false;
                    		tot=true;
                   
                    }
                        
                        
                    }
                }
                // ansonsten die Karte ausgeben
                else
                    switch (map[i][j]) {
                        // NIX
                        case 0:		System.out.print(" ");
                                break;
                        // WAND
                        case 1:		System.out.print("#");
                                break;
                        // START
                        case 2:		System.out.print("S");
                                break;
                        // ENDE
                        case 3:		System.out.print("E");
                                break;
                        // PIT/FALLTÜR
                        case 4:		System.out.print("☠");
                        		break;
                        case 5:		System.out.print("☣");
                                break;
                        default:	System.out.print("☺");
                    }
                //System.out.print(map[i][j]);
            }
            System.out.println();
        }
      
        if (schadenerlitten) {
            System.out.println("Dickes AUA Lebensenergie -1");
            schadenerlitten=false;
        }
       
        // wenn ich noch in der Schleife sein darf!
        if (schleife) {
            System.out.println("Wohin mein Meister?");
            // Eingabe des Spielers!
            eingabe = sc.next();
           
            // was wurde eingegeben ?
            switch (eingabe) {
            // Eingabe von w (also nach oben gehen)
            case "w" :   
                // Befindet sich an der zukünftigen Position eine Wand ?
                // Wenn nein dann gehe eins nach oben (y=y-1)
                if (map[y-1][x]!=1) {
                    y--;
                }
                // Ansonsten vor die Wand rennen!
                else {
                    System.out.println("AUA!");
                }
                break;
            case "s" :   
                if (map[y+1][x]!=1) {
                    y++;
                }
                else {
                    System.out.println("AUA!");
                }
                break;
            case "a" :   
                if (map[y][x-1]!=1) {
                    x--;
                }
                else {
                    System.out.println("AUA!");
                }
                break;
            case "d" :   
                if (map[y][x+1]!=1) {
                    x++;
                }
                else {
                    System.out.println("AUA!");
                }
                break;
            case "q" :
                schleife=false;
                break;
            default:
            }
        }
       
        // Manuels Tipp für die Beendigung des Spiels mit q :)
        } while (schleife);
      
        if (zielerreicht) {
            System.out.println("Zitat Hankook: 'Gut gemacht!'");
        }
       
        if (tot) {
            System.out.println("Pech gehabt, du Lappen !!!");
        }
     }
}